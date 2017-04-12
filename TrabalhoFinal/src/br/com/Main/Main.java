package br.com.Main;

import br.com.classes.ShoppingCartList;
import br.com.classes.ShoppingCartMap;
import br.com.classes.ShoppingCartSet;
import br.com.model.Product;

public class Main {

	public static void main(String[] args) {
//		iniciarList();
//		inicarSet();
		inicarMap();
	}
	
	public static void iniciarList(){
		ShoppingCartList list = new ShoppingCartList();
		list.addItem(new Product(1, "A Produto 1", (double) 1), 11);
		list.addItem(new Product(2, "C Produto 2", (double) 2), 12);
		list.addItem(new Product(3, "B Produto 3", (double) 3), 13);
		
		list.getProductsOrderByNameAsc();
		list.removeItemByProductId(0);
		list.getItems();
		System.out.println("Total é: "+list.getTotal());
	}

	public static void inicarSet(){
		ShoppingCartSet set = new ShoppingCartSet();
		set.addItem(new Product(1, "C Produto 1", (double) 1), 11);
		set.addItem(new Product(2, "A Produto 2", (double) 2), 12);
		set.addItem(new Product(3, "B Produto 3", (double) 3), 13);
		
		set.getProductsOrderByNameAsc();
		set.removeItemByProductId(1);
		set.getItems();
		System.out.println("Total é: "+set.getTotal());
	}
	
	public static void inicarMap(){
		ShoppingCartMap map = new ShoppingCartMap();
		map.addItem(new Product(1, "C Produto 1", (double) 1), 11);
		map.addItem(new Product(2, "A Produto 2", (double) 2), 12);
		map.addItem(new Product(3, "B Produto 3", (double) 3), 13);
		
		map.getProductsOrderByNameAsc();
		map.removeItemByProductId(1);
		map.getItems();
		System.out.println("Total é: "+map.getTotal());
	}
}
