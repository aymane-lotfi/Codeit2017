import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        
    
    Scanner sc = new Scanner (System.in);
    int T = sc.nextInt();    
    while(T!=0){
        int n = sc.nextInt();
          int h=sc.nextInt();
                  int w = sc.nextInt();
        for (int i=0;i<n;i++){
        int l = sc.nextInt();
        if(h * h + w * w <= l * l)
		System.out.println("NO");
			else
              System.out.println("YES");
    }
        T--;
    }
    
}}

