//1번문제(이중for문으로 구구단함수만들어서 호출해보기)
public class Day03_1 {
	public static void main(String[] args) {
		int dan = 0, value = 0;
		for(dan = 2; dan <=9; dan=dan+4)
		{
			for(value = 1; value <=9; value++) 
			{
				for(int new_dan = dan; new_dan < dan + 4; new_dan++)
				{
					System.out.printf("%d*%d=%d\t", new_dan, value, new_dan*value);	
				}//end of for3
				System.out.println();
			}//end of for2
			System.out.println();
		}//end of for1
					
			   
		
	}//end of main 

}//end of class
