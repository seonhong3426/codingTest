package ����;

import java.io.*;
import java.util.StringTokenizer;
public class Main2525 {

	private final static int SIXTY = 60;
	private final static int TWENTY_FOUR = 24;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * ù° �ٿ� ����Ǵ� �ð��� �ÿ� ���� ������ ���̿� �ΰ� ����Ѵ�. 
		 * (��, �ô� 0���� 23������ ����, ���� 0���� 59������ �����̴�. ������ �ð�� 23�� 59�п��� 1���� ������ 0�� 0���� �ȴ�.)
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// �ð�
		int A = Integer.parseInt(st.nextToken());
		
		// ��
		int B = Integer.parseInt(st.nextToken());
		
		// �ҿ�ð� (��)
		st = new StringTokenizer(br.readLine());
		
		int C = Integer.parseInt(st.nextToken());
		
		A = A + (C / SIXTY);
		B = B + (C % SIXTY);
		
		// �� üũ
		if(B >= SIXTY) {
			B = B - SIXTY;
			A = A + 1;
		}
		
		// �� üũ
		if(A >= TWENTY_FOUR) {
			A = A - TWENTY_FOUR;
		}
		
		System.out.println(A + " " + B);
		
			
		
		
		
		
		
		
		
		
		

	}

}
