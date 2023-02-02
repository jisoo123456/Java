
public class Day06_2 {

	public static void main(String[] args) {
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i <= 9; i++) {
			if(num[i] % 2 == 0)
			{
//				int x = num[i];//2
//				int y = num[i-1];
//				
//				num[i-1] = x;//1
//				num[i] = y;//2
				
				int temp = num[i];
				num[i] = num[i-1];
				num[i-1] = temp;
			}
		}//end of for
		
		for(int k = 0; k <= 9; k++) {
			System.out.print(num[k]);
			System.out.print("  ");
		}
	}//end of main

}//end of class
