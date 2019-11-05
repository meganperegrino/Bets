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
			return betsHelper(N/2, K - 1, rounds + 1);
		}
		else {
			return betsHelper(N - 1, K, rounds + 1);
		}
		
	}
	
}
