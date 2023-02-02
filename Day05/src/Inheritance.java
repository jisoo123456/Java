class Person_01{
//Person class�� ���� ������ ���α׷��̴�. �Լ��� ������ ��� ������ �����ϱ� ����(�������� private�̶�)���̱⿡ ���� ������ ���α׷��̴�.	
	protected final int IQ = 140;
	protected String name = null;  
	//protected�� public�� private�� ���̷� �ڽ�Ŭ���������� ������ ����
	protected int age = 0;  
	
	static char blood = 'A';
	
	public Person_01()  
	{
		System.out.println("[�� Person�⺻������]");
		System.out.println(name);
	}//end of person(1)
	//�⺻�����ڰ� �־�� ��� ���� �� o
	
	public Person_01(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("[�� �Ű����� �ΰ��� Person ������]");
		System.out.printf("name=%s\n", name);
		System.out.printf("age=%s\n", age);
	}//end of person(2)
	
	public void setName(String name)
	{this.name = name;}  //end of setName
	
	public String getName()
	{return name;}  //end of getName
	
	public void setAge(int page)
	{age = page;}
	
	public int getAge()
	{return age;}
	
	public void talk()  
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
	
	public static void display()
	{
		System.out.printf("blood=%c\n", blood);
	}//end of display
}  //end of person_class

class Man extends Person_01  //���
{
	final int IQ = 150;
	//�θ� Ŭ������ ����ť�� 140, �ڽ� Ŭ������ ����ť�� 150
	private int money;
	private String job;
	
	public Man()
	{System.out.println("[���� Man�� �⺻������]");}
	
	public Man(String name, int age, int money, String job)
	{   
		//super�� ������ �������� �ڵ��ߺ��� �ִ��� �ƴ���(�ߺ��� �������)
		//super();
		//Person�� �⺻ ������ ȣ��
		super(name, age);
		//Person�� �Ű����� �ΰ��� ������ ȣ��
		//super���� Ÿ���� �� �ʿ�x
		
		System.out.println("[�� ���� 4���� Man������]");
		//this.name = name;  //name�� age�� super�� ��ӹ���
		//this.age = age;
		this.money = money;
		this.job =job;
	}
	
	public void setJob(String job) 
	{this.job = job;}
	
	public String getJob()
	{return job;}
	
	public void show() 
	{
		System.out.printf("Person�� IQ=%d\n",super.IQ);
		System.out.printf("Man�� IQ=%d\n",this.IQ);
		//����� ������ ã�� ������ �ڽ�Ŭ������ ����ť�� ��µȴ�.
		//�θ�Ŭ������ ����ť�� ����ϰ� ������ �θ�Ŭ������ get,set�Լ�Ȱ�� Ȥ�� superŰ���� ���
		System.out.printf("name=%s\n", name);
		System.out.printf("age=%s\n", age);
		System.out.printf("money=%d\n", money);
		System.out.printf("job=%s\n", job);
	}
	public void work()
	{System.out.println("Man�� ���Ѵ�.");}//end of work
	
	
}//end of Man_class


public class Inheritance {

	public static void main(String[] args) {
		Person_01 chulsu = new Person_01();
		chulsu.name = "ö��";
		//Inheritance class�� Person_01�� ��Ӱ���� �ƴ����� ���� ��Ű�� �ȿ� �ֱ� ������ Person�� Inheritance�� ������ �����Ѵ�.
		System.out.printf("chulsu.name=%s\n", chulsu.name);
		
		Man wonbin = new Man();  
		//wonbin_�̶�� ���� �̸��� new_Man���� �Ҵ�
		//person_01�⺻ �����ڰ� ����->Man �⺻ ������ ����(�θ� Ŭ������ ������ �Ǿ�� �ڽ� Ŭ������ ������ �Ǿ�� �Ѵ�.)
		//Person_01 wonbin_ = new Man() ����(������)
		
		wonbin.setName("����");
		//setName�̶�� �޼ҵ带 ã���� �����(Man �ν��Ͻ��̴ϱ�) Man class�� ���� ���� ��쿡 person_01class�� ��
		wonbin.work();
		System.out.printf("wonbin.setName=%s\n", wonbin.getName());
		wonbin.setJob("������");
	    System.out.printf("%s�� ������ %s\n", wonbin.name, wonbin.getJob());
	    
	    Man jaesuk = new Man("���缮", 51, 70000, "����MC");
	    //Man�� �⺻�����ڿ� Person�� �⺻������ ����(Person�� �⺻�����ڴ� �Ű������� ���°Ŷ� �ΰ��� �� �� �����Ϸ��� ���°ɷ� ����//super method�� ����ڰ� ���� �� �ִٰ� ��)
	    jaesuk.show();;
		
	}//end of main

}//end of class
