import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr1 = new String[2];
        String[] arr2 = new String[2];

        arr1[0] = scan.next();
        arr1[1] = scan.next();
        arr2[0] = scan.next();
        arr2[1] = scan.next();

        if((Integer.valueOf(arr1[0]) >= 19 && arr1[1].equals("M")) 
        || (Integer.valueOf(arr2[0]) >= 19 && arr2[1].equals("M"))) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}