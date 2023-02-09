package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1065 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		System.out.println(cal(N));
		

	}
	
	public static int cal(int N) {
		
		
		int count = 0;
		
		if( N < 100 ) {
			//100���� ������
			count = N;
		}
		else {
			//100���ڸ� a, 10���ڸ� b, 1���ڸ� c

			count = 99;
			for(int i = 100; i <= N; i++) {
				
				int a = i / 100;
				int b = (i % 100) / 10;
				int c = i % 10;
				if((a-b) == (b-c)) {
					count++;
				}
			}
		}
		return count;
	}

}
