import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=a; i++) {
            if(!(i%2 == 0 && i%4 != 0) && (i/8)%2 != 0 && i%7 >= 4) {
                sb.append(i).append(" ");
            }
        }
        System.out.print(sb);
    }
}