import java.util.Scanner;

class Car{
	protected int vel = 0;
	protected int numb = 0;
	protected String name = null;
	protected String col;
	protected String add = null;
	
}//end of Car_class

class LentCar extends Car{ //����
	int fare = 0;
	String comp = null;
	String kinds = null;
	Scanner sc = new Scanner(System.in);
	
	public LentCar(String kinds, String col, int numb, String add, int vel, int fare, String comp) {
		this.kinds = kinds;
		System.out.printf("\n�ڵ�������: %s\n", this.kinds);
		this.col = col;
		System.out.printf("�ڵ�������: %s\n", this.col);
		this.numb = numb;
		System.out.printf("�ڵ�����ȣ: %d\n", this.numb);
		this.add = add;
		System.out.printf("�������ּ�: %s\n", this.add);
		this.vel = vel;
		System.out.printf("���� �ڵ����� �ӵ��� �ü� %dkm/h�Դϴ�.\n", this.vel);
		this.fare = fare;
		System.out.printf("��Ʈ���: %d\n", this.fare);
		this.comp = comp;
		System.out.printf("��Ʈȸ���: %s\n", this.comp);
		
		System.out.print("�ӵ��� �󸶳� �ø��ðڽ��ϱ�:");
		int up_vel = sc.nextInt();
		System.out.printf("���� �ڵ����� �ӵ��� �ü� %dkm/h �Դϴ�.\n", this.vel+up_vel);
		System.out.print("�ӵ��� �󸶳� �����ðڽ��ϱ�:");
		int down_vel = sc.nextInt();
		System.out.printf("���� �ڵ����� �ӵ��� �ü� %dkm/h �Դϴ�.\n", this.vel+up_vel-down_vel);
		
		
	}//end of LentCar�⺻ ������
	
	
}//end of LentCar_class

public class Day05_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�ڵ������� �Է��Ͻÿ�:");
		String kinds = sc.nextLine();
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
		
		//LentCarŬ���� ��ü ����
		LentCar my = new LentCar(kinds, col, numb, add, vel, fare, comp);
	
		
    sc.close();
	}//end of main

}//end of class
