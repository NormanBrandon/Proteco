public class Pokemon{
//	public String[] ataque=new String[4];
	public String nombre;
	public String tipo;
	public int nivel;
	public int vida;
	Pokemon(){
		vida=100;
		nivel=50;
	}
	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}
	public String getTipo(){
		return tipo;
	}
	public void setNivel(int nivel){
		this.nivel = nivel;
	}
	public int getNivel(){
		return nivel;
	}
	public void setNombre(String nombre){
	this.nombre = nombre;
	}
	public String getNombre(){
	return nombre;
	}
	public void setVida(int vida){
	this.vida = vida;
	}
	public int getVida(){
	return vida;
	}
}
