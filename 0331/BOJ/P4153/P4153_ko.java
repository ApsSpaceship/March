import java.util.Arrays;
import java.util.Scanner;

public class BOJ_4153_직각삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean finish = false;
			int[] tri = new int[3]; 
			
			for (int i = 0; i < 3; i++) {
				tri[i] = sc.nextInt();
				if (i == 0 && tri[i] == 0) //변이 0인 경우는 없으므로 한 번만 비교
					finish = true;
			}
			
			if (finish)
				break;
			
			Arrays.sort(tri); //정렬
			
			if(Math.pow(tri[0], 2)+Math.pow(tri[1], 2)==Math.pow(tri[2], 2)) //피타고라스
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}

}
