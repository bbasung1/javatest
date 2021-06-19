import java.util.Scanner;
class _11050 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        int c=1;
        int d=1;
        for(int i=1;i<=b;i++){
            c*=(a-i+1);
            d*=i;
        }
        System.out.println(c/d);
     }
    }
