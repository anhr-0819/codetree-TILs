import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal a = new BigDecimal(scan.next());
        BigDecimal b = new BigDecimal(scan.next());

        System.out.print(a.divide(b, 20, RoundingMode.FLOOR));
    }
}