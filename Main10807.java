package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10807 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// ������ ����
		int N = Integer.parseInt(st.nextToken());
		
		// �������� ���� �迭����
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		st = new StringTokenizer(br.readLine());
		
		//ã�� ����
		int v = Integer.parseInt(st.nextToken());
		
		//��ġ�ϴ� ����
		int answerCnt = 0; 
		for(int i = 0; i < arr.length; i++) {
			
			if( v == arr[i] )
				answerCnt++; 
		}
		
		System.out.println(answerCnt);
		


	}

}
