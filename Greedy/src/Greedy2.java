import java.util.Arrays;
import java.util.Scanner;

public class Greedy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 2. law of large numbers (p.92)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("N, M, K값 입력 받기");
		int N,M,K;
		N = scan.nextInt();
		M = scan.nextInt();
		K = scan.nextInt();
		int[] data = new int[N];
		for(int i=0; i<data.length; i++)
			data[i] = scan.nextInt();
		Arrays.sort(data);
		int big1 = data[data.length-1]; 
		int big2 = data[data.length-2];
		int result = 0;
		while(M>0) {
			result += big1*K;
			M-=K;
			if(M>0) {
				result+=big2;
				M-=1;
			}
		}
		System.out.println(result);
	}

}
