package codeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1152 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 단어의 개수 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().trim(); //좌우 공백 제거
		//System.out.println(str);
		String[] arr = str.split(" "); //공백을 기준으로 문자열 잘라서, 배열에 담기
		
		// 빈 문자열이라도 공백문자는 null 아니기때문에 체크해줘야한다.
		if(arr.length == 1) {
			//공백문자가 들어간 경우
			if ( str.equals(""))
			System.out.println("0");
			else 
				//아닌경우 단순 단어가 하나인경우 1을 출력
				System.out.println(arr.length);
		}
		else {
			System.out.println(arr.length); //배열의 사이즈를 구한다.
		}
		

	}

}
