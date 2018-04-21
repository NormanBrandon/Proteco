#include<stdio.h>
#include<time.h>
#include<stdlib.h>
main(){
  FILE *archivo;
  archivo = fopen("numeros.txt","r");
    int tama=10;
    int array[10],i,j,k,mayor,ordenado[10];

    for(i=0; i<10; i++)
  {
  	fscanf(archivo,"%d ,",&array[i]);
  	printf("%d\n",array[i]);
  }
    mayor=array[0];
    for(i=0;i<tama;i++){
      if(array[i]>mayor)
      mayor=array[i];
    }
    printf("\n%d\n\n",mayor);
    int new[mayor];
    for(i=0;i<tama;i++){
      new[i]=0;
    }
      for(i=0;i<tama;i++){
        new[array[i]]++;
      }
      for(i=0;i<mayor;i++){
        printf("%d\n",new[i]);
      }
printf("\njeje");
        for(i=1;i<mayor;i++){
          new[i]=new[i-1]+new[i];
        }
        for(i=0;i<mayor;i++){
          printf("%d\n",new[i]);
        }
      for(i=0;i<10;i++){

        ordenado[new[array[i]]]=array[i];
        new[array[i]]--;
              }
      for(i=0;i<10;i++){
        printf("\norden=%d\n",ordenado[i]);
      }



}
