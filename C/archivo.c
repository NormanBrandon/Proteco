#include <stdio.h>
#include <string.h>
int main(){
	FILE *file;
/*	char *cadena;
	char cadena[]
	cadena=(char*)malloc(50*sizeof(char))
*/
	char cadena[50];
	file=fopen("Archivoeje","w");
	while(strcmp(cadena,"salir")){
	fscanf(stdin,"%s",cadena);
	fprintf(file,"%s",cadena);
	
	}
	
	fclose(file);
	return 0;

}
