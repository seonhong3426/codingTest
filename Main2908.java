package codeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2908 {
	
	// 상수

	public static void main(String[] args) throws IOException 
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str1 = st.nextToken();
		String str2 = st.nextToken();
		
		//반전시킬 문자열 변수
		String inverseStr1 = "";
		String inverseStr2 = "";
		//거꾸로 읽기
		for(int i = str1.length() -1; i >= 0; i--) {
			inverseStr1 += str1.charAt(i);
		}
		for(int i = str2.length() -1; i >= 0; i--) {
			inverseStr2 += str2.charAt(i);
		}
		//거꾸로 읽은 문자열을 정수로 변환
		int n1 = Integer.parseInt(inverseStr1);
		int n2 = Integer.parseInt(inverseStr2);
		
		//큰 수 출력
		if(n1 > n2) {
			System.out.println(n1);
		}
		else if(n1 < n2) {
			System.out.println(n2);
		}
		


	}

}
