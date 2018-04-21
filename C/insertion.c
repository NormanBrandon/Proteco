#include<stdio.h>
main(){
	FILE *archivo;
	int flag,i,arreglo[10],ordenado[10];

	archivo = fopen("numeros.txt","r");
	for(i=0; i<11; i++)
{
	fscanf(archivo,"%d ,",&arreglo[i]);
	printf("%d\n",arreglo[i]);
}
	while (flag==0)

	fclose(archivo);
	return 0;
}
