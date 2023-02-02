class Person_01{
//Person class는 변수 위주의 프로그램이다. 함수가 많지만 모두 변수에 접근하기 위함(변수들이 private이라)이이기에 변수 위주의 프로그램이다.	
	protected final int IQ = 140;
	protected String name = null;  
	//protected는 public과 private의 사이로 자식클래스에서만 접근이 가능
	protected int age = 0;  
	
	static char blood = 'A';
	
	public Person_01()  
	{
		System.out.println("[난 Person기본생성자]");
		System.out.println(name);
	}//end of person(1)
	//기본생성자가 있어야 상속 받을 수 o
	
	public Person_01(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("[난 매개변수 두개인 Person 생성자]");
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
 	{   name = "아무개";  //name에 같은 멤버이기 때문에 접근 가능
		System.out.println("talk()메서드이다."); }  //end of talk1(1)
	
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

class Man extends Person_01  //상속
{
	final int IQ = 150;
	//부모 클래스의 아이큐는 140, 자식 클래스의 아이큐는 150
	private int money;
	private String job;
	
	public Man()
	{System.out.println("[나는 Man의 기본생성자]");}
	
	public Man(String name, int age, int money, String job)
	{   
		//super의 기준은 생성자의 코드중복이 있는지 아닌지(중복이 없어야함)
		//super();
		//Person의 기본 생성자 호출
		super(name, age);
		//Person의 매개변수 두개인 생성자 호출
		//super에는 타입을 쓸 필요x
		
		System.out.println("[난 인자 4개인 Man생성자]");
		//this.name = name;  //name과 age는 super로 상속받음
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
		System.out.printf("Person의 IQ=%d\n",super.IQ);
		System.out.printf("Man의 IQ=%d\n",this.IQ);
		//가까운 데에서 찾기 때문에 자식클래스의 아이큐가 출력된다.
		//부모클래스의 아이큐를 출력하고 싶으면 부모클래스의 get,set함수활용 혹은 super키워드 사용
		System.out.printf("name=%s\n", name);
		System.out.printf("age=%s\n", age);
		System.out.printf("money=%d\n", money);
		System.out.printf("job=%s\n", job);
	}
	public void work()
	{System.out.println("Man이 일한다.");}//end of work
	
	
}//end of Man_class


public class Inheritance {

	public static void main(String[] args) {
		Person_01 chulsu = new Person_01();
		chulsu.name = "철수";
		//Inheritance class와 Person_01이 상속관계는 아니지만 같은 패키지 안에 있기 때문에 Person에 Inheritance가 접근이 가능한다.
		System.out.printf("chulsu.name=%s\n", chulsu.name);
		
		Man wonbin = new Man();  
		//wonbin_이라는 변수 이름에 new_Man공간 할당
		//person_01기본 생성자가 실행->Man 기본 생성자 실행(부모 클래스가 생성이 되어야 자식 클래스가 생성이 되어야 한다.)
		//Person_01 wonbin_ = new Man() 가능(다형성)
		
		wonbin.setName("원빈");
		//setName이라는 메소드를 찾으러 가까운(Man 인스턴스이니까) Man class에 가고 없는 경우에 person_01class에 감
		wonbin.work();
		System.out.printf("wonbin.setName=%s\n", wonbin.getName());
		wonbin.setJob("연예인");
	    System.out.printf("%s의 직업은 %s\n", wonbin.name, wonbin.getJob());
	    
	    Man jaesuk = new Man("유재석", 51, 70000, "국민MC");
	    //Man의 기본생성자와 Person의 기본생성자 생성(Person의 기본생성자는 매개변수가 없는거랑 두개인 거 중 컴파일러가 없는걸로 생성//super method로 사용자가 정할 수 있다고 함)
	    jaesuk.show();;
		
	}//end of main

}//end of class
