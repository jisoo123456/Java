package edu.forextwo;

public class while_ {
	public static void main(String[] args) {
		int i = 0;
		while(i <= 7)
		{
			System.out.printf("i=%d\n", i);
		    ++i;
		}  //end of while
		
		//무한반복문
		//while(true)
		//	System.out.println("while 무한반복");
		
		System.out.println();
		int k = 0;
		do {
			System.out.printf("k=%d\n", k);
			++k;
		} while(k <= 7);  
	
	}  //end of main

}  //end of class
