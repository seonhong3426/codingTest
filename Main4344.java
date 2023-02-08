package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4344 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		//Test Case : C
		int C = Integer.parseInt(st.nextToken());
		double answerRate[] = new double[C];
		
		
		
		
		for(int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int sum = 0;
			double avg = 0;
			int count = 0;
			int arr[] = new int[N];
			
			for(int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			avg = sum / N;

			for(int j = 0; j < arr.length; j++) {
				if( arr[j] > (int)avg ) {
					count++;
				}
			}
			answerRate[i] = Math.round((float)count / (float)N * 100 * 1000) / 1000.0;
		}
		
		for(int i = 0; i < answerRate.length; i++) {
			System.out.printf( "%6.3f", answerRate[i]);
			System.out.println("%");
		}
			
		

	}

}
