import java.util.Scanner;

public class Greedy4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4. Min Count 1 (p.99)
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int result = 0;
		while(N!=1) {
			if(N%K!=0) {
				N-=1;
				result++;
			}
			else {
				N/=K;
				result++;
			}
		}
		
		System.out.println(result);
	}

}
