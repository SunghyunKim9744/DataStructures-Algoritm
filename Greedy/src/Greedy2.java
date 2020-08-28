import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		List<Integer> data = new ArrayList<>();
		for(int i=0; i<N; i++)
			data.add(scan.nextInt());
		
		/*int[] data = new int[N];
		for(int i=0; i<data.length; i++)
			data[i] = scan.nextInt();*/
		
		Collections.sort(data);
		int big1 = data.get(N-1); 
		int big2 = data.get(N-2);
		
		/*Arrays.sort(data);
		int big1 = data[N-1];
		int big2 = data[N-2];*/
		int result = 0;
		
		int count=0;
		count = (M /(K+1))*K;
		count += M %(K+1);
		result = count*big1 + (M-count)*big2;
		
		/*while(M>0) {
			result += big1*K;
			M-=K;
			if(M>0) {
				result+=big2;
				M-=1;
			}
		}*/
		System.out.println(result);
	}

}
