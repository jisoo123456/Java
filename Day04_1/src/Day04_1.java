import java.util.Scanner;

public class Day04_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] Lotto = new int[6];
		int i = 0;
		do {
			System.out.println("�ζǹ�ȣ �Է�:");
			int number = sc.nextInt();
			Lotto[i] = number;
			 
			for(int j = 0; j < i; j++) {		
					if(Lotto[j] == Lotto[i]) {
						System.out.println("���� ��ȣ�� �ֽ��ϴ�!\n");
						i--;
						
				}//end of if
			    
			}//end of for
			
		    i++;
		} while(i <= 5);
		System.out.printf("�Էµ� �ζǹ�ȣ: %d %d %d %d %d %d", Lotto[0], Lotto[1],Lotto[2], Lotto[3], Lotto[4], Lotto[5]);
		
    sc.close();
	}//end of main
}//end of class
