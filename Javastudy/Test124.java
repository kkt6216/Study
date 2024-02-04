/*=======================================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
=========================================*/


class InnerOuterTest
{
	static int a = 10;
	int b = 20;

	class InnerNested
	{
		int c = 30;

		void write()
		{
			System.out.println("Inner �� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}

	void write()
	{
		// InnerNested Ŭ���� ��� �ν��Ͻ� ����(�� inner)
		System.out.println("outer �� write()...");

		InnerNested ob1 = new InnerNested();
		ob1.write();					//-- inner �� write() �޼ҵ� ȣ��
	}
}



public class Test124
{
	public static void main(String[] args)
	{
		//InnerOuterTest Ŭ���� ��� �ν��Ͻ� ����(�� outer)
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();					//-- outer �� write() �޼ҵ� ȣ��
		//--==>> outer �� write()...
		//		 Inner �� write()...
		//		 a : 10
		//		 b : 20
		//		 c : 30

		// InnerNested Ŭ���� ��� �ν��Ͻ� ����(�� inner)
		//InnerNested ob3 = new InnerNested();
		//--==>> ���� �߻�(������ ����)

		// check ~!!! �� Test122.java ���ϰ� ��~!!!
		// InnerNested Ŭ���� ��� �ν��Ͻ� ����(�� inner)
		//InnerOuterTest.InnerNested ob4 = new InnerOuterTest.InnerNested();
		//--==>> ���� �߻�(������ ����)

		// �� ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
		//	  �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//	  �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ����ϴ�.
		//	  �� ��, �ܺ� Ŭ������ ��.ü. �� ����ϸ�
		//	     ���� Ŭ������ ��ü�� �����ϴ� ���� �����ϴ�.

		// check~!!! �� Test122.java ���ϰ� ��~!!!
		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//--==>> Inner �� write()...
		//		 a : 10
		//	     b : 20
		//		 c : 30
		

		// check~!!! �� Test122.java ���ϰ� ��~!!!
		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();

		// outerŬ������.innerŬ������ ���������� = new outer������().new inner ������();

		// cf) static �� ��ø ���� Ŭ����
		// outerŬ������.innerŬ������ ���������� = new outerŬ������.new inner ������();


	}
}