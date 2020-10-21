package pro1;

public class Product {

	private int productId;
	private String productname;
	private String description;
	private double price;
	
	public int getproductId()
	{
		return productId;
	}
	public void setproductId(int productId)
	{
		this.productId=productId;
	}
	public String getproductname()
	{
		return productname;
	}
	public void setproductname( String productname)
	{
		this.productname=productname;
	}
	public String getdescription()
	{
		return description;
	}
	public void setdescription(String description)
	{
		this.description=description;
	}
	public double getprice()
	{
		return price;
	}
	public void setprice(double price)
	{
		this.price=price;
	}
}
