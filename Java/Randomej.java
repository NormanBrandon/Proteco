import java.util.Random;

public class Randomej{
	public static void main(String[] args){
	System.out.println("Esta es una prueba para arreglos");

	int[] a1 = new int[5];
	int[] a2 = new int[5];
	
	Random alea = new Random();

	for(int i=0;i < 5; i++){
		a1[i] = alea.nextInt(6);
		a2[i] = alea.nextInt(6);
	}

	for(int i=0; i< 5;i++){
		System.out.println(a1[i]);
		System.out.println(a2[i]);
	}
	}

}