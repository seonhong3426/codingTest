package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main1271 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/**
		 *  (1 �� m �� n �� 10^1000, m�� n�� 10���� ����)
		 *  
		 * 
		 * */
		//�Է¹��� BufferReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//��ū
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// �ֹ��� ������ ���� �� N
		BigInteger baekN = new BigInteger(st.nextToken());
		
		// ���� ������ �� ����ü�Ǽ� M
		BigInteger bioM = new BigInteger(st.nextToken());
		
		// N�� ���� M���� ���������� �� �ݾ� ���
		System.out.println(bioM.bitCount());
		// N���� M������ ���������� ���� �� 
		//System.out.println(baekN % bioM);
		
		

	}

}
