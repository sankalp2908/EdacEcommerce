package pro1;
import java.util.*;
public class Testproduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int productId;
		String productname;
		String description;
		double price;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter product details:");
       productId=sc.nextInt();
       productname=sc.next();
       description=sc.next();
       price=sc.nextDouble();
       
       Product p1=new Product();
       int a=p1.getproductId();
       p1.setproductId(a);
       String b=p1.getproductname();
       p1.setproductname(b);
       String c=p1.getdescription();
       p1.setdescription(c);
       double d=p1.getprice();
       p1.setprice(d);
	}

}
