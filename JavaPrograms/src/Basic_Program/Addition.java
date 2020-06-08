package Basic_Program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter fno");
		int a = Integer.parseInt(br.readLine());
		System.out.println("enter sno");
		int b = Integer.parseInt(br.readLine());
		int c = a + b;
		System.out.println("result:" + c);

	}

}
