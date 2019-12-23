package co.vinod.entity;

public class product implements Comparable<product>  {

	private int id;
	private String name;
	private double price;
	
public product(){

}

public product(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}

/**
 * @return the id
 */
public int getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the price
 */
public double getPrice() {
	return price;
}

/**
 * @param price the price to set
 */
public void setPrice(double price) {
	this.price = price;
}

/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "product [id=" + id + ", name=" + name + ", price=" + price + "]";
}

@Override
public int compareTo(product p) {
// TODO Auto-generated method stub
	int ret=this.id-p.id;
	if(ret==0)
	ret=this.name.compareTo(p.name);
	if(ret==0){
		ret=Double.compare(this.price, p.price);
	}
	
	return ret;
}

}
