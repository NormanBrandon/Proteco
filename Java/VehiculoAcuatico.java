public class VehiculoAcuatico extends Vehiculo{

	String nombreAcuatico;
	public VehiculoAcuatico(String nombre){
		super(nombre);//super hace referencia a la clase padre, y super() al contructor de la clase padre
	}
	public void navegar(){
		System.out.println(super.transportar()+"Acuatico prro :)");
	}
}