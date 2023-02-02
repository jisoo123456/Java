import java.util.Scanner;

class Car {	
	private String name = null;
	private String color = null;
	private int number = 0;
	private String address = null;
	private int velocity = 0;
		
	
	public Car(String pname, String pcolor, int pnumber, String paddress, int pvelocity)
	{
		name = pname;
		System.out.printf("차 이름: %s\n", name);
		color = pcolor;
		System.out.printf("차 색: %s\n", color);
		number = pnumber;
		System.out.printf("차량 번호: %d\n", number);	
		address = paddress;
		System.out.printf("운전자 주소: %s\n", address);
		velocity = pvelocity;
		System.out.printf("속도: %d\n", velocity);
		
		

	}//end of car_def
}//end of car_class

public class Day04_2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("차 이름을 입력하시오. :");
		String my_name = sc.nextLine();
		System.out.print("차 색을 입력하시오. :");
		String my_color = sc.nextLine();
		System.out.print("차량번호를 입력하시오. :");
		int my_number = sc.nextInt();
		sc.nextLine();
		System.out.print("운전자 주소를 입력하시오. :");
		String my_address = sc.nextLine();
		System.out.print("속도를 입력하시오. :");
		int my_velocity = sc.nextInt();
		
		Car my_car = new Car(my_name, my_color, my_number, my_address, my_velocity);
		
        sc.close();
	}//end of main
}//end of class
