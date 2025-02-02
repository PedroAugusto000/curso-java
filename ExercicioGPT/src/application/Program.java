package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Quantos produtos seram cadastrados: ");
	int n = sc.nextInt();
	
	//Laço for
	for(int i = 1; i <= n; i++) {
		System.out.println("-----PRODUTO #" + i + "-----");
		
		System.out.println("Informe o ID do produto: ");
		int id = sc.nextInt();
		while (idExiste(list, id)) {
			System.out.print("ID Já existe. Tente outro: ");
			id = sc.nextInt();
		}
		
		System.out.println("Informe o nome do produto: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Informe o preço do produto: ");
		double preco = sc.nextDouble();
		
		System.out.println("");
		list.add(new Product(id, nome, preco));
	}
	
	//Atualizando o preço
	System.out.println("===Atualizar preço de produto===");
	System.out.println("Informe o ID do produto a ser atualizado: ");
	int id = sc.nextInt();
	
	Product product = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

	if(product ==null) {
		System.out.println("Esse ID não existe!");
	} else {
		System.out.print("Informe a porcentagem: ");
		double porcentagem = sc.nextDouble();
		product.aumentarPreco(porcentagem);
	}
	
	//Listando
	System.out.println("");
	System.out.println("=====Lista de produtos=====");
	//Laço for each
	for(Product obj : list) {
		System.out.println(obj);
		}
	}
	
	public static boolean idExiste(List<Product> list, int id) {
		Product product = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return product != null;
	}
}
