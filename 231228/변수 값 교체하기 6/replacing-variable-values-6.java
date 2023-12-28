public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int x;

        x = a;
        a = b;
        b = x;

        System.out.printf("%d\n%d",a,b);
    }
}