
package alg_reversenumber;


public class ALG_ReverseNumber {

    
    public static void main(String[] args) {
        
        //Method one : looping through
        int num = 1232;
        int rev = 0;
        while(num != 0)
        {rev = rev *10 + num %10; 
        // 0 * 10 (0) + 2 === rev(2)
        // 2 * 10 (20) + 3 === rev (23)
        // 23 * 10 (230) + 2 === rev (232)
        // 232 * 10 (2320) + 1 === rev (2321)
        }
        
       System.out.println("Original"+num);
       System.out.println("Reversed via loop"+rev);
       System.out.println("--------------------");


       //Method two : String Buffer
       StringBuffer sb = new StringBuffer(String.valueOf(rev));
       sb.reverse();


       //Method three : String Builder 
       System.out.println("Back to OG via StringBuffer"+sb);
       System.out.println("--------------------");
       StringBuilder fin = new StringBuilder();
       fin.append(sb);
       fin.reverse();
       
       System.out.println("re-reversed to OG via StringBuilder"+fin);
       
        }
    }
    

