package co.vinod.entity;

public class product {
	private int id;
	private String name;
	private double price;

	public void setId(int id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
public void setPrice(double price){
	this.price=price;
}
public int getId()
{
	return id;
}
public double getPrice()
{
	return price;
}
public String getName()
{
	return name;
}

}
