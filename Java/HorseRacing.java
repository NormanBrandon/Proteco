import java.util.Scanner;
import java.util.Random;		/*LINEA AGREGADA*/
class HorseSelected{
	static String selectname="";
}
class Score{
	int position=0;
	static boolean winner=false;
}
class Horse implements Runnable {
	Score s=new Score();
	String horsename=null;
	Random rand=new Random();	/* LINEA AGREGADA */
	public Horse(String name){
		horsename=name;
	}
	public void run(){
		System.out.println(horsename+"Esta corriendo");
		try{
			for(int i=0;i<5;i++){
					Thread.currentThread().sleep(rand.nextInt(1000)); /*LINEA MODIFICA*/
					/*LO QUE PASA  ES QUE TODOS LLEGAN POR LA VELOCIDAD DEL PROCESADOR, PARA QUE NO
					 * PASE ESO TENEMOS QUE HACER UNOS DUERMAN MAS Y OTROS MENOS Y SE VEA QUE
					 * ALGUIEN GANO PUES AHORA SI SE EJECUTARIA EL METODO interrupt(), porque no se
					 * estaba ejecutando porque todos los hilos se estaban ejecutando 'al mismo
					 * tiempo'
					 *
					 * otra forma de hacerlo es en lugar de usar sleep() podriamos ir cambiando su
					 * prioridad de manera aleatoria*/
				s.position++;
				if(s.winner==false){
					System.out.println("posicion "+horsename+":"+s.position);
				}
				if((s.position==5) && (s.winner==false)){
					System.out.println(horsename+"gano");
					s.winner=true;
					if(HorseSelected.selectname.equals(horsename)){
						System.out.println("Te ganaste un pomo :)");
					}else{
						System.out.println("Me debes un pomo");
					}
					Thread.currentThread().interrupt();
				}
			}			
		}catch(Exception e){

		}
	}
}
public class HorseRacing {
	public HorseRacing(){
		System.out.println("Escoge un caballlo: 1.Horse1 2.Horse2 3.Horse3 : ");
		Scanner sc=new Scanner(System.in);
		String opcion=sc.nextLine();
		switch (opcion){
			case "1":
				HorseSelected.selectname="Horse1";
					break;
			case "2":
				HorseSelected.selectname="Horse2";
				break;
			case "3":
				HorseSelected.selectname="Horse3";
				break;
			default:
				System.out.println("Estas wey :c");
				break;
		}
		System.out.println("Comienza la carrera");
		Horse c1=new Horse("Horse1");
		Horse c2=new Horse("Horse2");
		Horse c3=new Horse("Horse3");
		
		new Thread(c1).start();
		new Thread(c2).start();
		new Thread(c3).start();

	}
	public static void main(String[] args) {
		HorseRacing carrera=new HorseRacing();
	}
}
