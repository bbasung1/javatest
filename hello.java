import java.util.Scanner;
public class hello{
    public static void main(String[] args) {
       Scanner scan=new Scanner (System.in);
       int a,b;
       a=scan.nextInt();
       b=scan.nextInt();
       scan.close();
       System.out.println(a+b);
    }
}