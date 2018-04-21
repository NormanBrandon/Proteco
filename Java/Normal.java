import java.util.Random;
import java.util.Scanner;
public class Normal{

	public static void main(String[] args) {
		int ndados,ntiros,tamaño,sumadados;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el numero de datos a tirar");
		ndados=teclado.nextInt();
		System.out.println("Ingrese el numero de veces que desea tirarlos");
		ntiros=teclado.nextInt();
		tamaño=ndados*6;
		int[] array= new int[tamaño];
		
		for (int j=0;j<tamaño ;j++ ) {
			array[j]=0;   					//Inicializamos en 0
		}

		Random alea = new Random(); //Iniciamos funcion random
		for (int i=0;i<ntiros ;i++ ) {
			sumadados=0;
				for (int j=0;j<ndados ;j++ ) {
					sumadados+=alea.nextInt(6);
				}
				array[sumadados]++;
			}


		System.out.println("Tirando 2 dados");
		System.out.println("Distribución");
		//para cada elemento del arreglo imprimir una barra del grafico
		for (int cont=0;cont < array.length ; cont++ ) {
					
				System.out.printf("%02d: ",cont+1);

			//imprimir asteriscos deacuerdo al numero 
			for (int i=0;i<array[cont];i++ ) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			
		}
	}
}