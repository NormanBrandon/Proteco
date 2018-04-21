import java.util.Scanner;	
import java.util.InputMismatchException;
public class ArrayE{
	public static void main(String[] args){
	/*	try{
			int[] numeros = {1,2,3,4};
			System.out.println(numeros[8]);
			System.out.println("Todo bien");
		}
		catch(ArrayIndexOutOfBoundsException aioobe){
			System.out.println("We, no mames, no puedes meter eso we");

		}*/
		Scanner sc = new Scanner(System.in);

		int x,y;
		System.out.println("Ingresa un numero");

		try{
			x=sc.nextInt();
		}
		catch(InputMismatchException ime){
			System.out.println("No se ingreso un numero, imbecil");
		}
		finally{
			System.out.println("Siempre se ejecuta prro");
			x=4;
		}
		String cadena;
		System.out.println("Ingresa un numero para");
		try{
			sc.nextLine();
			cadena = sc.nextLine();
			y = Integer.parseInt(cadena);
			System.out.println("El resultado es: "+(x/y));}
		catch(NumberFormatException nfe){
			System.out.println("No se ingreso un numero we, ya no mames, hazlo bien");
		}
		catch(ArithmeticException ae){
			System.out.println("No se puede dividir entre 0 we, ya no mames");
		}
		
	}

}