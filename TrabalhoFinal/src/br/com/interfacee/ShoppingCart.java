package br.com.interfacee;

import java.util.Collection;
import java.util.Iterator;

import br.com.model.Item;
import br.com.model.Product;

public interface ShoppingCart {
	public Item addItem(Product product, Integer amount);
	
	public Collection<Product> getProductsOrderByNameAsc();
	
	public Iterator<Item> getItems();
	
	public void removeItemByProductId(Integer productId);
	
	public Double getTotal();
}
