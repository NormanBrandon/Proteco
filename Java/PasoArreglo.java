public class PasoArreglo{
	public static void main(String[] args) {
	
	int[] arreglo={1,2,3,4,5};
	System.out.println("Efecto de pasar una referencia de un arreglo");
	for(int i=0; i<arreglo.length; i++)
		System.out.println("arreglo["+i+"]: "+arreglo[i]);

		modificar(arreglo);

	for(int i=0; i<arreglo.length; i++)
		System.out.println("arregloModificado["+i+"]: "+arreglo[i]);
		}
	public static void modificar(int[] a){
		for (int i=0;i<a.length ;i++ ) {
			a[i]*=5;
		}


	} 

}