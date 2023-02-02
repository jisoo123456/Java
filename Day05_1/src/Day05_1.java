import java.util.Scanner;

class Car{
	protected int vel = 0;
	protected int numb = 0;
	protected String name = null;
	protected String col;
	protected String add = null;
	
}//end of Car_class

class LentCar extends Car{ //종류
	int fare = 0;
	String comp = null;
	String kinds = null;
	Scanner sc = new Scanner(System.in);
	
	public LentCar(String kinds, String col, int numb, String add, int vel, int fare, String comp) {
		this.kinds = kinds;
		System.out.printf("\n자동차종류: %s\n", this.kinds);
		this.col = col;
		System.out.printf("자동차색깔: %s\n", this.col);
		this.numb = numb;
		System.out.printf("자동차번호: %d\n", this.numb);
		this.add = add;
		System.out.printf("운전자주소: %s\n", this.add);
		this.vel = vel;
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h입니다.\n", this.vel);
		this.fare = fare;
		System.out.printf("렌트요금: %d\n", this.fare);
		this.comp = comp;
		System.out.printf("렌트회사명: %s\n", this.comp);
		
		System.out.print("속도를 얼마나 올리시겠습니까:");
		int up_vel = sc.nextInt();
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h 입니다.\n", this.vel+up_vel);
		System.out.print("속도를 얼마나 내리시겠습니까:");
		int down_vel = sc.nextInt();
		System.out.printf("현재 자동차의 속도는 시속 %dkm/h 입니다.\n", this.vel+up_vel-down_vel);
		
		
	}//end of LentCar기본 생성자
	
	
}//end of LentCar_class

public class Day05_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("자동차종류 입력하시오:");
		String kinds = sc.nextLine();
		System.out.print("자동차색깔 입력하시오:");
		String col = sc.nextLine();
		System.out.print("자동차번호 입력하시오:");
		int numb = sc.nextInt();
		sc.nextLine();
		System.out.print("운전자주소 입력하시오:");
		String add = sc.nextLine();
		System.out.print("자동차속도를 입력하시오:");
		int vel = sc.nextInt();
		System.out.print("렌트비를 입력하시오:");
		int fare = sc.nextInt();
		sc.nextLine();
		System.out.print("렌트회사를 입력하시오:");
		String comp = sc.nextLine();		
		
		//LentCar클래스 객체 생성
		LentCar my = new LentCar(kinds, col, numb, add, vel, fare, comp);
	
		
    sc.close();
	}//end of main

}//end of class
