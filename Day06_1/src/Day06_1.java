import java.util.Scanner;

class Car{
	protected int vel = 0;
	protected int numb = 0;
	protected String name = null;
	protected String col;
	protected String add = null;
	
	Scanner sc = new Scanner(System.in);
	
	public Car()
	{}
	
	public Car(String name, String col, int numb, String add, int vel)
	{
		this.vel = vel;
		System.out.printf("���� �ӵ�: %d\n", this.vel);
		this.name = name;
		System.out.printf("�ڵ����̸�:%s\n", this.name);
		this.col = col;
		System.out.printf("�ڵ�������: %s\n", this.col);
		this.numb = numb;
		System.out.printf("�ڵ�����ȣ: %d\n", this.numb);
		this.add = add;
		System.out.printf("�������ּ�: %s\n", this.add);

	}//end of Car�⺻������
	
}//end of Car_class

class LentCar extends Car{ //����

	Scanner sc = new Scanner(System.in);
	
	int fare = 0;
	String comp = null;
	String kinds = null;

	
	public LentCar(String name, String col, int numb, String add, int vel, int fare, String comp)
	{   
		super(name, col, numb, add, vel);
		
		this.fare = fare;
		System.out.printf("��Ʈ���: %d\n", this.fare);
		this.comp = comp;
		System.out.printf("��Ʈȸ���: %s\n", this.comp);	
		
		System.out.print("�ӵ��� �󸶳� �ø��ðڽ��ϱ�:");
		int up_vel = sc.nextInt();
		System.out.printf("���� �ӵ�: %d\n", this.vel+up_vel);
		System.out.print("�ӵ��� �󸶳� �����ðڽ��ϱ�:");
		int down_vel = sc.nextInt();
		System.out.printf("���� �ӵ�: %d\n", this.vel+up_vel-down_vel);
		
	}//end of LentCar�⺻ ������
	
	
}//end of LentCar_class

public class Day06_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ڵ����̸� �Է��Ͻÿ�:");
		String name = sc.nextLine();
		System.out.print("�ڵ������� �Է��Ͻÿ�:");
		String col = sc.nextLine();
		System.out.print("�ڵ�����ȣ �Է��Ͻÿ�:");
		int numb = sc.nextInt();
		sc.nextLine();
		System.out.print("�������ּ� �Է��Ͻÿ�:");
		String add = sc.nextLine();
		System.out.print("�ڵ����ӵ��� �Է��Ͻÿ�:");
		int vel = sc.nextInt();	
		System.out.print("��Ʈ�� �Է��Ͻÿ�:");
		int fare = sc.nextInt();		
		sc.nextLine();
		System.out.print("��Ʈȸ�縦 �Է��Ͻÿ�:");
		String comp = sc.nextLine();
		
        LentCar my = new LentCar(name, col, numb, add, vel, fare, comp);
	
		

	}

}
