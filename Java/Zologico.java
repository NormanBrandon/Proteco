public class Zologico{
	 private int n=10;
	 public Animal[] animales = new Animal[n];
	 public int numero;
	 public void agregarAnimal(Animal a){
	 	if (numero == n) {
	 		System.out.println("Zoologico lleno");
	 	}
	 	else{
	 		animales[numero] = a;
	 		numero++;
	 		}
	 	}

}