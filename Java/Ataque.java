public class Ataque{
		public int daño;
		public String nombre;
			public void setNombre(String nombre){
			this.nombre = nombre;
				}
			public String getNombre(){
			return nombre;
				}
				public void setDaño(int daño){
			this.daño = daño;
				}
			public int getDaño(){
			return daño;
				}
			public int atacar(){
				System.out.println("Atacando.....");
				return daño;
			}	
	}