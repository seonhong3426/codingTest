
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1157 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		
		//대문자와 소문자 관계없기 때문에 소문자가 들어오면 대문자로 변환하자.
		String upperStr = str.toUpperCase();
		//System.out.println(upperStr);
		
		//A~Z까지의 개수를 담는 배열 선언
		int arr[] = new int[26];
		// 초기화
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		for(int i = 0 ; i < upperStr.length(); i++) {
			//해당 문자가 있으면 해당 문자의 인덱스값에 해당하는 카운트 값을 1씩 증가한다.
			int index = upperStr.charAt(i) - 'A';
			arr[index]++;
		}
		//문자가 존재하는 개수의 최대값과 그 문자가 존재하는 index를 담는 변수
		int max = 0;
		int index = 0;
		for(int i = 0 ; i < arr.length; i++) {
			if( arr[i] != 0 ) {
				// 0이 아닌 중에
				if( max < arr[i]) {
					max = arr[i]; //개수가 최대인것을 max값에 담고 
					index = i + 'A'; //해당 인덱스도 저장한다.
				}
				else if( max == arr[i]) {
					//최대값의 개수가 같은것이 나오면 index = 0으로 초기화한다.
					index = 0;
					
				}
			}
		}
		if(index == 0) {
			System.out.println("?");
		}
		else
			System.out.println((char)index);
		



	}

}
