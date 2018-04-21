#include <stdio.h>
#include <string.h>
int i,j,k,large,salir=0;
char cadena[100],abc[50];
main(){
printf("\nIngrese una palabra\n");
gets(cadena);
large=strlen(cadena);
abc[0]=cadena[0];
for(i=1;i<=large;i++){

	abc[i]=cadena[i];
	for(j=0;j<i;j++)
	{
	if(abc[j]==cadena[i])
	{salir=1;}
		}
if(salir==1)
break;
	}
if(salir==1){
printf("true\n");}

else{
printf("false\n");}

}
