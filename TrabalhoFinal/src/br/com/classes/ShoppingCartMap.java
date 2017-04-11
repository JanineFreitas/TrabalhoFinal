package br.com.classes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import br.com.interfacee.ShoppingCart;
import br.com.model.Item;
import br.com.model.Product;

public class ShoppingCartMap implements ShoppingCart{
	private Integer key = 0;
	private Map<Integer, Item> listItens = new HashMap<>();

	public ShoppingCartMap() {
		super();
	}

	@Override
	public Item addItem(Product product, Integer amount) {
		Item item = new Item(product, amount);
		setKey();
		return listItens.put(key, item);
	}

	@Override
	public Collection<Product> getProductsOrderByNameAsc() {
		return null;
	}

	@Override
	public Iterator<Item> getItems() {
		return listItens.values().iterator();
	}

	@Override
	public void removeItemByProductId(Integer productId) {
		listItens.remove(productId);
		System.out.println("Removeu item "+productId);
	}

	@Override
	public Double getTotal() {
		Double valor = (double) 0;
		for (Integer key : listItens.keySet()) {
			valor += listItens.get(key).getAmount();
		}
		return valor;
	}

	public Integer getKey() {
		return key;
	}

	public void setKey() {
		this.key++;
	}

}
