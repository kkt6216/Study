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

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 753
// �� ��° ���� �Է� : 22
// �� ��° ���� �Է� : 124
//
// >> ���� ��� : 22 124 753
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
	8	21	74
	------
	--		--
		-------

	7	25	99
	-----
	--		--	
		-------	

	12	25	87
	------
	--		--
		------

�� ù ��° ���� vs �� ��° ���� ũ�� ��
	�� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

�� ù ��° ���� vs �� ��° ���� ũ�� ��
	�� ù ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

�� �� ��° ���� vs �� ��° ���� ũ�� ��
	�� �� ��° ������ �� ��° �������� Ŭ ���... �ڸ� �ٲ�

*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	int a, b, c;			//-- ����ڰ� �Է��ϴ� ������ ������ ��Ƶ� ����

	System.out.print("ù ��° ���� �Է� :");
	a = Integer.parseInt(br.readLine());
	System.out.print("�� ��° ���� �Է� :");
	b = Integer.parseInt(br.readLine());
	System.out.print("�� ��° ���� �Է� :");
	c = Integer.parseInt(br.readLine());
	
	if (a > b)			//-- ù ��° ������ �� ��° �������� Ŭ ���
	{
		// �ڸ� �ٲ�
		a=a^b;
		b=b^a;
		a=a^b;
	}

	if (a > c)			//-- ù ��° ������ �� ��° �������� Ŭ ���
	{
		// �ڸ� �ٲ�
		a=a^c;
		c=c^a;
		a=a^c;
	}

	if (b > c)			//-- �� ��° ������ �� ��° �������� Ŭ ���
	{
		// �ڸ� �ٲ�
		b=b^c;
		c=c^b;
		b=b^c;
	}


	// ���� ��� ���
	System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);
	
	


	
	/* ����Ǯ���ѳ���

	int a,b,c;
	
	System.out.print("ù ��° ���� �Է� :");
	a = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� :");
	b = Integer.parseInt(br.readLine());

	System.out.print("�� ��° ���� �Է� :");
	c = Integer.parseInt(br.readLine());

	if (a<b && b<c && a<c)
		System.out.printf(">> ���� ��� : %d  %d  %d\n:", a,b,c); 
	else if (a<b && a<c && b>c)		
		System.out.printf(">> ���� ��� : %d  %d  %d\n:", a,c,b); 
	else if (a>b && a<c && b<c)
		System.out.printf(">> ���� ��� : %d  %d  %d\n:", b,a,c);
	else if (a>b && c>b && a<c)
		System.out.printf(">> ���� ��� : %d  %d  %d\n:", b,c,a);
	else if (a>c && c<b && a<b)
		System.out.printf(">> ���� ��� : %d  %d  %d\n:", c,a,b);
	else if (a>c && a>b && c<b)
		System.out.printf(">> ���� ��� : %d  %d  %d\n:", c,b,a);
	*/

	}
}
// ���� ���

/*
ù ��° ���� �Է� :300
�� ��° ���� �Է� :200
�� ��° ���� �Է� :100

>> ���� ��� : 100 200 300
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� :200
�� ��° ���� �Է� :300
�� ��° ���� �Է� :100

>> ���� ��� : 100 200 300
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� :100
�� ��° ���� �Է� :100
�� ��° ���� �Է� :200

>> ���� ��� : 100 100 200
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/