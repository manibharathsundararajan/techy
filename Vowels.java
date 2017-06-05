import java.util.*;
public class Vowels {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        String[] a={"a","e","i","o"};
        String b=s.nextLine();
        int s1=0,s2=0;
        for(int i=0;i<b.length();i++)
        {
            char c=b.charAt(i);
            
           if(c=='a'|| c=='e' || c=='i' || c=='o'|| c=='u')
           {
               s1++;
           }
                 else
           {
               s2++;
           }
        }
        System.out.println("vowels"+s1+"consonant"+s2);
    }
}    
    
      
        
        
     
        
