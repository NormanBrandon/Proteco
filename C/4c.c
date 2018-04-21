#include <stdio.h>
#include <string.h>
#define p printf
main(){
int i,large,j;
int n=0;
char cadena[100],niu[100],aux[1];
p("\tIngrese una cadena de caracteres\n");
gets(cadena);
large=strlen(cadena);
aux[0]=cadena[0];
j=0;
	for (i=0;i<=large;i++)
	{
	
		if(aux[0]==cadena[i]){
		aux[0]=cadena[i];
		n=n+1;
		}
		else{
		niu[j]=aux[0];
		j++;
		niu[j]=n+48;
		j++;
		n=1;
		aux[0]=cadena[i];
		}
		

	}
	p("\n%s\n",niu);
}
