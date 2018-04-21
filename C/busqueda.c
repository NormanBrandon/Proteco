#include<stdio.h>
#include<time.h>
#define p printf
main(){
clock_t inicio=clock();
int array[10]={1,2,3,4,5,6,7,8,9,10},i,j,k;
	for(i=0;i<11;i++)
		if(array[i] == 8)
		break;

clock_t fin=clock();
double tiempo=(double)(fin-inicio)/(CLOCKS_PER_SEC);
printf("%f segundos\n",tiempo);

}
