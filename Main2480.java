package 백준;


import java.io.*;
import java.util.StringTokenizer;
public class Main2480 {
	
	private final static int TEN_THOUSAND = 10000;
	private final static int THOUSAND = 1000;
	private final static int ONE_HUNDRED = 100;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//A 주사위 , B 주사위, C 주사위
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		//최대주사위 값 변수
		int max = 0;
		
		
		int reward = 0;
		if(A > max) max = A;
		if(B > max) max = B;
		if(C > max) max = C;
		
		//3개 주사위 값이 같은 경우
		if(A == B && B == C) {
			
			reward = TEN_THOUSAND + max * THOUSAND;
		}
		//2개 주사위 값이 같은 경우
		else if (A == B && B != C && C != A) {
			
			reward = THOUSAND + A * ONE_HUNDRED;
		}
		else if (A != B && B == C && C != A) {
			
			reward = THOUSAND + B * ONE_HUNDRED;
		}
		else if (A != B && B != C && C == A) {
			
			reward = THOUSAND + C * ONE_HUNDRED;
		}
		else
			reward = ONE_HUNDRED * max;
		
		System.out.println(reward);
		

	}

}
