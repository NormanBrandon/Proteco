#include<stdio.h>
#include<time.h>
#include<stdlib.h>
int main(){
  srand(time(NULL));
  int aleatorio = rand();
  FILE *archivo;
  archivo = fopen("numeros.txt","w");
  for(int i = 0; i < 10; i++)
  {
    fprintf(archivo,"%d,",rand()%10);
  }
  fclose(archivo);
  return 0;
}
