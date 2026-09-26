package q3;

public class Livro{
	private String titulo;
	private double preco;
	private Autor autor;

	public Livro(String titulo, double preco, Autor autor){
		this.titulo = titulo;
		this.preco = preco;
		this.autor = autor;
	}
	
	public void exibirDetalhes(){
		System.out.printf("Titulo: %s\n", titulo);
		System.out.printf("Autor: %s (%s)\n", autor.getNome(), autor.getNacionalidade());
		System.out.printf("Preço: %.2f R$\n", preco);	
	}

}