public class Princi{
	public static void main(String[] args) {
		Control control = new Control(new Foco(),new Bomba(),new Computadora());
		control.oprimirBoton1();
		control.oprimirBoton2();
		control.oprimirBoton3();	
	}
}