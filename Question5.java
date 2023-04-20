import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args) {
  
    Scanner myobj = new Scanner(System.in);
     System.out.println("Enter integer");
       
    int integer = myobj.nextInt();
    int[] intarray;
    intarray = new int [integer];
    int x =0;
    
   
   while(0<integer){
     System.out.println("Enter integer");
       
    int integers = myobj.nextInt();
     intarray[integer-1]=integers;
      integer--;
    
    }    
  
     int a =0;
      int jk=0;
    
  for (int i : intarray)
    {
     int u =0;
      for(int j : intarray){
      
      if(i==j)
      {
        u++;
      }

      }
         if(u>a)
        {
          a=u;
          jk=i;
        }
            
      
    }
    System.out.println(jk);

    
  }
}
