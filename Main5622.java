package codeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5622 {
	//5622 다이얼
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		
		int n = str.length();
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			
			int asc = str.charAt(i);
			
			
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'C') {
				
				sum+= 2;
			}
			else if(str.charAt(i) >= 'D' && str.charAt(i) <= 'F') {
				sum+= 3;
			}
			else if(str.charAt(i) >= 'G' && str.charAt(i) <= 'I') {
				sum+= 4;
			}
			else if(str.charAt(i) >= 'J' && str.charAt(i) <= 'L') {
				sum+= 5;
			}
			else if(str.charAt(i) >= 'M' && str.charAt(i) <= 'O') {
				sum+= 6;
			}
			else if(str.charAt(i) >= 'P' && str.charAt(i) <= 'S') {
				sum+= 7;
			}
			else if(str.charAt(i) >= 'T' && str.charAt(i) <= 'V') {
				sum+= 8;
			}
			else if(str.charAt(i) >= 'W' && str.charAt(i) <= 'Z') {
				sum+= 9;
			}
			
			
		}
		
		System.out.println(sum + str.length());

	}

}
