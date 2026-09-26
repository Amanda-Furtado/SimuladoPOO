package q2;


public class Retangulo{
	private double largura;
	private double altura;

	public Retangulo(){
		largura = altura = 1.0;
	}
	
	public Retangulo(double l, double a){
		this.largura = l;
		this.altura = a;
	}

	public double getLargura(){
		return this.largura;
	}

	public double getAltura(){
		return this.altura;
	}

	public void setLargura(double largura){
		this.largura = largura;
	}

	public void setAltura(double altura){
		this.altura = altura;
	}

	public double calcularArea(){
		return largura * altura;
	}

	public boolean isQuadrado(){
		return largura == altura;
	}

}