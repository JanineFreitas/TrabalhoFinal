package br.com.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import br.com.interfacee.ShoppingCart;
import br.com.model.Item;
import br.com.model.Product;

public class ShoppingCartSet implements ShoppingCart {

	private Set<Item> setItens = new HashSet<Item>();

	@Override
	public Item addItem(Product product, Integer amount) {
		Item item = new Item(product, amount);
		setItens.add(item);
		return item;
	}

	@Override
	public Collection<Product> getProductsOrderByNameAsc() {
		List<Product> produtos = new ArrayList<>();
		for (Item item : setItens) {
			produtos.add(item.getProduct());
		}
		Collections.sort(produtos);
		return produtos;
	}

	@Override
	public Iterator<Item> getItems() {
		return setItens.iterator();
	}

	@Override
	public void removeItemByProductId(Integer productId) {
		for (Item item : setItens) {
			if (productId.equals(item.getProduct().getId().intValue())) {
				setItens.remove(item.getProduct());
				System.out.println("Removeu item " + productId);
				break;
			}
		}

	}

	@Override
	public Double getTotal() {
		Double total = (double) 0;
		for (Item item : setItens) {
			total += item.getAmount();
		}
		return total;
	}

}
