import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	Rectangulo R = new Rectangulo();
	int x,y;
	System.out.println("La base es:");
	System.out.println(R.getBase());
	System.out.println("La altura es:");
	System.out.println(R.getAltura());
	System.out.println("El area del rectangulo es");
	System.out.println(R.Area());
	System.out.println("El perimetro del rectangulo es");
	System.out.println(R.Perimetro());
	System.out.println("Ingrese nuevas dimensiones");
	System.out.println("x:  ");
	x= sc.nextInt();
	System.out.println("y:  ");
	y= sc.nextInt();
	R.setAltura(x);
	R.setBase(y);
	System.out.println("La base es:");
	System.out.println(R.getBase());
	System.out.println("La altura es:");
	System.out.println(R.getAltura());
	System.out.println("El area del rectangulo es");
	System.out.println(R.Area());
	System.out.println("El perimetro del rectangulo es");
	System.out.println(R.Perimetro());
	}

}