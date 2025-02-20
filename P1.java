import java.util.Scanner;
class Product{
    int price,pcode;
    String pname;
Product(int pr,int code,String name)
{
this.price=pr;
this.pcode=code;
this.pname=name;
}
}
class Productt
{
public static void main(String args[])
{
Product product1=new Product(1200,001,"crayoons");
int pcode,price;
String name;
pcode=005;
price=2000;
name="sketch";
Product product2=new Product(price,pcode,name);
Scanner sc=new Scanner(System.in);
System.out.println("Enter product code :");
pcode=sc.nextInt();
System.out.println("Enter product name :");
name=sc.next();
System.out.println("Enter product price :");
price=sc.nextInt();
Product product3=new Product(price,pcode,name);
System.out.println("\nproduct 1: pcode:"+product1.pcode+", price:"+product1.price+", name:"+product1.pname);
System.out.println("\nproduct 2: pcode:"+product2.pcode+", price:"+product2.price+", name:"+product2.pname);
System.out.println("\nproduct 3: pcode:"+product3.pcode+", price:"+product3.price+", name:"+product3.pname);
System.out.print("\nproduct having lowest price is : ");
if(product1.price<product2.price && product1.price<product3.price)
{
    System.out.println("product 1: pcode:"+product1.pcode+", price:"+product1.price+", name:"+product1.pname);
}
else if(product2.price<product1.price && product2.price<product3.price)
{
   System.out.println("product 2: pcode:"+product2.pcode+", price:"+product2.price+", name:"+product2.pname); 
}
else{
    System.out.println("product 3: pcode:"+product3.pcode+", price:"+product3.price+", name:"+product3.pname);

}
}
}
