package br.com.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import br.com.interfacee.ShoppingCart;
import br.com.model.Item;
import br.com.model.Product;

public class ShoppingCartList implements ShoppingCart{

	private List<Item> listItens = new ArrayList<Item>();
	
	@Override
	public Item addItem(Product product, Integer amount) {
		Item item = new Item(product, amount);
		listItens.add(item);
		return item;
	}

	@Override
	public Collection<Product> getProductsOrderByNameAsc() {
		List<Product> produtos = new ArrayList<>();
		for (Item item : listItens) {
			produtos.add(item.getProduct());
		}
		Collections.sort(produtos);
		return produtos;
	}

	@Override
	public Iterator<Item> getItems() {
		Iterator<Item> itr = listItens.iterator();
//		while(itr.hasNext()){
//	        String str = itr.next().toString();
//	        System.out.println(str);
//	    }
		return itr;
	}

	@Override
	public void removeItemByProductId(Integer productId) {
		listItens.remove((int)productId);
		System.out.println("Removeu item "+productId);
	}

	@Override
	public Double getTotal() {
		Double total = (double) 0;
		for (Item item : listItens) {
			total += item.getAmount();
		}
		return total;
	}

}
