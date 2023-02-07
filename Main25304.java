package 백준;

import java.io.*;
import java.util.StringTokenizer;


public class Main25304 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 영수증에 적힌 총 금액 ( 1 <= X <= 1,000,000,000 ) int의 최대 값 : 2,147,483,647
		int X = Integer.parseInt(st.nextToken()); 
		
		st = new StringTokenizer(br.readLine());
		// 물건 종류의 수
		int N = Integer.parseInt(st.nextToken());
		
		//검증할 금액
		int sumAmt = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			// 가격 a와 개수 b
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sumAmt = sumAmt + a * b;
		}
		
		//검증할 금액과 영수증 총 금액비교
		if ( X == sumAmt )
			System.out.println("Yes");
		else
			System.out.println("No");
		

	}

}
