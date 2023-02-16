import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1712 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//손익 분기점
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 고정비용 
		int A = Integer.parseInt(st.nextToken());
		// 가변비용
		int B = Integer.parseInt(st.nextToken());
		// 노트북 판매가격
		int C = Integer.parseInt(st.nextToken());
		
		/*
		 * 예시 1) 1000 + 70 * (X) < 170 * X
		 * X = A / (C - B) + 1 (단, C - B <= 0) 없는것으로 간주, 
		 * C <= B (가격이 가변비용보다 작거나 같으면 없다는 결론이 나옴)
		 * 
		 * 
		 * */
		if( C  <= B)
			System.out.println("-1");
		else 
			System.out.println( (A / (C - B)) + 1);


	}

}
