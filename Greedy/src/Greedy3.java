import java.util.Arrays;
import java.util.Scanner;

public class Greedy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3. Card Game (p.96)
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] CARD = new int[N][M];
		for(int i=0; i<CARD.length; i++)
			for(int j=0; j<CARD[0].length; j++)
				CARD[i][j] = scan.nextInt();
		int[] temp = new int[M];
		int[] min = new int[N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				temp[j] = CARD[i][j];
			}
			Arrays.sort(temp);
			min[i] = temp[0];
		}
		Arrays.sort(min);
		int result = min[N-1];
		System.out.println(result);

	}

}
