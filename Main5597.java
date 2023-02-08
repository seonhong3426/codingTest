package ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main5597 {

	private final static int SUBMIT = 28;
	private final static int STUDENT = 30;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st ; 
		
		//������ �л��� �⼮��ȣ�� ��� ���� �迭 ����
		int arr[] = new int[SUBMIT];
		//��ü �л� ���� �⼮��ȣ�� ��� ���� �迭 ����
		int classNum[] = new int[STUDENT];
		
		//�л�����ŭ �⼮��ȣ�� �迭�� ����ش�.
		for(int i = 0; i < classNum.length; i++) {
			classNum[i] = i+1; //1~30
		}
		//������ �л��� �⼮��ȣ�� ����ش�.
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean check = false; //�ش� �⼮��ȣ�� ���� �л��� ������ �ߴ��� Ȯ���ϱ� ���� bool����
		for(int stu : classNum) {
			
			check = false;
			for(int i = 0; i < arr.length; i++) {
				if( stu == arr[i] ) {
					//������ �л��̸�
					check = true;
					break; // �ߺ��� �����Ƿ� ���� �� ���� Ȯ�εǸ� �ݺ����� �ߴ����ش�.
				}
			}
			
			if(!check) {
				System.out.println(stu);
			}
						
			
		}
		
		
		

	}

}
