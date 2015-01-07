
import java.util.Date;
import java.util.Random;


public class obj {
    
    public static void main (String args[])
    {
       Testing test  = new Testing();
       test.checkingMethod();
      String extra =  test.myname  ;      
      Date time = new Date();
      
       System.out.println(time.toString());
      
       Random obj1 = new Random();
       
       System.out.println(obj1.nextInt());
       
       
       System.out.println(extra);
      
    }
    
}


 class Testing{
    
    
    String myname = "sharnjit";
    
    String checkingMethod()
    {
        System.out.println(myname) ;
        return myname ;
    }
    
    
     
}