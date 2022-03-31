import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class P4949 {
	private static Stack<Character> stack;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();
		while(true) {
			String str = sc.nextLine();
			if(str.equals(".")) break;
			arr.add(str);
		}
		char[] cArr;
		
		for(int i =0; i < arr.size(); i++) {
           		boolean flag = true;
			stack = new Stack<>();
			cArr = arr.get(i).toCharArray();
			for(int j = 0; j < cArr.length; j++) {
				char c = cArr[j];
				switch(c) {
				case '(' :
					stack.add(c);
					break;
				case ')':
					flag = remove(c);
					break;
				case '[':
					stack.add(c);
					break;
				case ']':
					flag = remove(c);
					break;
				}
                		if(!flag) break;
			}
			if(!stack.empty()) flag = false;
			if(flag) System.out.println("yes");
			else System.out.println("no");
			
		}
 	}
	public static boolean remove(char c) {
		switch(c) {
		case ')':
			if(!stack.empty() && stack.peek() == '(') stack.pop();
			else return false;
			break;
		case ']':
			if(!stack.empty() && stack.peek() == '[') stack.pop();
			else return false;
			break;	
		}	
		return true;
	}
}
