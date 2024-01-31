import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i<n; i++) {
                for(int k = 1; k<=n; k++) {
                        if(i>0 && k>n-i) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                }
                for(int k = 1; k<=n; k++) {
                        if(i>0 && k<=n-(n-i)) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                }
                System.out.println("");
        }
    }
}