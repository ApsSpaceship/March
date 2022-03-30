import java.util.Scanner;

public class BOJ_2869_달팽이는올라가고싶다 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt(); // 낮에 올라감
      int B = sc.nextInt(); // 밤에 내려감
      int V = sc.nextInt(); // 최종 높이
     
      System.out.print((int) Math.ceil((double) (V - A) / (A - B)) + 1);
   }
}
