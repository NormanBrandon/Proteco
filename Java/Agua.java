public class Agua{

	public static void main(String[] args) {
	int[] array={0,1,0,2,1,0,1,3,2,1,2,1};
	System.out.println("Distribución");
	int water=0;

		//para cada elemento del arreglo imprimir una barra del grafico
	int comp=0;
	System.out.printf("%02d: ",0);
			
		for (int cont=0;cont < array.length ; cont++ ) {
	
			if(array[cont]>array[cont+1])
			water=array[cont]-array[cont+1];
			else
				water=0;
				for(int i=0; i < water; i++){
				System.out.printf("+");
				}
			System.out.printf("%02d: ",cont+1);
			//imprimir asteriscos deacuerdo al numero 
			for (int i=0;i<array[cont];i++ ) {
				System.out.printf("*");
			}
				System.out.printf("\n");	
			

			
	

		
		}	



	



	}

}