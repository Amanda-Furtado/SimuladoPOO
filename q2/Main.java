package q2;

public class Main{
	public static void main (String[] args){
		Retangulo r1 = new Retangulo(5.0, 5.0);
		
		boolean teste = r1.isQuadrado();
		
		if(teste){
			System.out.printf("É um quadrado.\n");
		}else{
			System.out.printf("Não é um quadrado.\n");
		}
		
		double area = r1.calcularArea();
		
		System.out.printf("A área é: %.2f.\n", area);

		
	}
}