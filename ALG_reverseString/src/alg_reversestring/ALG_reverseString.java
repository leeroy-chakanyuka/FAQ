
package alg_reversestring;


public class ALG_reverseString {

    
    public static void main(String[] args) {
       
        
        
        //VIA LOOP
        
        String name = "Leeroy";
        String rev ="";
        for (int i = 0; i < name.length(); i--) {
           rev+= name.charAt(i);        }

        System.out.println(rev);
        
        
        
        
        
        
    }
    
}
