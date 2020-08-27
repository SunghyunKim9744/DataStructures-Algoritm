import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greedy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. Change (p.86)
		
		List<Integer> coin = new ArrayList<>();
		coin.add(500);
		coin.add(100);
		coin.add(50);
		coin.add(10);
		/*int[] coin = {500,100,50,10};*/
		int n = 1260;
		int count=0;
		
		for(int num : coin) {
			count += n/num;
			n %= num;
		}
		System.out.println(count);
		
		
	}

}
