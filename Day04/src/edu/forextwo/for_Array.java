package edu.forextwo;

public class for_Array {
	public static void main(String[] args) {
		//아래 for문은 무한반복문
		//for( ; ; )
		//	System.out.println("book");
		
		int num[] = {1,2,3};  
		//배열(array)- 파이썬의 list와 비슷
		//가변배열
		
		for(int k : num)  //읽기전용 for문(in : from) //배열하고 컬렉션에 사용하는 for문
			System.out.printf("k=%d\n", k);
		
		
		
		for(int i = 0; i <= 2; ++i)
			System.out.printf("num[%d]=%d\n", i, num[i]);
		
		System.out.printf("num[0]=%d\n", num[0]);
		System.out.printf("num[1]=%d\n", num[1]);
		System.out.printf("num[2]=%d\n", num[2]);
		
		
		int Val[] = new int[] {10, 20 , 30};
		System.out.println(Val[1]);
		
		int val[] = new int[3];
		val[0] = 10; val[1] = 20; val[2] = 30;
		
		for (int i=0; i<=2; i++)
			System.out.printf("val[%d]=%d\n", i, val[i]);
		
	}  //end of main

}  //end of class
