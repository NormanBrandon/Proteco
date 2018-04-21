#include<stdio.h>

main(){
	int aux,cont=0;
	int array[10]={4,6,7,3,2,6,8,9,3,1},i,j;
for(j=0;j<10;j++){
	for(i=0;i<10;i++){
		if (array[i] > array[i+1]){
		aux=array[i];
		array[i]=array[i+1];
		array[i+1]=aux;
		cont=cont+1;
		}
	}
	if (cont==0)
	break;
	else
	cont=0;
	}

	printf("El arreglo ordenado es:\n");
	for(i=0;i<11;i++){
	printf("%d ",array[i]);
	}
printf("\n");


}
