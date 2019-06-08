import java.util.Scanner;
class Faculty
{
    int baseSalary;
  public void salary(int salary)
  {
    //write your Faculty class statements
    this.baseSalary = salary;
  }
}
class CSE extends Faculty
{
  public int salary()
  {
    //write your CSE class statements
    return (this.baseSalary + 3000);
    //return salary;
  }
}
class IT extends Faculty
{
  public int salary()
  {
    //write your IT class statements
    return (this.baseSalary + 5000);
    //return salary;
  }
}
class ECE extends Faculty
{
  public int salary()
  {
    //write your ECE class statements
    return (this.baseSalary + 4500);
    //return salary;
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    CSE obj1 = new CSE();
    IT obj2 = new IT();
    //implement your required concept here
    Scanner in = new Scanner(System.in);
    int a = in.nextInt();
    obj.salary(a);
    obj1.salary(a);
    obj2.salary(a);
    System.out.println("Base Salary: " + obj.baseSalary);
    System.out.println("CSE Faculty: " + obj1.salary());
    System.out.println("IT Faculty: " + obj2.salary());
    System.out.println("ECE Faculty: " + obj.salary());
    
  }
}