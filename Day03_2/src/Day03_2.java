import java.util.Scanner;
public class Day03_2 {

	public static void main(String[] args) {
		System.out.print("�Ҽ��� ���� ���� �Ѱ� �Է�:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;
		
		for(int i = 2; i <=number; i++) 
		{
			boolean flag = false; //false�� �Ҽ� �ƴ� ��찡 true, True�� �Ҽ� �ƴ� ��� false �ݴ��
			for(int k = 2; k < i; k++) {
				if(i % k == 0) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				count = count + 1;
				System.out.printf("%d��(��) �Ҽ��̴�.\n", i);
			}

			
		}//end of for1
		System.out.printf("1~%d������ �Ҽ� ����=%d\n", number, count);
	}//end of main

}//end of class
