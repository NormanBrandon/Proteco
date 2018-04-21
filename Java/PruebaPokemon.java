import java.util.Scanner;
public class PruebaPokemon{
	
	public static void main(String[] args){
		int daño=0;
		int selec;
		Pokemon Mewtwo = new Pokemon();
		Pokemon Rattata = new Pokemon();
		Rattata.setTipo("Normal");
		Mewtwo.setTipo("Psitico");
		Rattata.setNombre("Rattata");
		Mewtwo.setNombre("Mewtwo");
	System.out.println(Mewtwo.getNombre());	
	System.out.println(Mewtwo.getTipo());
	System.out.println(Rattata.getNombre());	
	System.out.println(Rattata.getTipo());
	Ataque Ataque_Psitico = new Ataque();
	Ataque_Psitico.setDaño(10);
	Ataque Rayo_Psitico = new Ataque();
	Rayo_Psitico.setDaño(40);
	Ataque Rapidez = new Ataque();
	Rapidez.setDaño(20);
	Ataque Explosion = new Ataque();
	Explosion.setDaño(30);
	Ataque Rugido_de_tiempo = new Ataque();
	Rugido_de_tiempo.setDaño(50);
	Ataque Sus_mentiras = new Ataque();
	Sus_mentiras.setDaño(99);


	Scanner sc = new Scanner(System.in);
	
	while (Mewtwo.getVida()>0 && Rattata.getVida()>0){

		System.out.println("Es turno de Mewtwo para atacar");
		System.out.println("Seleccione un ataque");
		System.out.printf("1)Ataque_Psitico\t 2)Rayo_Psitico\n3)Rapidez\t\t4)Explosion\n");
	
		selec= sc.nextInt();

		switch (selec)
	{
		case 1:{daño=Ataque_Psitico.atacar();
				break;}
		case 2:{daño=Rayo_Psitico.atacar();
				break;}
		case 3:{daño=Rapidez.atacar();
				break;}
		case 4:{daño=Explosion.atacar();
				break;}
		}

	Rattata.setVida(Rattata.getVida() - daño);
			if(Rattata.getVida()<0){
			System.out.println("Mewtwo gano");
			break;
		}
	System.out.println("Vida de Mewtwo ");
	System.out.println(Mewtwo.getVida());
	System.out.println("Vida de Rattata");
	System.out.println(Rattata.getVida());

		System.out.println("Es turno de Rattata para atacar");
		System.out.println("Seleccione un ataque");
		System.out.printf("1)Rugido_de_tiempo\t 2)Sus_mentiras\n3)Rapidez\t\t4)Explosion\n");
	
		selec= sc.nextInt();

		switch (selec)
	{
		case 1:{daño=Rugido_de_tiempo.atacar();
				break;}
		case 2:{daño=Sus_mentiras.atacar();
				break;}
		case 3:{daño=Rapidez.atacar();
				break;}
		case 4:{daño=Explosion.atacar();
				break;}
		}

	Mewtwo.setVida(Mewtwo.getVida() - daño);
		if(Mewtwo.getVida()<0){
			System.out.println("Rattata gano");
			break;
		}
	System.out.println("Vida de Mewtwo ");
	System.out.println(Mewtwo.getVida());
	System.out.println("Vida de Rattata");
	System.out.println(Rattata.getVida());


		}
	}

}