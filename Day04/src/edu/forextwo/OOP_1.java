package edu.forextwo;

import java.util.Scanner;

class Person{
	//person Ŭ������ mainŬ������ ���� ��������
	private String name = null;  //�ʱⰪ
	private int age = 0;  
	//private(���ٱ���������)�� name, age�� ��� ��ü�� ������ �����̴� �ܺο��� ������� ���� ���ϵ��� ����
	//private���� ���� personŬ���� ���� �ٸ� class���� �������� ����
	
	public Person()  
	//�⺻ ������ ���� �����(������ �����Ϸ��� �ڵ����� �������)
	//������ �տ��� ��ȯŸ��ǥ��x
	{
		name = "a";
		System.out.println("[�� Person�⺻������]");
		System.out.println(name);
		//Person gildong_ = new Person();  �� �������� ����
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("[�� �Ű����� �ΰ��� Person ������]");
		System.out.printf("name=%s\n", name);
		System.out.printf("age=%s\n", age);
		
	}
	
	public void setName(String pname)
	{name = pname;}  //end of setName
	
	public String getName()
	{return name;}  //end of getName
	
	public void setAge(int page)
	{age = page;}
	
	public int getAge()
	{return age;}
	
	
	public void talk()  
	//public���� �ٸ� class���� ��ȣ�ۿ�(public�� �� �ٿ��� ������ ���������� ���߿� ��Ű������ ������ �� public �� �ٿ��ָ� ���x)
	//method(void: ��ȯ�ϴ� �� ������ �ǹ�, ��ȯ�� ������ �׿� �´� int_ Ȥ�� string�� ���� type �����ָ� ��)
 	{   name = "�ƹ���";  //name�� ���� ����̱� ������ ���� ����
		System.out.println("talk()�޼����̴�."); }  //end of talk1(1)
	
	public void talk(String shouting) {
		System.out.printf("shouting=%s\n", shouting);		
	}//end of talk(2)
	
	public void talk(String shouting, int page) {
		System.out.printf("shouting=%s\n", shouting);
		System.out.printf("page=%d\n", page);
	}//end of talk(3)
	
	public void talk(int page, String shouting) {
		System.out.printf("shouting=%s\n", shouting);
		System.out.printf("page=%d\n", page);
	}//end of talk(4)
	
	public void breathe()
	{ }  //end of breathe
	
}  //end of person


public class OOP_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myname = null;
		int myage = 0;
		System.out.print("�̸� �Է��Ͻÿ�:");
		myname = sc.nextLine();
		System.out.print("���̸� �Է��Ͻÿ�:");
		myage = sc.nextInt();
		
    	Person my = new Person(myname, myage);
				
		Person hodong = new Person("ȣ��", 45);
		
		hodong.setName("ȣ��");  //�Լ�ȣ��
		System.out.printf("hodong.name=%s\n", hodong.getName());
		hodong.setAge(53); 
		System.out.printf("hodong.age=%d\n", hodong.getAge());
		
		
		Person gildong = new Person();  
		//Person�̶�� Ŭ���� Ÿ��, gildong_�̶�� ��ü��������
		//()ǥ�÷� ���� �Լ��� ��->������ �Լ�(���̽��� __init__) / personŬ������ ���纻 ��, ��ü(instance)����
	    //gildong.name = "�浿"; 
		//System.out.printf("gildong.name=%s\n", gildong.name); [private�� ȣ�� �Ұ�]
		gildong.setName("�浿");
		System.out.printf("gildong.name=%s\n", gildong.getName());
		
		gildong.setAge(23); 
		System.out.printf("gildong.age=%d\n", gildong.getAge()); 
		
		//�޼��� �����ε�
		gildong.talk();
		gildong.talk("��������");
		gildong.talk("�浿", gildong.getAge());
		gildong.talk(24, "���浿");
		
		sc.close();
		
	}  //end of main

}//end of class