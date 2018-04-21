import java.util.Scanner;

public class MetodosExcepcion{
	public void lanzarExcepcion() throws MiException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Presiona1 par lanzar la excepcion");
		int i = sc.nextInt();
		if (i==1) {
			throw new MiException();
			
		}

	}

}