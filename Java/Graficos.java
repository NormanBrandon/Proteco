public	class Graficos{

	public static void main(String[] args) {
		int[] array = {20,5,6,8,5,3,2,4,5,9,0};
		System.out.println("Distribución");


		//para cada elemento del arreglo imprimir una barra del grafico
		for (int cont=0;cont < array.length ; cont++ ) {
			if (cont==10) {
				System.out.printf("%5d",100);
			}
			else{
				System.out.printf("%02d-%02d: ",cont,cont*10);
			}
			//imprimir asteriscos deacuerdo al numero 
			for (int i=0;i<array[cont];i++ ) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			
		}
	}


}