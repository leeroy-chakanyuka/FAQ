
package alg_swap.numbers;

public class ALG_swapNumbers {

    public static void main(String[] args) {
        
        
        // GET 56 FROM X TO Y AND 65 FROM Y TO X. Method one
        
                        //        int x =56;
                        //        int y = 65;
                        //        int z;
                        //        System.out.println(x);
                        //        System.out.println(y);
                        //        z = y;
                        //        y = x;
                        //        x =z;
                        //        System.out.println("----------------");
                        //        System.out.println(x);
                        //        System.out.println(y);
        
        //------------------------------------------------------
        
        // GET 56 FROM X TO Y AND 65 FROM Y TO X. Method two, no temp var
        
       int x =56;
       int y = 65;
      System.out.println(x);
      System.out.println(y);
       
       x  = x + y; // x = 121
       y  = x-y;   // y = 56
       x = x -y;   // x = 65
               
      System.out.println(x);
      System.out.println(y);
        
        
        
        
        
        
        
    }
    
}
