import java.util.*;
public class cache{
    public static void main(String arr[]){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        s.nextLine();
        String b=s.nextLine();
        String b1[]=b.split(",");
        int c=s.nextInt();
        Set<String> al=new LinkedHashSet<String>();
        int k=0;
        for(int i=0;i<b1.length;i++){
            if(b1[i].equals(a+"")){
                k+=al.size()+1;
                al.clear();
            }else{
                al.add(b1[i]);
            }
        }
        System.out.println(k);
    }
}

