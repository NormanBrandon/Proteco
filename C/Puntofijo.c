  //PUNTO FIJO
#include<stdio.h>
#include<math.h>
int main(int argc, char const *argv[]) {
  float dx,x,xi,error=1,emax;
  int i=1;
//derivada-g'(x)=sqrt(2)*cos(xi);
//funcion-g(x)=sqrt(2)*sin(xi);
      printf("Programa metodo del punto fijo\n");
      printf("Ingrese el valor inicial:\n");
      scanf("%f",&xi);
      printf("Ingrese el error maximo:\n");
      scanf("%f",&emax);
//Probamos la convergencia del metodo en el PUNTO
      dx=sqrt(2)*cos(xi);
        if((dx<1) && (dx>-1)){
          printf("El metodo converge con k= %f\n",dx);
          while(error>emax){
              x=sqrt(2)*sin(xi);
              error=(x-xi)/x;
              if(error<0)
                error=error*-1;
              xi=x;
              i++;
              printf("\nIteracion numero:%d",i);
              printf("\nx=%f error=%f\n",x,error);
            }}
        else
        printf("\nEl metodo no converge, k=%f\n\n",dx);
  return 0;
}
