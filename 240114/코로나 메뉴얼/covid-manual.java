import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i<3; i++) {
            String s = scan.next();
            int n = scan.nextInt();

            if(s.equals("Y") && n>=37) {
                count++;
            }
        }
        String result = count>1 ? "E" : "N";
        System.out.print(result);
    }
}