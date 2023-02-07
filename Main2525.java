package 백준;

import java.io.*;
import java.util.StringTokenizer;
public class Main2525 {

	private final static int SIXTY = 60;
	private final static int TWENTY_FOUR = 24;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. 
		 * (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 시간
		int A = Integer.parseInt(st.nextToken());
		
		// 분
		int B = Integer.parseInt(st.nextToken());
		
		// 소요시간 (분)
		st = new StringTokenizer(br.readLine());
		
		int C = Integer.parseInt(st.nextToken());
		
		A = A + (C / SIXTY);
		B = B + (C % SIXTY);
		
		// 분 체크
		if(B >= SIXTY) {
			B = B - SIXTY;
			A = A + 1;
		}
		
		// 시 체크
		if(A >= TWENTY_FOUR) {
			A = A - TWENTY_FOUR;
		}
		
		System.out.println(A + " " + B);
		
			
		
		
		
		
		
		
		
		
		

	}

}
