import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.print("enter the number to find its factorial = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=n-1  ; i>0; i-- ){
            n*=i;
        }
        System.out.println("the factorial of a number is = "+n);

    }
}