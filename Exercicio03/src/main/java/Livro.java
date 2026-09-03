
public class Livro extends Produto implements InfoGerais{

	private String autor;
	
	public Livro() {		
	}
	
	public Livro(String nome, double preco, String autor) {
		super(nome, preco);
		this.autor = autor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public void exibeInformacoes() {
		System.out.println("\n--- INFORMAÇÕES DO LIVRO: ---");
		System.out.println("Nome: " + getNome());
		System.out.println("Preço: R$" + getPreco());
		System.out.println("Autor: " + getAutor());
	}
	
}
