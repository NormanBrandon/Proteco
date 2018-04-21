public class foreach{
public static void main(String[] args) {

		int[] aray = {1,2,3,4,5,6,7,8,8};
		int total = 0;
		for(int i : aray){
			total+=i;

		} 
		System.out.println("El total de la suma del arreglo es: "+total);

	}
}