
import java.util.Scanner;


public class Operators {
    
    
    public static void main(String args[])
    {
        
        double x , y , result ; /* if variables are the same type you can write
         * in the same line .....
         * 
         */
        
        Scanner input = new Scanner(System.in) ;
        
        System.out.println("Enter value for x : ");
        
        x = input.nextDouble();
         
        System.out.println("Enter value for y : ");
        
        y = input.nextDouble();
      
        
        result = x / y ;
        
        System.out.println("result is " + result );
        
    }
    
    
}
