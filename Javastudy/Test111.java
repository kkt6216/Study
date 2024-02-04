/*==========================
  ���� Ŭ���� ���� ����
============================*/

/*
�� ���(Inheritance)�̶�

   ���� ����(����)�ϰ��� �ϴ� Ŭ������
   �̹� ����Ǿ� �ִ� �ٸ� Ŭ������ ��ɰ� �ߺ��Ǵ� ���
   �̹� ����� Ŭ������ �Ϻκ��̳� ��ü ������ ������ �� �ֵ��� �ϴ� ����� �ǹ��Ѵ�.

   ��, ����� ��ü�� ���� ���� ���� �� �ִ�
   �������� ���뼺(reusablitiy)�� Ȯ���ϰ�
   ��ü ���� ���踦 ���������ν�
   ��ü ������ �� �ٸ� Ư¡�� ������������ ������ ��밡 �ȴ�.

   ����� ���� ���α׷��� Ŭ���� ������ ���������ν�
   �ߺ��� �ڵ���� ���ۼ��� �ʿ� ����
   �ݺ����̰� �������� �۾��� ó������ �ʱ� ������
   ���α׷��� �ۼ��ϴ� �ð��� ������ �� �ְ�
   ���������� �����ϰ� �� �� ������,
   ���α׷��� ���̵� ª������ �ȴ�.

   ����, �̹� �ۼ��� ���α׷����� �ռ� �׽�Ʈ�Ǿ��� ������
   ������ ���� �� �־� ���� �ۼ� ���� ���α׷����� ������ �� �ִ�.

�� ������ ��

   �ڹٴ� ����.��.��.�ӡ��� �������� �ʱ� ������
   �� �� �̻��� Ŭ�����κ��� ��ӹ��� �� ����.

   ��, �ڹٴ� ����.��.��.�ӡ��� �����Ѵ�.

*/

// �θ� Ŭ���� == ���� Ŭ���� == ����(super) Ŭ���� == �����ִ� Ŭ���� == ����ϴ� Ŭ����
class SuperTest111
{
	protected double area;		//-- protected =  99�ۼ�Ʈ ���Ŭ���� ��� ����

	SuperTest111()
	{
		System.out.println("Super Class ...");
	}

	void write(String title)
	{
		System.out.println(title + " - " + area);
	}
}

// �ڽ� Ŭ���� == ���� Ŭ���� == ����(sub) Ŭ���� == �����޴� Ŭ���� == ��ӹ޴� Ŭ����
public class Test111 extends SuperTest111
{
	/*
	protected double area;		//-- protected =  99�ۼ�Ʈ ���Ŭ���� ��� ����    -- �θ�κ��� ��ӹ��� area

	// check~!!!
	// �� �����ڴ� ��� ��󿡼� ���ܵȴ�.

	SuperTest111()
	{
		System.out.println("Super Class ...");										-- �θ�κ��� ��ӹ���
	}

	void write(String title)													
	{
		System.out.println(title + " - " + area);
	}
	*/

	// ������ �������� �ڵ����� ���ԵǴ� default ������
	/*
	Test111()
	{
		// �� ������ ���ο��� �� �ٸ� ������ ȣ��
		//	  �� �����ϴ�. ��, ������ ���ο��� ���� ���� ����Ǿ�� �Ѵ�.

		// �� ����ִ�~!!!
		//		��
		// �θ� Ŭ���� ������ ȣ�� ����~!!!
		super();
	}	
	*/
	// ����� ���� ������
	Test111()
	{
		//super();		//-- �ڵ�����~!!!
		// �� superTest111();
		System.out.println("Sub Class...");

		// super();		//--(X)
	}

	public void actionCircle()
	{
		int r = 10;
		area = r * r * 3.141592;
		write("��");
	}

	public void actionRect()
	{
		int w=20, h=5;
		area = w * h;
		write("�簢��");
	}



	public static void main(String[] args)
	{
		// Test111 Ŭ����(�ڽ�) ��� �ν��Ͻ� ����
		Test111 ob = new Test111();
		//--==>> Super Class ...
		//		 Sub Class...

		ob.actionCircle();
		//--==>> �� - 314.1592

		ob.actionRect();
		//--==>> �簢�� - 100.0

	}
}