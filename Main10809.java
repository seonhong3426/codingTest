package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main10809 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String str = st.nextToken();
		
		int arr[] = new int [25];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		
		for(int i = 0; i < str.length(); i++) {
			
			int index = str.charAt(i) - 97;
			//System.out.println(str.charAt(i) + ":" + index);
			if ( arr[index] != -1) {
				continue;
			}
			else {
				arr[index] = i;
			}
			
			
		}
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
