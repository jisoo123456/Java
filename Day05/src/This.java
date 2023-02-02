class Person_02{
	private String name = null;  //�ʱⰪ
	private int age = 0;  
	static char blood = 'A';
	//blood�� person�� ����� ������ static�̶� ��ü ���� ������ ������������ �ö�
	//�׷��� ��ü �ȿ� blood�� ����
	//static�� Ŭ���� ����Լ��� ������ ��ü���� ����
	
	public void setName(String pname)
	{name = pname;}  //end of setName
	
	public String getName()
	{return name;}  //end of getName
	
	//this�� �ź���, this�� �� ��ü�� ����
	//� ��ü�� �����߳Ŀ� ���� this�� ����Ű�� ��ü�� �ٸ�
	public void setAge(int age)
	//���(int_ (this) age)�� this�� ������ ���� �� �׻� ����ٴ�
	{this.age = age;}
	//[this.�ִ°��]�浿��üage=�Ű�����age
	//[this.���°��]���⼭ age�� �Ѵ� �Ű����� age�� �޾Ƶ���. ex_ 23�ѱ�� 23 = 23
	//ex_ �����ϰԱ����� ������ �ּ�(�浿: 300����, ����: 700����)
	//300������ this�� ������ ��->�浿 ��ü�� ����Ŵ, 700������ this�� ������ ��->���� ��ü�� ����Ŵ
	
	public int getAge()
	{return age;} //this �־ �ǰ� �� �־ ��
	
	public static void display()
	//static�޼ҵ忡���� this���x
	//��ü�� �����Ǳ����� �����޼ҵ�� ������������ �����->�׷��� ��ü�� �����ɶ� �����޼ҵ�� ����x(ex_ �浿��ü�� display()����x)
	//�׷��� display()�� �浿��ü�� ������ �ƴ� ��, static method�� Ư����ü�� ������ �ƴϴ�
	{
		System.out.printf("blood=%c\n", blood);
		//���� ������������ �ֱ� ������ ����
//		System.out.printf("display()�޼���� name=%s\n", name);
//		//name�� Ư����ü �����̱� ������ static method�� ������ �� x
	}
	
	
}  //end of person

public class This {

	public static void main(String[] args) {
				
		Person_02 gildong = new Person_02(); 
		
		gildong.setName("�浿"); 
		//�浿��ü�� �����ϴ� this�� ��� person class�� �Ѿ
		System.out.printf("gildong.name=%s\n", gildong.getName());
		
		gildong.setAge(23); 
		//�浿��ü�� �����ϴ� this�� ��� person class�� �Ѿ
		System.out.printf("gildong.age=%d\n", gildong.getAge()); 
		
		gildong.display(); //��ü���� static�� �����ؼ� ���
		Person_02.display();  //Ŭ�������� static�� �����ؼ� ����
		//������������ �б��������� ����. �б��л�(��ü)������ ���� ���������� �� ��ü�� ������ �ƴ�

		
		
	}//end of main

}//end of class
