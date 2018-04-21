import java.util.Scanner;
public class Array{
	public static void main(String[] args){
	System.out.println("Esta es una prueba para arreglos");
	Scanner teclado = new Scanner(System.in);
	int[] arreglo1= new int[5];

	for(int i=0;i < arreglo1.length; i++){
		System.out.println("Ingresa el elemento"+i+": ");
		arreglo1[i] = teclado.nextInt();
	}
	System.out.println("Verificando el contenido del arreglo....");
	for(int i=0; i< arreglo1.length;i++)
		System.out.println("EL contenido del indice"+i+": "+arreglo1[i]);
	}

}