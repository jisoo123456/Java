class Person_02{
	private String name = null;  //초기값
	private int age = 0;  
	static char blood = 'A';
	//blood도 person의 멤버는 맞지만 static이라 객체 생성 이전에 정적기억공간에 올라감
	//그래서 객체 안에 blood가 없음
	//static은 클래스 멤버함수는 맞지만 객체에는 없음
	
	public void setName(String pname)
	{name = pname;}  //end of setName
	
	public String getName()
	{return name;}  //end of getName
	
	//this는 신분증, this는 각 개체를 참조
	//어떤 객체를 참조했냐에 따라 this가 가르키는 객체는 다름
	public void setAge(int age)
	//사실(int_ (this) age)로 this는 보이지 않을 뿐 항상 따라다님
	{this.age = age;}
	//[this.있는경우]길동객체age=매개변수age
	//[this.없는경우]여기서 age는 둘다 매개변수 age로 받아들임. ex_ 23넘기면 23 = 23
	//ex_ 유일하게구분이 가능한 주소(길동: 300번지, 현빈: 700번지)
	//300번지를 this가 가지게 됨->길동 객체를 가르킴, 700번지를 this가 가지게 됨->현빈 객체를 가르킴
	
	public int getAge()
	{return age;} //this 넣어도 되고 안 넣어도 됨
	
	public static void display()
	//static메소드에서는 this사용x
	//객체가 생성되기전에 정적메소드는 정적기억공간에 저장됨->그래서 객체가 생성될때 정적메소드는 복사x(ex_ 길동객체에 display()존재x)
	//그래서 display()는 길동객체의 소유가 아님 즉, static method는 특정객체의 소유가 아니다
	{
		System.out.printf("blood=%c\n", blood);
		//같은 정적기억공간에 있기 때문에 가능
//		System.out.printf("display()메서드안 name=%s\n", name);
//		//name은 특정객체 소유이기 때문에 static method에 접근할 수 x
	}
	
	
}  //end of person

public class This {

	public static void main(String[] args) {
				
		Person_02 gildong = new Person_02(); 
		
		gildong.setName("길동"); 
		//길동객체를 참조하는 this가 숨어서 person class로 넘어감
		System.out.printf("gildong.name=%s\n", gildong.getName());
		
		gildong.setAge(23); 
		//길동객체를 참조하는 this가 숨어서 person class로 넘어감
		System.out.printf("gildong.age=%d\n", gildong.getAge()); 
		
		gildong.display(); //객체에서 static에 접근해서 경고
		Person_02.display();  //클래스에서 static에 접근해서 가능
		//정적기억공간은 학교도서관과 같다. 학교학생(객체)누구나 접근 가능하지만 그 객체의 소유는 아님

		
		
	}//end of main

}//end of class
