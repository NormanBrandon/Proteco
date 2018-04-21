#include <stdio.h>
#include <string.h>
#include <math.h>
#define p printf
main(){
int i,l1,l2,changes=0;
char cadena1[100],cadena2[100];
p("Ingrese una palabra\n");
gets(cadena1);
p("Ingrese la palabra modificada\n");
gets(cadena2);
l1=strlen(cadena1);
l2=strlen(cadena2);
if(fabs(l1-l2)>=2){
p("False");
goto salto;
}

for(i=0;i<l1;i++){
	if(cadena1[i]!=cadena2[i])
	changes++;
}
if(changes<2)
p("\nTrue\n");
else
p("\nFalse\n");
salto:
p("\nFin");

}
