import java.util.Scanner;
public class Day03_2 {

	public static void main(String[] args) {
		System.out.print("소수를 구할 정수 한개 입력:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		
		for(int i = 2; i <=number; i++) 
		{
			boolean flag = false; //false면 소수 아닌 경우가 true, True면 소수 아닌 경우 false 반대로
			for(int k = 2; k < i; k++) {
				if(i % k == 0) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				count = count + 1;
				System.out.printf("%d은(는) 소수이다.\n", i);
			}

			
		}//end of for1
		System.out.printf("1~%d사이의 소수 개수=%d\n", number, count);
	}//end of main

}//end of class
