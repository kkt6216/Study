/*================================================
  ���� ���� ó��(Exception Handling) ����
=================================================*/

// �ٸ� ���� �ٽ� ������


public class Test153
{

	public int getValue(int value) throws Exception						// �� ���� ������
	{																	//	  (�Ķ� ��ź)
		int a = 0;

		try
		{
			getData(-2);												// �� ���� �߻�
																		//	  (���� ��ź)
		}																// �� ���� ��Ƴ���
		catch (Exception e)												//	  (���� ��ź)
		{
			// �� ���� ó��(���� ��ź)
			System.out.println("printStackTrace.......................");
			e.printStackTrace();
			
			// check~!!!
			// �� ���� �߻�(�Ķ� ��ź)
			throw new Exception("value �� �����Դϴ�.");
		}

		return a;
	}

	public int getData(int data) throws Exception						// �� ���� ������
	{																	//    (���� ��ź)
		if (data < 0)
		{
			throw new Exception("data �� 0 ���� �۽��ϴ�.");				// �� ���� �߻�
		}																//    (���� ��ź)
		return data + 10;
	}


	public static void main(String[] args)
	{
		Test153 ob = new Test153();
     
	 	try
		{
			int a = ob.getValue(-2);									// �� ���� �߻�
			System.out.println("a : " + a);								//	   (�Ķ� ��ź)
			
		}
		catch (Exception e)												// �� ���� ��Ƴ���
		{																//	  (�Ķ� ��ź)
			System.out.println("printStackTrace.......................");
			e.printStackTrace();
		}
	}
}


// ���� ���

/*
printStackTrace.......................
java.lang.Exception: data �� 0 ���� �۽��ϴ�.
        at Test153.getData(Test153.java:38)
        at Test153.getValue(Test153.java:17)
        at Test153.main(Test153.java:50)
printStackTrace.......................
java.lang.Exception: value �� �����Դϴ�.
        at Test153.getValue(Test153.java:28)
        at Test153.main(Test153.java:50)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/