public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        int temp = b;

        b = a;
        a = c;
        c = temp;

        System.out.printf("%d\n%d\n%d",a,b,c);


    }
}