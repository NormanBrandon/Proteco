public	class Bidi{

	public static void main(String[] args) {
		int[][] arreglo1 ={{1,2,3},{4,5,6}};
		int[][] arreglo2 = new int[4][5];
			//NomClase[] arr = new NomClase[5];Arreglo de objetos


			arreglo2[0][0] = Integer.parseInt(args[0]);
			arreglo2[0][1] = Integer.parseInt(args[1]);
			System.out.println(arreglo2[0][0]);
			System.out.println(arreglo2[0][1]);
	}
}