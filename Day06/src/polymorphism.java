abstract class Mammal{
//추상 클래스: 추상 메소드를 가지고 있음을 의미
//ex_ Mammal에 moving(추상메소드) 있기 때문에 추상클래스가 된다.
//추상 클래스는 상속을 위해 만듦
//추상 클래스 단독으로 객체 생성x
	
	abstract public void moving(); 
	//moving메소드는 머리만 있고 몸통은 없는 추상메소드
	//어차피 moving호출해도 man에 있는 moving이 호출되기에 무의미해서 추상메소드로 만듦
	//추상메소드: 중개인 역할
	
	public Mammal()
	{System.out.println("[난 Mammal의 기본 생성자]"); }
	
	public void talk()
	{System.out.println("[난 Mammal의 talk()이다]");}  
	
	public void show()
	{System.out.println("[난 Mammal의 show()이다]");}  
	
}//end of Mammal_class

class Person_01 extends Mammal {

	protected final int IQ = 140;
	protected String name = null;  
	protected int age = 0;  
	static char blood = 'A';
	
	public Person_01()  
	{
		System.out.println("[난 Person기본생성자]");
		System.out.println(name);
	}
	
	public Person_01(String name, int age)
	{   
		super();
		this.name = name;
		this.age = age;
		System.out.println("[난 매개변수 두개인 Person 생성자]");
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
 	{   //name = "아무개";  
		System.out.println("talk()메서드이다."); }  
	
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
	
	//오버라이딩
	public void show()
	{
	super.show();
	System.out.println("[난 Person의 show()]");
	System.out.printf("name=%s\n", name);
	System.out.printf("age=%s\n", age);
	}
	
	public void moving()
	{
		System.out.println("Person이 움직인다.");
	}
	
}  //end of person_class

class Man extends Person_01{ 

	final int IQ = 150;
	private int money;
	private String job;
	
	public Man()
	{System.out.println("[나는 Man의 기본생성자]");}
	
	public Man(String name, int age, int money, String job)
	{   
		super(name, age);
		
		System.out.println("[난 인자 4개인 Man생성자]");
		this.money = money;
		this.job =job;
	}
	
	public void setJob(String job) 
	{this.job = job;}
	
	public String getJob()
	{return job;}
	
	public void show() //재정의
	{
		//super.show();
		//super는 바로 앞의 1차부모만을 가르킴
		//super클래스의 show 먼저 실행시키고 복귀하라는의미
		System.out.printf("Person의 IQ=%d\n",super.IQ);
		System.out.printf("Man의 IQ=%d\n",this.IQ);
//		System.out.printf("name=%s\n", name);
//		System.out.printf("age=%s\n", age);
		System.out.printf("money=%d\n", money);
		System.out.printf("job=%s\n", job);
	}
	
	public void work()
	{System.out.println("Man이 일한다.");}
	
	public void moving()
	{
		System.out.println("Man이 움직인다.");
	}
	
}//end of Man_class

public class polymorphism {

	public static void main(String[] args) {
		
//		Man jaesuk_ = new Man("유재석", 51, 70000, "국민MC");
//		Person_01 jaesuk_ = new Man("유재석", 51, 70000, "국민MC");
		//타입이 person이라 person처럼 행동->jaesuk.show()호출x->재석객체에 show가 있긴함(해결방안: 메소도 오버라이딩)
		//다형성: 재석의 타입을 Man으로도 person으로도 mammal으로도 다양하게 볼 수 ㅇ
		
		Mammal jaesuk = new Man("유재석", 51, 7000, "국민mc");
		
		jaesuk.talk();
		//person의 talk
		jaesuk.show();
		//Man의 show
		//자식 클래스의 show()출력
		//Mammal 타입이라 순서가 Mammal show()->person_01 오버라이딩 show->Man 오버라이딩 show
		jaesuk.moving();

	}//end of main

}//end of class
