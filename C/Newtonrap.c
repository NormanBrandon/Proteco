#include<stdio.h>
#include<math.h>
int main(int argc, char const *argv[]) {
  float ddx,dx,fx,xi,x,error=1,emax,k;
  int i=1;
//funcion-f(x)=cos(x+sqrt(2))+0.5*pow(x,2)+sqrt(2)*x-sqrt(2);
//derivada-f'(x)=-sin(x+sqrt(2))+x+sqrt(2);
//segunda derivada-f"(x)=-cos(x+sqrt(2)+1)

      printf("Ingrese el valor inicial:\n");
      scanf("%f",&xi);
      printf("Ingrese el error maximo:\n");
      scanf("%f",&emax);
//Probamos la convergencia del metodo en el PUNTO
      ddx=-sin(xi)-pow(1/(sin(xi)),3)-pow((1/tan(xi)),2)*(1/sin(xi));
      dx=cos(xi)+(1/tan(xi))*(1/sin(xi));
      fx=sin(xi)-(1/sin(xi))+1;
      k=(fx*ddx)/pow(dx,2);
        if((k<1) && (k>-1)){
          printf("El metodo converge con k= %f\n",k);
          printf("fx=%f dx=%f ddx=%f",fx,dx,ddx);
          while(error>emax){
              x=xi-(fx/dx);
              error=(x-xi)/x;
              if(error<0)
                error=error*-1;
              xi=x;
              dx=cos(xi)+(1/tan(xi))*(1/sin(xi));
              fx=sin(xi)-(1/sin(xi))+1;
              printf("\nIteracion numero:%d",i);
              printf("\nx=%f error=%f\n",xi,error);
                  i++;


            }}
        else{
        printf("\nEl metodo no converge, k=%f\n\n",k);  printf("\nfx=%f dx=%f ddx=%f",fx,dx,ddx);}
  return 0;
}
