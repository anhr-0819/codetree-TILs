import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 1;
        for(int i = 0; i<5; i++) {
            if(result == 1 && scan.nextInt()%3 != 0) {
                result = 0;
            }
        }
        System.out.print(result);
    }
}