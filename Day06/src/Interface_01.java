interface Ivehicle
//�������̽��� ����� ���� ����
//�������̽��� �ܵ����� ��ü ����x -> �������̽��� ��� �޴� Ŭ������ ���� ��ü ����o
{
	//int_ makeYear = 2022;
	//make_year�� ������ ������ �ƴ� ����� ����
    //final int_ makeyear_ = 2022;
	//public final int_ makeyear_ = 2022;
	//��� �� ���� makeYear�̴�.
	public static final int makeYear = 2022;
	
	//void start();
	//abstract void start();
	public abstract void start();
	
	//���� �ִ� �Ϲ� �޼ҵ� �Ұ��� �ذ���(default, static, private �� �ϳ��� ������)
	default public void stop()
	{System.out.println("�����Ѵ�");} 
	//default �������̽� �ȿ����� ��� ���� -> default�� ����� ������ �κ����� ����
	//�������̽� �⺻ ������ �״�� ����ϹǷ� �������̽��� �����Ӱ� ���ο� �޼ҵ� �߰�����
	
	private void show()
	{System.out.println("makeYear=" + makeYear);}
	//private: interface�ȿ����� �����ϰڴٴ� �ǹ�
	
	public static void turn()
	{System.out.println("������ȯ�Ѵ�");}
	
	static class Price{
		int salepercent = 10;
	}//end of class_Price
	
	public abstract void driving();
	
}//end of Ivehicle_interface

class Car extends Carrier implements Ivehicle{  
	
	public Car()
	{
		System.out.println("�� car�� �⺻ ������");
	}//end of car�⺻������
	
	@Override
	public void start() {
		//�ݵ�� �θ�Ŭ������ �߻� Ŭ������ �ڽ��� �������̵�, @override �������������� �������� ���� ���� ���� ����
		System.out.println("Car�� ����Ѵ�");
	}//end of start
	
	@Override
	public void stop() {
		//super.stop();  //interface�̾ �Ұ���, class�϶��� ���� ����
		//�������̵� �Ҷ��� default�� ���°�x
		System.out.println("Car�� �����Ѵ�.");
	}//end of stop
	
	public void driving()
	{
		System.out.println("Car Ÿ�� ����̺�");
	}
	
	@Override
	public void fetch() {
		System.out.println("Car�� �°��� ž�½�Ŵ");
	}//end of fetch
	
}//end of Car_class

class Carrier{
	public void fetch() {
		
		System.out.println("�°��� ����ϴ�");
	}//end of fetch
	
}//end of Carrier

public class Interface_01 {

	public static void main(String[] args) {
		//Car k5 = new Car();
		Ivehicle k5 = new Car(); 
		//up_casting: �ڽ�Ÿ���� ��ü�� �θ�Ÿ������ ���� ��
		//down_casting: �θ�Ÿ���� ��ü�� �ڽ�Ÿ������ ���� ��(��õ�ϴ� ���x)
		
		k5.start();
		k5.stop();
		//k5.turn();
	    Ivehicle.turn();
	    //turn�� static�̱⿡ turn�̶�� �޼ҵ�� ��ü�� �����Ǳ� ���� ������������ ����
	    //turn�� k5��ü�� ����� �ƴ����� Ivehicle_class�� ����� �´�
	    k5.driving();
	    //k5�� Ivehicle_Ÿ���϶� driving�޼ҵ尡 �ڽ�Ŭ������ car���� �ִٸ� ȣ��X
	    //((Car)k5).driving : �ٿ�ĳ����(�ӽ÷� CarŸ���� ��)
	   // k5.fetch(); ->�̰� �� �������� ����!!
		
	}//end of main

}//end of class
