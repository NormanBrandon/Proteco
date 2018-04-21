public class Perro{

	public String nombre;
	public int edad;
	//constructor por defecto
	Perro(){

	}
	//Contructor creado
	Perro(String nombre, int edad){
		this.nombre =nombre;
		this.edad = edad;
	}



	public void traer(){
		System.out.println("Ahh perro traes el ocnitrix");

	}
	public String setNombre(String n){
		nombre = n ;
	}
	public String getNombre(){
		return nombre;	
	}
	public void setEdad(int e){
		edad = e;
	}
	

}
//boxing, unboxing, parse, casting