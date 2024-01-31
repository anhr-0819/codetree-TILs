import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int cnt = 0;
    for(int i = 1; i<n*2; i++) {
      cnt = i > n ? --cnt : ++cnt;
      for(int j = 0; j<cnt; j++) {
        System.out.print("*");
      }
      System.out.println("");
      if(!(i>n && cnt == 1)) System.out.println("");
    }
    }
}