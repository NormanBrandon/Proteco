#include<stdio.h>
int main(){
int i;
int flag=1;
char cadena[10]="Hoperojoo";

while(flag!=0)
{
	if (cadena[i] == '\0'){
		flag=0;
	}
	else
i++;

}

printf("\nEl tamaño de la cadena es :%d \n",i);

return 0;
}