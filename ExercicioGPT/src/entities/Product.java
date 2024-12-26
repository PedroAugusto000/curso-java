package entities;

public class Product {

	private Integer id;
	private String nome;
	private Double preco;
	
	public Product() {}

	public Product(Integer id, String nome, Double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void aumentarPreco(double porcentagem) {
		preco += preco * porcentagem / 100.0;
	}
	
	public String toString() {
		//return id + ", " + nome + ", " + String.format("%.2f", preco);
		return "ID: " + id + ", Nome: " + nome + ", Preço: R$" + preco;
	}
}
