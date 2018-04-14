import java.util.Scanner;
import java .util.ArrayList;
public class Main {
    public static void main (String[] args){
       
    ArrayList<String> list = new ArrayList();
    Scanner sc = new Scanner (System.in);
    int T = sc.nextInt();    
    while(T!=0){
        int n = sc.nextInt();
          int h=sc.nextInt();
                  int w = sc.nextInt();
        for (int i=0;i<n;i++){
        int l = sc.nextInt();
        if(h * h + w * w <l * l){
 
        
		list.add("NO");}
			else{
             list.add("YES");}
    }
        T--;
    }
    for (String str: list) {
       System.out.println(str);
		}
}}
