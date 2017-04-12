package br.com.model;

public class Product implements Comparable<Product>{
	private Integer id;
	private String name;
	private Double price;
	
	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

//	public int compare(Product o1, Product o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
	
	public int compareTo(Product o) {
		if(this.getName().compareTo(o.getName()) > 0){
			return 0;
		} else {
			return -1;
		}
	}
	
}
