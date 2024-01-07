import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        System.out.println(w*((int)Math.pow(100,2))/((int)Math.pow(h,2)));
        if(w*((int)Math.pow(100,2))/((int)Math.pow(h,2))>24) {
            System.out.println("Obesity");
        }
    }
}