interface Izerg{
//인터페이스의 추상메소드는 자식클래스에서 반드시 오버라이딩해서 구현해야함

	public abstract void display();
	default public void zergAttack()
	{
		System.out.println("Zerg 공격개시");
	}//end of zefgAttack
}//end of Izerg_

interface Iterran{
	
	public abstract void terranAttack();
}//end of Iterran_

interface Iprotous{
	public abstract void protousAttack();
}//end of Iprotous_

interface Igame extends Izerg, Iterran, Iprotous{  //다중상속(인터페이스끼리만 가능)
	
	public abstract void Goodgame();
}//end of Igame_

class StarCraft implements Igame{
	

	@Override
	public void display() {
		System.out.println("Zerg 종족 개수 표시");
		
	}//end of display

	@Override
	public void Goodgame() {
		System.out.println("좋은 게임이었다");
		
	}//end of Good_game

	@Override
	public void terranAttack() {
		System.out.println("terran 공격 개시");
		
	}

	@Override
	public void protousAttack() {
		System.out.println("protous 공격 개시");
		
	}

}//end of StarCraft


public class Interface_02 {

	public static void main(String[] args) {
		//StarCraft yunel = new StarCraft();
		Igame yunel = new StarCraft();
		yunel.zergAttack();
		yunel.display();
		yunel.Goodgame();
		yunel.terranAttack();
		
	}//end of main

}//end of class
