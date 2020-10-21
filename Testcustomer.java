package pro1;
import java.util.*;
public class Testcustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter customer details:");
     String name=sc.next();
     long mno=sc.nextLong();
     String address=sc.next();
     int pin=sc.nextInt();
     
     Customer c1=new Customer();
     String a=c1.getname();
     c1.setname(a);
     long b=c1.getmno();
     c1.setmno(b);
     String c=c1.getaddress();
     c1.setaddress(c);
     int d=c1.getpin();
     c1.setpin(d);
	}

}
