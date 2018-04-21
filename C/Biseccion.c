#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main(){
  int i=1;
  float a,b,xm,fb,error=1,aux,fa,fm,emax;
  printf("\t\t\t*****Programa del metodo de bissección*****\n\n");
  printf("La funcion es raiz(x)-2cosx=0\n");
  printf("Ingrese el intervalo\n");
  scanf("%f",&a);
  scanf("%f",&b);
  printf("Ingrese el error maximo\n");
  scanf("%f",&emax);
  fa=pow(a,3)-7*pow(a,2)+14*(a)-(6);
  fb=pow(b,3)-7*pow(b,2)+14*(b)-(6);
  while(error>emax){
  if((fa*fb)<0){
    fa=pow(a,3)-7*pow(a,2)+14*(a)-(6);
    fb=pow(b,3)-7*pow(b,2)+14*(b)-(6);
    xm=(a+b)/2;
    fm=pow(xm,3)-7*pow(xm,2)+14*(xm)-(6);
    printf("ITERACION NUMERO : %d",i);
    printf("\n\ta=%.5f\n\tb=%.5f\n\tf(a)=%.5f\n\tf(b)=%.5f \n\txm= %.5f\n\tf(xm)= %.5f",a,b,fa,fb,xm,fm);


      if(fm<0){
        if(fa<0)
        {error=(((xm-a)/xm));a=xm;}
        else
        {error=(((xm-b)/xm));b=xm;}
      }
      else{
        if(fa>0)
        {error=(((xm-a)/xm));a=xm;}
        else
        {error=(((xm-b)/xm));b=xm;}
      }
      if (error<0)
      error=error*-1;
      printf("\n\terror= %.5f\n",error);
      i++;

}
  else
  {printf("El intervalo no contiene una raiz\nPresione enter para continuar....");
  getchar();
  break;}
}
return 0;
}
