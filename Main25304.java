package ����;

import java.io.*;
import java.util.StringTokenizer;


public class Main25304 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// �������� ���� �� �ݾ� ( 1 <= X <= 1,000,000,000 ) int�� �ִ� �� : 2,147,483,647
		int X = Integer.parseInt(st.nextToken()); 
		
		st = new StringTokenizer(br.readLine());
		// ���� ������ ��
		int N = Integer.parseInt(st.nextToken());
		
		//������ �ݾ�
		int sumAmt = 0;
		for(int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine());
			// ���� a�� ���� b
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sumAmt = sumAmt + a * b;
		}
		
		//������ �ݾװ� ������ �� �ݾ׺�
		if ( X == sumAmt )
			System.out.println("Yes");
		else
			System.out.println("No");
		

	}

}
