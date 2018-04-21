//fputc poner caracteres
//strcat concatenar
#include <stdio.h>
#include <string.h>
main(){
char nombre[20];
char nombrecp[25];
char c;
int len,i;
printf("Deme el nombre del archivo");
gets(nombre);
len=strlen(nombre);

	for(i=0;i<len;i++){
	nombrecp[i]=nombre[i];
	}
strcat(nombrecp,"_copia");
FILE *file,*file1;
file=fopen(nombre,"r");
file1=fopen(nombrecp,"w");
	if(file==NULL)
	printf("El archivo no existe");
	else{

		while((c=fgetc(file))!=EOF){
		printf("%c",c);
		fputc(c,file1);
			}
		}

fclose(file);
fclose(file1);
return 0;

}
