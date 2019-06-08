//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void priceItem(int price)
  {
     this.price = price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void productName(String product)
  {
     this.product = product;
    
  }
  public void quantityDetail(int quantity)
  {
     this.quantity = quantity;
    }
}

class Bill
{
  //implement your logic to calculate total price
  int bill;
  public int billAmount(int quantity, int price)
  {
     this.bill = quantity * price;
     return this.bill;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner in = new Scanner(System.in);
    String s  = in.nextLine();
    int price = in.nextInt();
    int quantity = in.nextInt();
    System.out.println("Total Price is : " + obj.billAmount(quantity, price));
    
  }
}