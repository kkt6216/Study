/*=====================================
  ���� Ŭ������ �ν��Ͻ� ����
=====================================*/

// �� CircleTest.java ���ϰ� �Ѽ�Ʈ~!!!

// ���� ���̿� �ѷ� ���ϱ�
// ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
// (Ŭ������: CircleTest)
// �Է��� BufferedReader �� readLine()

// �� ���� ���� = ������ * ������ * 3.141592
//    ���� �ѷ� = ������ * 2 * 3.141592

// ���� ��)
// ������ �Է� : xxx

// >> �������� xxx �� ����
// >> ���� : xxx
// >> �ѷ� : xxx
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test071
{
	public static void main(String[] args) throws IOException
	{
		// CircleTest Ŭ���� ����� �ν��Ͻ� ����
		// CircleTest �ν��Ͻ� ����
		// CircleTest ��ü ����
		CircleTest ob = new CircleTest();

		ob.input();

		double num1 = ob.calArea();

		double num2 = ob.calLength();

		ob.print(num1, num2);
	}


/*
	{	

		CircleTest ob = new CircleTest();

		ob.input();

		double area = ob.circleArea();

		double length = ob.circleLength();

		ob.print(area, length);
	}
*/
}

// ���� ���
/*
������ �Է� :254

>> �������� 254�� ����
>> ���� : 202682.95
>> �ѷ� : 1595.93
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/