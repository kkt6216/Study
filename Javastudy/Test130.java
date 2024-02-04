/*================================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
  - Wrapper Ŭ����
=================================================*/

/*
�� Wrapper Ŭ����

   1. �ڹٿ����� ��� ���ؿ��� �����ϴ� �⺻�� �����͸� ������
      �������� Ŭ������ �����Ͽ� ��ü ������ ó���Ѵ�.
      ���� �ڹٿ����� �̷��� �⺻�� �����͸�
      ��ü ������ ó���� �� �ֵ��� Ŭ������ ������ �� �ۿ� ���µ�
      �̷��� Ŭ�������� ������ Wrapper Ŭ������ �Ѵ�.

   2. �⺻ �ڷ�����
      byre, short, int,     long, float, double, char,       boolean ���� �����ϴ�
	  Byte, Short, Integer, Long, Float, Double, Chareacter, Boolean ��
	  Wrapper Ŭ���� �� ū ���ڵ��� �ٷ�� ����
	  java.math.BigInteger �� java.math.BigDecimal Ŭ������ �����Ѵ�.

	  Wrapper Ŭ������ java.lang ��Ű���� ���ԵǾ� �����Ƿ�
	  ������ import ���� ���� �ٷ� ����ϴ� ���� �����ϸ�
	  �⺻���� ���������� Wrapper Ŭ������ ���� �޼ҵ带 ����
	  �� ��ȯ�� �����ϰ�, ���� �񱳿� ���� ���굵 �����ϴ�.

	  ex) java.lang.Integer Ŭ����
	      int �⺻ �ڷ����� Wrapper Ŭ������
		  ������ �ٷ�µ� �ʿ��� ����� �޼ҵ�, ���� ��ȯ � �ʿ���
		  �޼ҵ� ���� �����ϰ� �ִ�.

		  static Integer valueOf(int i)
		  int ���� Integer ������ ��ȯ�Ѵ�.

		  static int parseInt(String s)
		  ���ڿ� �������� ����� ���ڸ� ���� ���·� ��ȯ�Ͽ� ��ȯ�ܴ�.

		  byte byteValue(), int intValue(),
		  short shortValue(), long longValue(),
		  float floatValue(), double doubleValue()
		  �ش� �⺻ �ڷ������� �� ��ȯ�� ���� ��ȯ�Ѵ�.


*/

/*
�� ���� �ڽ�(Auto-Boxing)�� ���� ��ڽ�(Auto-Unboxing)

   �Ϲ������� ���۷��� ���� �⺻ �ڷ����� ȣȯ���� ������
   �� ��� �߻��ϴ� ���� �ذ��� ���� �ڹٿ����� Wrapper Ŭ������ �����ϰ� �Ǿ���.
   ������, JDK 1.5 ���� ���۷��� ���� �⺻ �ڷ�����
   ������ ���� �� ��ȯ�� �����ϵ��� �������� ������ �̷������ �Ǿ���.

   int a=10,b;
   Integer ob;
   ob = a;
   //-- �⺻ �ڷ���(int)�� Integer ������ �ڵ� ��ȯ(���� �ڽ�)
   //	�����δ�... ��ob = new Integer(a);��

   b = ob;
   //-- Integer(��ü)�� �⺻ �ڷ��� int ������ �ڵ� ��ȯ(���� ��ڽ�)
   //	�����δ�...��b = ob.intValue();��

   �̴� JDK 1.5 ���� �߰��� ���� �ڽ� / ���� ��ڽ��̶��
   ������� ���� �������� ���̴�.
*/

public class Test130
{
	public static void main(String[] args)
	{
		int a=10, b;
		Integer c;
		Object d;

		b = a;					//-- int �� ������(�ڷ�) �� int �� ����
		c = new Integer(0);		//-- ��ü ����

		// �� �⺻������ ���۷��� ��(���� Ÿ��)�� �⺻ �ڷ���(�⺻ Ÿ��)�� ȣȯ���� �ʴ´�.

		b = c;					//-- Integer �� ������(��ü) �� int �� ����(���� ��ڽ�)
		b = c.intValue();		//-- ��ü�� �޼ҵ� ȣ���� ���� ����� ��ȯ(��ڽ�)

		d = new Object();		//-- ��ü ����
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : java.lang.Object@15db9742

		d = new Integer(10);	//-- �� ĳ����
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10
		
		d = new Double(12.345);	//-- �� ĳ����
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 12.345

		// Object d = 10;
		d = 10;					//-- ���� �ڽ� �� �� ĳ����
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10



	}
}