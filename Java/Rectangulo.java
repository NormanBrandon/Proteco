public class Rectangulo{
	double base;
	double altura;
	double perimetro;
	double area;
	Rectangulo(){
		this.base=10;
		this.altura=10;
	}

public double Area(){
area=base*altura;
return area;
}
public double Perimetro(){
perimetro=2*base + 2*altura;
return perimetro;
}
public double getBase(){
	return base;
}

public double getAltura(){
	return altura;
}

public void setBase(double base){
	this.base=base;
}

public void setAltura(double altura){
	this.altura=altura;
}
public void agrandar(double base, double altura){
	
	this.altura=altura;	
	this.base=base;

}

}