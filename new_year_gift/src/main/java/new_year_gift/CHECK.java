package new_year_gift;

import java.util.ArrayList;
import java.util.Scanner;

public class CHECK {
	 
	static ArrayList<Giftpack> al=new ArrayList<Giftpack>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of gifts");
       int n=sc.nextInt();
       for (int i=0;i<n;i++) {
    	   System.out.println("Enter the choice \n 1.Chocolates \n 2.Sweets");
    	   int ch=sc.nextInt();
    	   switch(ch) {
    	   case 1: inputChoc();
    	           break;
    	   case 2: inputSweet();
    	           break;
    	    default: System.out.println("Enter the number between 1 and 2");
    	             break;
    	   }
       }
       System.out.println(al);
	}
	
	public static void inputSweet() {
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Enter the sweet name");
		     String name=sc.next();
		     System.out.println("Enter the sweet price");
		     int price=sc.nextInt();
		     System.out.println("Enter the sweet weight");
		     int weight=sc.nextInt();
		     if(name.equals("Kheer")) {
		    	 Kheer ka=new Kheer(name,price,weight);
		    	 al.add(ka);
		     }
		     else {
		    	 Rasgulla ra=new Rasgulla(name,price,weight);
		    	 al.add(ra);
		     }     
	}
	
	public static void inputChoc() {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the chocolate name");
	     String name=sc.next();
	     System.out.println("Enter the chocolate price");
	     int price=sc.nextInt();
	     System.out.println("Enter the chocolate weight");
	     int weight=sc.nextInt();
	     if(name.equals("Munch")) {
	    	 Munch ka=new Munch(name,price,weight);
	    	 al.add(ka);
	     }
	     else {
	    	 Dairy_milk ra=new Dairy_milk(name,price,weight);
	    	 al.add(ra);
	     }     
}


}
