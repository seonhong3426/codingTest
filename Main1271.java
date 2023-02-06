package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main1271 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 *  (1 ≤ m ≤ n ≤ 10^1000, m과 n은 10진수 정수)
		 *  
		 * 
		 * */
		//입력받을 BufferReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//토큰
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 최백준 조교가 가진 돈 N
		BigInteger baekN = new BigInteger(st.nextToken());
		
		// 돈을 받으러 온 생명체의수 M
		BigInteger bioM = new BigInteger(st.nextToken());
		
		// N의 돈을 M명에서 나눠가지게 될 금액 출력
		System.out.println(bioM.bitCount());
		// N원을 M명으로 나눠가지고 남은 돈 
		//System.out.println(baekN % bioM);
		
		

	}

}
