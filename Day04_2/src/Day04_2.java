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
		System.out.printf("�� �̸�: %s\n", name);
		color = pcolor;
		System.out.printf("�� ��: %s\n", color);
		number = pnumber;
		System.out.printf("���� ��ȣ: %d\n", number);	
		address = paddress;
		System.out.printf("������ �ּ�: %s\n", address);
		velocity = pvelocity;
		System.out.printf("�ӵ�: %d\n", velocity);
		
		

	}//end of car_def
}//end of car_class

public class Day04_2 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �̸��� �Է��Ͻÿ�. :");
		String my_name = sc.nextLine();
		System.out.print("�� ���� �Է��Ͻÿ�. :");
		String my_color = sc.nextLine();
		System.out.print("������ȣ�� �Է��Ͻÿ�. :");
		int my_number = sc.nextInt();
		sc.nextLine();
		System.out.print("������ �ּҸ� �Է��Ͻÿ�. :");
		String my_address = sc.nextLine();
		System.out.print("�ӵ��� �Է��Ͻÿ�. :");
		int my_velocity = sc.nextInt();
		
		Car my_car = new Car(my_name, my_color, my_number, my_address, my_velocity);
		
        sc.close();
	}//end of main
}//end of class
