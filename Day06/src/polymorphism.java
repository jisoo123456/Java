abstract class Mammal{
//�߻� Ŭ����: �߻� �޼ҵ带 ������ ������ �ǹ�
//ex_ Mammal�� moving(�߻�޼ҵ�) �ֱ� ������ �߻�Ŭ������ �ȴ�.
//�߻� Ŭ������ ����� ���� ����
//�߻� Ŭ���� �ܵ����� ��ü ����x
	
	abstract public void moving(); 
	//moving�޼ҵ�� �Ӹ��� �ְ� ������ ���� �߻�޼ҵ�
	//������ movingȣ���ص� man�� �ִ� moving�� ȣ��Ǳ⿡ ���ǹ��ؼ� �߻�޼ҵ�� ����
	//�߻�޼ҵ�: �߰��� ����
	
	public Mammal()
	{System.out.println("[�� Mammal�� �⺻ ������]"); }
	
	public void talk()
	{System.out.println("[�� Mammal�� talk()�̴�]");}  
	
	public void show()
	{System.out.println("[�� Mammal�� show()�̴�]");}  
	
}//end of Mammal_class

class Person_01 extends Mammal {

	protected final int IQ = 140;
	protected String name = null;  
	protected int age = 0;  
	static char blood = 'A';
	
	public Person_01()  
	{
		System.out.println("[�� Person�⺻������]");
		System.out.println(name);
	}
	
	public Person_01(String name, int age)
	{   
		super();
		this.name = name;
		this.age = age;
		System.out.println("[�� �Ű����� �ΰ��� Person ������]");
		System.out.printf("name=%s\n", name);
		System.out.printf("age=%s\n", age);
	}
	
	public void setName(String name)
	{this.name = name;}  
	
	public String getName()
	{return name;}  
	
	public void setAge(int page)
	{age = page;}
	
	public int getAge()
	{return age;}
	
	public void talk()  
 	{   //name = "�ƹ���";  
		System.out.println("talk()�޼����̴�."); }  
	
	public void talk(String shouting) {
		System.out.printf("shouting=%s\n", shouting);		
	}
	
	public void talk(String shouting, int page) {
		System.out.printf("shouting=%s\n", shouting);
		System.out.printf("page=%d\n", page);
	}
	
	public void talk(int page, String shouting) {
		System.out.printf("shouting=%s\n", shouting);
		System.out.printf("page=%d\n", page);
	}
	
	public void breathe()
	{ }  
	
	public static void display()
	{
		System.out.printf("blood=%c\n", blood);
	}
	
	//�������̵�
	public void show()
	{
	super.show();
	System.out.println("[�� Person�� show()]");
	System.out.printf("name=%s\n", name);
	System.out.printf("age=%s\n", age);
	}
	
	public void moving()
	{
		System.out.println("Person�� �����δ�.");
	}
	
}  //end of person_class

class Man extends Person_01{ 

	final int IQ = 150;
	private int money;
	private String job;
	
	public Man()
	{System.out.println("[���� Man�� �⺻������]");}
	
	public Man(String name, int age, int money, String job)
	{   
		super(name, age);
		
		System.out.println("[�� ���� 4���� Man������]");
		this.money = money;
		this.job =job;
	}
	
	public void setJob(String job) 
	{this.job = job;}
	
	public String getJob()
	{return job;}
	
	public void show() //������
	{
		//super.show();
		//super�� �ٷ� ���� 1���θ��� ����Ŵ
		//superŬ������ show ���� �����Ű�� �����϶���ǹ�
		System.out.printf("Person�� IQ=%d\n",super.IQ);
		System.out.printf("Man�� IQ=%d\n",this.IQ);
//		System.out.printf("name=%s\n", name);
//		System.out.printf("age=%s\n", age);
		System.out.printf("money=%d\n", money);
		System.out.printf("job=%s\n", job);
	}
	
	public void work()
	{System.out.println("Man�� ���Ѵ�.");}
	
	public void moving()
	{
		System.out.println("Man�� �����δ�.");
	}
	
}//end of Man_class

public class polymorphism {

	public static void main(String[] args) {
		
//		Man jaesuk_ = new Man("���缮", 51, 70000, "����MC");
//		Person_01 jaesuk_ = new Man("���缮", 51, 70000, "����MC");
		//Ÿ���� person�̶� personó�� �ൿ->jaesuk.show()ȣ��x->�缮��ü�� show�� �ֱ���(�ذ���: �޼ҵ� �������̵�)
		//������: �缮�� Ÿ���� Man���ε� person���ε� mammal���ε� �پ��ϰ� �� �� ��
		
		Mammal jaesuk = new Man("���缮", 51, 7000, "����mc");
		
		jaesuk.talk();
		//person�� talk
		jaesuk.show();
		//Man�� show
		//�ڽ� Ŭ������ show()���
		//Mammal Ÿ���̶� ������ Mammal show()->person_01 �������̵� show->Man �������̵� show
		jaesuk.moving();

	}//end of main

}//end of class
