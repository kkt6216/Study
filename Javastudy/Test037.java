/*=========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - if ��
  - if ~ else �� �ǽ�
  =========================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if ~ else��, ���ǿ�����, ����if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ��(true)�� ���
//	  Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� ������ ���� 5���� �Է¹޾�
// ¦����, Ȧ���� �հ踦 ����ϴ� ���α׷��� �����Ѵ�.
// ��, Scanner �� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� 5�� �Է�(���� ����) : 11 12 13 14 15

// >> ¦���� ���� 26 �̰�, Ȧ���� ���� 39�Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...



import java.util.Scanner;


public class Test037
{
	public static void main(String[] args)
	{

	// �ֿ� ���� ����
	Scanner sc = new Scanner(System.in);

	// �������� ��Ƴ� ���� �ʱ�ȭ
	int evenSum = 0;			//-- ¦���� ���� ��Ƴ� ���� ����
	int oddSum = 0;				//-- Ȧ���� ���� ��Ƴ� ���� ����
	int num1, num2, num3, num4, num5;
	//-- ����ڷκ��� �Է¹��� 5���� ������ ���� ���� ����

	
	// ���� �� ó��
	System.out.print("������ ���� 5�� �Է�(���鱸��) : "); // 10 20 30 40 50
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	num4 = sc.nextInt();
	num5 = sc.nextInt();

	if (num1%2==0)	//-- num1�� ¦���� ��...
	{
		// evenSum �� num1 ��ŭ ����
		evenSum += num1;
	}
    else			//-- num1 �� ¦���� �ƴ� ��...(Ȧ���� ��)
	{
		// oddSum �� num1 ��ŭ ����
		oddSum += num1;
	}

	if (num2%2==0)	//-- num2 �� ¦���� ��...
	{
		evenSum += num2;
	}
	else
	{
		oddSum += num2;
	}

	if (num3%2==0) 
	{
		evenSum += num3; 
	}
	else
	{
		oddSum += num3;
	}

	if (num4%2==0)
	{
		evenSum += num4;
	}
	else
	{
		oddSum += num4;
	}
	if (num5%2==0)
	{
		evenSum += num5;
	}
	else
	{
		oddSum += num5;
	}


 

	// ��� ���
	System.out.printf("\n>> ¦���� ���� %d�̰�, Ȧ���� ���� %d �̴�.\n", evenSum,oddSum);

	}
}


// ������
/*
������ ���� 5�� �Է�(���鱸��) : 11 22 33 44 55

>> ¦���� ���� 66�̰�, Ȧ���� ���� 99 �̴�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
	
	
	
	
	
	
	
	
	
	
	/*
	int a, b, c, d, e;
	int even;
	int odd;
	 

	System.out.print("������ ���� 5�� �Է�(���� ����) : ");

	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = sc.nextInt();
	e = sc.nextInt();

	even = 0;
	odd = 0;

	
	if (a%2==0)
	{
		System.out.printf("%d\n", a); 
	}
	else 
		System.out.printf("%d\n", a);

	if (b%2==0)
	{
		System.out.printf("%d\n", a); 
	}
	else 
		System.out.printf("%d\n", a);

	if (b%2==0)
	{
		System.out.printf("%d\n", b); 
	}
	else 
		System.out.printf("%d\n", b);

	if (c%2==0)
	{
		System.out.printf("%d\n", c); 
	}
	else 
		System.out.printf("%d\n", c);

	if (d%2==0)
	{
		System.out.printf("%d\n", d); 
	}
	else 
		System.out.printf("%d\n", d);

	if (e%2==0)
	{
		System.out.printf("%d\n", e); 
	}
	else 
		System.out.printf("%d\n", e);
	*/


	



	


	

	

