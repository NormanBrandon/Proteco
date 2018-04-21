import java.util.ArrayList;

public class CollectionArrayList{
	public static void main(String[] args) {
		ArrayList <String> elementos = new ArrayList<String>();
		elementos.add("Rojo");//Agrega un elemento al array lsit
		elementos.add(0,"Azul");
		for (int i=0;i< elementos.size() ;i++ ) {
			System.out.printf("%s\n",elementos.get(i));
		}
		elementos.remove("Azul");
		//					elementos.remove(1);
		
		System.out.println("Array modificado");

		for (int i=0;i< elementos.size() ;i++ ) {
			System.out.printf("%s\n",elementos.get(i));
		}
	}

}