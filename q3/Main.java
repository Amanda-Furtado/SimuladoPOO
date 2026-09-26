package q3;


public class Main{
	public static void main(String[] args){
		Autor autor1 = new Autor("Lemony Snicket", "Estadunidense");
		Livro livro1 = new Livro("Desventuras em série: MAU COMEÇO", 19.90, autor1);
	
		livro1.exibirDetalhes();

		}


}