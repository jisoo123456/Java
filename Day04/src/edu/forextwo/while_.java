package edu.forextwo;

public class while_ {
	public static void main(String[] args) {
		int i = 0;
		while(i <= 7)
		{
			System.out.printf("i=%d\n", i);
		    ++i;
		}  //end of while
		
		//���ѹݺ���
		//while(true)
		//	System.out.println("while ���ѹݺ�");
		
		System.out.println();
		int k = 0;
		do {
			System.out.printf("k=%d\n", k);
			++k;
		} while(k <= 7);  
	
	}  //end of main

}  //end of class
