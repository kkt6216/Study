/*=========================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ��� ������
  - BufferedReafer
  - printf()
  =========================================*/

  // ����ڷκ��� ������ ������ �ι� �Է¹޾�
  // ��Ģ���� �� ������ ������ �����Ͽ�
  // �� ����� ����ϴ� ���α׷��� �����Ѵ�.
  // ��, �Է¹޴� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϰ�
  // ����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
  // ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

  // ���� ��)
  // ù ��° ���� �Է� : 10
  // �� ��° ���� �Է� : 2
  //
  // ====[���]====
  // 10 + 2 =12
  // 10 - 2 = 8
  // 10 * 2 = 20
  // 10 / 2 = 5
  // 10 % 2 = 0


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test021
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �Բ� Ǯ���� ����

		// �ֿ� ���� ����
		int num1, num2;				// ����� �Է°��� ���� ����
		int res1,res2,res3,res4,res5;	// ������ ���� ����� ���� ����
		
		//BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� :");
		num1 = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		num2 = Integer.parseInt(br.readLine());

		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;
		
		// ��� ���

		System.out.printf("\n====[���]====\n");
		System.out.printf("%d + %d = %d\n", num1 ,num2, res1);
		System.out.printf("%d - %d = %d\n", num1 ,num2, res2);
		System.out.printf("%d * %d = %d\n", num1 ,num2, res3);
		System.out.printf("%d / %d = %d\n", num1 ,num2, res4);
		System.out.printf("%d %% %d = %d\n", num1 ,num2, res5);   // "%%" �� "%"
		System.out.printf("===============\n");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* ���� Ǯ���� ����
		
		int a;
		int b;

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());

		
		s

		System.out.println();
		System.out.println("====���====");
		System.out.printf("%d + %d = %d\n", a, b,c);
		System.out.printf("%d - %d = %d\n", a, b,d);
		System.out.printf("%d * %d = %d\n", a, b,e);
		System.out.printf("%d / %d = %d\n", a, b,f);
		System.out.printf("%d %% %d = %d\n", a, b,g);
		System.out.println("============");
*/






	}
}
// ���� ���
/*
====���====
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/