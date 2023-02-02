package edu.forextwo;

import java.util.Scanner;

class Person{
	//person 클래스와 main클래스는 서로 독립적임
	private String name = null;  //초기값
	private int age = 0;  
	//private(접근권한지정자)은 name, age는 사람 객체의 사적인 정보이니 외부에서 마음대로 접근 못하도록 해줌
	//private으로 인해 person클래스 말고 다른 class에서 접근하지 못함
	
	public Person()  
	//기본 생성자 직접 만들기(원래는 컴파일러가 자동으로 만들어줌)
	//생성자 앞에는 반환타입표시x
	{
		name = "a";
		System.out.println("[난 Person기본생성자]");
		System.out.println(name);
		//Person gildong_ = new Person();  이 과정에서 생성
	}
	
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		System.out.println("[난 매개변수 두개인 Person 생성자]");
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
	//public으로 다른 class끼리 상호작용(public을 안 붙여도 실행은 가능하지만 나중에 패키지에서 접근할 때 public 안 붙여주면 사용x)
	//method(void: 반환하는 값 없음을 의미, 반환값 있으면 그에 맞는 int_ 혹은 string과 같은 type 적어주면 됨)
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
	
}  //end of person


public class OOP_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String myname = null;
		int myage = 0;
		System.out.print("이름 입력하시오:");
		myname = sc.nextLine();
		System.out.print("나이를 입력하시오:");
		myage = sc.nextInt();
		
    	Person my = new Person(myname, myage);
				
		Person hodong = new Person("호동", 45);
		
		hodong.setName("호동");  //함수호출
		System.out.printf("hodong.name=%s\n", hodong.getName());
		hodong.setAge(53); 
		System.out.printf("hodong.age=%d\n", hodong.getAge());
		
		
		Person gildong = new Person();  
		//Person이라는 클래스 타입, gildong_이라는 객체참조변수
		//()표시로 인해 함수가 됨->생성자 함수(파이썬의 __init__) / person클래스의 복사본 즉, 객체(instance)생성
	    //gildong.name = "길동"; 
		//System.out.printf("gildong.name=%s\n", gildong.name); [private로 호출 불가]
		gildong.setName("길동");
		System.out.printf("gildong.name=%s\n", gildong.getName());
		
		gildong.setAge(23); 
		System.out.printf("gildong.age=%d\n", gildong.getAge()); 
		
		//메서드 오버로딩
		gildong.talk();
		gildong.talk("열공하자");
		gildong.talk("길동", gildong.getAge());
		gildong.talk(24, "난길동");
		
		sc.close();
		
	}  //end of main

}//end of class