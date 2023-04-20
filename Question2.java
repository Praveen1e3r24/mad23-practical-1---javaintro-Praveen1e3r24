import java.util.Scanner;

public class Question2
{
 
  public static void main(String[] args) {
  
    Scanner myobj = new Scanner(System.in);
     System.out.println("Enter height");
       
    double height = myobj.nextDouble();
    System.out.println("Enter weight");
    double weight= myobj.nextDouble();
  

    double bmi=weight/(height*height);
  System.out.println("Your bmi is "+bmi);
    
  

}
}
