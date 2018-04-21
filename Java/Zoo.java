public class Zoo{
	public static void main(String[] args) {
		Zologico z = new Zologico();
		z.agregarAnimal(new Jirafa());
		z.agregarAnimal(new Leon());
		for (int i=0 ;i<z.numero; i++) {
			Animal a = z.animales[i];
			a.alimentar(new Carne());
			a.alimentar(new Manzana());
			if (a instanceof Leon){
			Leon l = (Leon) a;
			l.rugir();}
		}
	}
}