/*=====================================
  ���� Ŭ������ �ν��Ͻ� ����
=====================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� ������ �����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ϸ��� �ۼ��� �� �ֵ��� �Ѵ�.
// (Calculate Ŭ���� ����)

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 100 51
// ������ ������(+ - * /)		  : +

// >> 100 + 51 = 151
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// �ֿ� ���� ����
		int su1, su2;		//-- ����ڷκ��� �Է¹��� �� ������ ��Ƴ� ����
		char op;			//-- ����ڷ� ���� �Է¹��� �����ڸ� ��Ƴ� ����

		// �޼ҵ� ����(��� : �Է�)

	void input()  throws IOException
	{
		Scanner sc = new Scanner(System.in); 

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		

		System.out.print("������ ������(+ - * /)         :");
		op = (char)System.in.read();
		
	}

	// �޼ҵ� ����(��� : ����) �� ������ ���굵 ���� ������� ó��
	int cal()
	{
		int result = -1;

		switch (op)
		{
		case '+': result = su1 + su2; break;
		case '-': result = su1 - su2; break;
		case '*': result = su1 * su2; break;
		case '/': result = su1 / su2; break;
		//default : result = -1
		
		}
		return result;
	}

	// �޼ҵ� ����(��� : ���)
	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
	}
}


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate �ν��Ͻ� ����
		Calculate cal = new Calculate();

		cal.input();		//-- ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		int r = cal.cal();	//-- ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		cal.print(r);		//-- ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
	}
}

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 10 10
������ ������(+ - * /)         :+
>> 10 + 10 = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/




/*
import java.util.Scanner;

class Calculate
{
	void input() 
	{
		Scanner sc = new Scanner(System.in); 
		
		int a;
		int b;
		char c;

		System.out.print("������ �� ���� �Է�(���� ����) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.in.skip(2);

		System.out.print("������ ������(+ - * /)		  :");
		c = (char)sc.nextInt();
		System.in.skip(2);


	}

	int cal()
	{
		if (c=='+')
		{
			result=a+b;
		}
		else if(c=='-')
		{
			result=a-b;
		}
		else if(c=='*')
		{
			result=a*b;
		}
		else if(c=='/')
		{
			result=a/b;
		}

		return result;

	}
	 
	
	void print()
	{

		System.out.printf("\n>> %d %c %d = %d\n", a, c, b, result);
	}
	



}






public class Test073
{
	public static void main(String[] args) 
	{
		Calculate ob = new Calculate();

		ob.input();

		int s = ob.cal();

		ob.print(s);

	}
}

*/