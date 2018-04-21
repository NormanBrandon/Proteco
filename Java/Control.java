public class Control{
	private Encendible e1,e2;
	private Apagable a1;
	public Control(Encendible e1, Encendible e2,Apagable a1){
		this.e1=e1;
		this.e2=e2;
		this.a1=a1;
	}
	
	public void oprimirBoton1(){
		e1.encender();
	}
	public void oprimirBoton2(){
		e2.encender();
	}
	public void oprimirBoton3(){
		a1.apagar();
	}
}
