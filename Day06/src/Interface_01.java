interface Ivehicle
//인터페이스는 상속을 위해 만듦
//인터페이스는 단독으로 객체 생성x -> 인터페이스를 상속 받는 클래스를 통해 객체 생성o
{
	//int_ makeYear = 2022;
	//make_year을 무조간 변수가 아닌 상수로 이해
    //final int_ makeyear_ = 2022;
	//public final int_ makeyear_ = 2022;
	//모두 다 같은 makeYear이다.
	public static final int makeYear = 2022;
	
	//void start();
	//abstract void start();
	public abstract void start();
	
	//몸통 있는 일반 메소드 불가능 해결방법(default, static, private 중 하나가 들어가야함)
	default public void stop()
	{System.out.println("정지한다");} 
	//default 인터페이스 안에서만 사용 가능 -> default는 모두의 공통인 부분으로 지정
	//인터페이스 기본 구현을 그대로 상속하므로 인터페이스에 자유롭게 새로운 메소드 추가가능
	
	private void show()
	{System.out.println("makeYear=" + makeYear);}
	//private: interface안에서만 실행하겠다는 의미
	
	public static void turn()
	{System.out.println("방향전환한다");}
	
	static class Price{
		int salepercent = 10;
	}//end of class_Price
	
	public abstract void driving();
	
}//end of Ivehicle_interface

class Car extends Carrier implements Ivehicle{  
	
	public Car()
	{
		System.out.println("난 car의 기본 생성자");
	}//end of car기본생성자
	
	@Override
	public void start() {
		//반드시 부모클래스의 추상 클래스를 자식이 오버라이딩, @override 생략가능하지만 가독성을 위해 쓰는 것이 좋음
		System.out.println("Car가 출발한다");
	}//end of start
	
	@Override
	public void stop() {
		//super.stop();  //interface이어서 불가능, class일때만 접근 가능
		//오버라이딩 할때는 default는 쓰는거x
		System.out.println("Car가 정지한다.");
	}//end of stop
	
	public void driving()
	{
		System.out.println("Car 타고 드라이빙");
	}
	
	@Override
	public void fetch() {
		System.out.println("Car가 승객을 탑승시킴");
	}//end of fetch
	
}//end of Car_class

class Carrier{
	public void fetch() {
		
		System.out.println("승객을 운반하다");
	}//end of fetch
	
}//end of Carrier

public class Interface_01 {

	public static void main(String[] args) {
		//Car k5 = new Car();
		Ivehicle k5 = new Car(); 
		//up_casting: 자식타입의 객체를 부모타입으로 보는 것
		//down_casting: 부모타입의 객체를 자식타입으로 보는 것(추천하는 방법x)
		
		k5.start();
		k5.stop();
		//k5.turn();
	    Ivehicle.turn();
	    //turn은 static이기에 turn이라는 메소드는 객체가 생성되기 전에 정적기억공간에 존재
	    //turn은 k5객체의 멤버는 아니지만 Ivehicle_class의 멤버는 맞다
	    k5.driving();
	    //k5가 Ivehicle_타입일때 driving메소드가 자식클래스인 car에만 있다면 호출X
	    //((Car)k5).driving : 다운캐스팅(임시로 Car타입이 됨)
	   // k5.fetch(); ->이거 왜 오류인지 공부!!
		
	}//end of main

}//end of class
