package 백준;

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
		
		//제출한 학생의 출석번호를 담기 위한 배열 선언
		int arr[] = new int[SUBMIT];
		//전체 학생 수의 출석번호를 담기 위한 배열 선언
		int classNum[] = new int[STUDENT];
		
		//학생수만큼 출석번호를 배열에 담아준다.
		for(int i = 0; i < classNum.length; i++) {
			classNum[i] = i+1; //1~30
		}
		//제출한 학생의 출석번호를 담아준다.
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean check = false; //해당 출석번호를 가진 학생이 제출을 했는지 확인하기 위한 bool변수
		for(int stu : classNum) {
			
			check = false;
			for(int i = 0; i < arr.length; i++) {
				if( stu == arr[i] ) {
					//제출한 학생이면
					check = true;
					break; // 중복이 없으므로 제출 된 것이 확인되면 반복문을 중단해준다.
				}
			}
			
			if(!check) {
				System.out.println(stu);
			}
						
			
		}
		
		
		

	}

}
