#include <stdio.h>
#include <string.h>
int i,j,k,salir=0,large,num=0;largesp;
char cadena[100],sinesp[100];
main(){
printf("Ingrese una frase :v\n");
gets(cadena);
large=strlen(cadena);
j=0;
printf("\n%d",large);
for(i=0;i<large;i++)
	{
	if(cadena[i]!=' ')
	{
	sinesp[j]=cadena[i];
	j=j+1;
	}
	else
	num=num+1;
	}
	largesp=large-num;
	printf("\n%s\n",sinesp);
		for(i=0;i<largesp;i++)
		{
			if(sinesp[i]!=sinesp[largesp-i-1])
			{printf("\n%c %c\n",sinesp[largesp-i-1],sinesp[i]);
			salir++;}
			//
		}
				if (salir>=1)
				printf("\nFalse %d\n",salir);

				else
				printf("\nTrue%d\n",salir);
}
