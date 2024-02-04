/*=====================================
  ���� Ŭ������ �ν��Ͻ� ����
=====================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// 1���� �Է¹��� �� ������ ���� �����Ͽ�
// ������� ����ϴ� ���α׷��� �����Ѵ�.

// ��, ���ݱ���ó�� main() �޼ҵ忡 ��� ����� �����ϴ� ���� �ƴ϶�
// Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
// (Hap Ŭ���� ����)
// ����, ������ �Է� ó�� �������� BufferedeReader �� readLine() �� ����ϸ�,
// �Է� �����Ͱ� 1���� �۰ų� 1000���� ū ���
// �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է�(1 ~ 1000) : 1200
// ������ ���� �Է�(1 ~ 1000) : -50
// ������ ���� �Է�(1 ~ 1000) : 100
// >> 1 ~ 100 ������ �� : 5050
// �Լ��Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Hap
{
	// �ֿ亯�� ����(������� �Է°��� ��Ƴ� ����)
	int su;
	int i =0;

	// �Է� �޼ҵ� ����
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
		System.out.print("������ ���� �Է�(1 ~ 1000) :");
		su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);

	}

	// ���� ó�� �޼ҵ� ����
	int calculate()
	{
		int result = 0;
	
		for (i=1; i<=su; i++)
		{
			result += i;
		}

		return result;
	}

	// ��� ��� �޼ҵ� ����
	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n", su, sum);

	}

}

public class Test072
{
	public static void main(String[] args) throws IOException
	{
		// Hap �ν��Ͻ� ����
		Hap ob = new Hap();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		// -----------------------
		//		���� ���� Ȱ��

		ob.input();			//-- new Hap().input()

		// ������ �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int s = ob.calculate();

		// ������ �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		//ob.print(ob.calculate());
		ob.print(s);

	}
}





/*		�� Ǯ��
{
	
	int i,n = 1;
	int sum;

	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		do
		{
			System.out.print("������ ���� �Է�(1 ~ 1000) :");
			i = Integer.parseInt(br.readLine());

		}while (i<1 || i>1000);
	}

		int sum()
		{
			for (n=1;n<=i; n++)
			{
				sum += n;
			}
			return sum;

		}

	void print(int n)
	{
		System.out.printf(">> 1 ~ %d ������ �� : %d\n ", i, sum);
	}



}



public class Test072
{
	public static void main(String[] args) throws IOException
	{
		Hap ob = new Hap();

		ob.input();

		int num1 = ob.sum();

		ob.print(num1);

	}
}
*/