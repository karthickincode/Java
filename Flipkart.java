class Flipkart
{
static String name = "Karthick Flipkart";
static int offer =10; // Declaration and Initialization
int price; //non static --- variable declaration
public static void main(String[] args)
{

Flipkart product1 = new Flipkart();
Flipkart product2 = new Flipkart();
product1.price = 100; // Initialization
product2.price = 120;
product1.sell(); //Method calling statement
product2.sell();
System.out.println(product1.price);
System.out.println(product2.price);
System.out.println(Flipkart.name);
//We can access static values using class name
System.out.println(product1.name);
//We can access static values using instance name
System.out.println(name);
//We can access static values directly in the same class
give_offer();//static
}
void sell() //method signatute, sell -method
// () -arguments
{ //Method Body - Definition
System.out.println("Product price is"+ price);
// + means concatenation symbol
}
static void give_offer()
{
System.out.println("Offer % is"+ offer );
}
}
