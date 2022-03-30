import java.util.Scanner;

public class BOJ_4153_직각삼각형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			boolean finish = false;
			int max = 0;
			int[] tri = new int[3]; 
			
			for (int i = 0; i < 3; i++) {
				tri[i] = sc.nextInt();
				if (i == 0 && tri[i] == 0) //0들어오면 끝(삼각형 변 길이는 0일 수 없으므로 한 번만 비교)
					finish = true;
				else if (max < tri[i]) { //새로 들어온 값이 max이면 바꿔주기
					int now = tri[i];
					tri[i] = max;
					max = now;
				}
			}
			
			if (finish)
				break;
			
			int sub =0;
			for(int i =0; i<3; i++) //max제외한 값 제곱합
				sub += tri[i] * tri[i]; 
			
			if((max * max) == sub) //피타고라스
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}

}
