interface Izerg{
//�������̽��� �߻�޼ҵ�� �ڽ�Ŭ�������� �ݵ�� �������̵��ؼ� �����ؾ���

	public abstract void display();
	default public void zergAttack()
	{
		System.out.println("Zerg ���ݰ���");
	}//end of zefgAttack
}//end of Izerg_

interface Iterran{
	
	public abstract void terranAttack();
}//end of Iterran_

interface Iprotous{
	public abstract void protousAttack();
}//end of Iprotous_

interface Igame extends Izerg, Iterran, Iprotous{  //���߻��(�������̽������� ����)
	
	public abstract void Goodgame();
}//end of Igame_

class StarCraft implements Igame{
	

	@Override
	public void display() {
		System.out.println("Zerg ���� ���� ǥ��");
		
	}//end of display

	@Override
	public void Goodgame() {
		System.out.println("���� �����̾���");
		
	}//end of Good_game

	@Override
	public void terranAttack() {
		System.out.println("terran ���� ����");
		
	}

	@Override
	public void protousAttack() {
		System.out.println("protous ���� ����");
		
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
