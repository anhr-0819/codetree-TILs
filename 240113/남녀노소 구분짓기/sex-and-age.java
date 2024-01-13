import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gender = scan.nextInt();
        int age = scan.nextInt();

        if(gender == 0) {
            if(age >= 19) {
                System.out.print("MAN");
            } else {
                System.out.print("BOY");
            }
        } else {
            if(age >= 19) {
                System.out.print("WOMAN");
            } else {
                System.out.print("GIRL");
            }
        }
    }
}