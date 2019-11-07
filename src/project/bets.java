package project;

public class bets {
	public static int bets(int N, int K) {
		return betsHelper(N - 1, K, 0);
	}
	
	public static int betsHelper(int N, int K, int rounds) {
		if(N == 0) {
			return rounds;
		}
		
		if(K > 0) {
			return betsHelper(N / 2, K - 1, rounds + 1);
		}
		else {
			return betsHelper(N - 1, K, rounds + 1);
		}
		
	}
	
	public static int betsIt(int N, int K) {
		if(N == 1) {
			return 0;
		}
		/*if(K == 0) {
			return N - 1;
		}*/
		
		int rounds = 0;
		while(N > 1 && K > 0) {
			if(N % 2 == 0) {
				K--;
				N = N / 2;
			}
			else {
				N--;
			}
			rounds++;
		}
		return rounds + (N - 1);
	}
	
}
