/*=========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - �ݺ���(while��) �ǽ� �� ���� 
============================================*/

// ����ڷκ��� ������ ������ �Է¹޾�
// �Է¹��� ������ �Ҽ�����... �ƴ���... �� �Ǻ��Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿ܿ� � ���ε�
//			 ������ �������� �ʴ� ��.
//			 ��, 1�� �Ҽ� �ƴ�.

// ���� ��)
// ������ ���� �Է� : 10
// 10 �� �Ҽ� �ƴ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 11
// 11 �� �Ҽ�
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Test050
{
	public static void main(String[] args) throws IOException
	{	
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		int num;
		int n=2;
		
		System.out.print("������ ���� �Է� :");
		num = Integer.parseInt(br.readLine());

		boolean flag = false;

		 while (n<num)
	    {
			

			if (num%n!=0)		
			{
				
				flag = true;
				break;			
			}

			n++;
	    }

		if (flag && num ==1)
		{
			// ���������� �Ҽ�
			System.out.printf("%d �� �Ҽ� �ƴ�\n", num);
		}
		else 
		{
			// ���������� �Ҽ� �ƴ�
			System.out.printf("%d �� �Ҽ�\n", num);
		}
		*/


		
		/* �Բ��� Ǯ��
		int num;			//-- ������� �Է°��� ��Ƴ� ����
		int n=2;			//-- �Է°��� ������� ������ ������ ������ ����
							//	 2 ���� �����ؼ� 1�� ����
							//	 ex) �Է°� 27 �� : 2 3 4 5  6 7 8 ... 23 24 25 26

		// ���� �� ó��
		System.out.print("������ ���� �Է� :");
		num = Integer.parseInt(br.readLine());

		// � ���� �Է¹��� �������� �� �� ������
		// �� �Է°��� �Ҽ��� �����Ѵ�.
		//String result = "�Ҽ���";
		boolean flag = true;				//-- num(����� �Է°�)�� �Ҽ��� ���̴�~!!!

	    while (n<num)
	    {
			// �׽�Ʈ
			//System.out.println("�ݺ��� ���� �� " + n);

			// Ȯ�� ����
			//-- n���� num�� ������ ���������� Ȯ�� �� �������� 0���� Ȯ��
			if (num%n==0)		// ��, ������ �������� ��Ȳ
			{
				// ��~!! �� �ʸ� �Ҽ��� �����ߴµ�...�Ф�
				// ��...  �Ҽ��� �ƴϾ��� ������... �Ф�
				flag = false;
				break;			// �����. ( + �׸��� ����������.)
								// �� break �� ���δ� ���� ����� �ݺ���
			}

			n++;
	    }

		// �׽�Ʈ
		//System.out.println("flag : " + flag);


		// ��� ���
		// (���� ����� ����ϱ� ���� �߰� Ȯ�� �� 1���� �ƴ����� ���� �߰� ����)
		if (flag && num !=1)
		{
			// ���������� �Ҽ�
			System.out.printf("%d �� �Ҽ�\n", num);
		}
		else 
		{
			// ���������� �Ҽ� �ƴ�
			System.out.printf("%d �� �Ҽ� �ƴ�\n", num);
		}

		*/

// ������
/*
������ ���� �Է� :990
990 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . 
*/

/*
������ ���� �Է� :991
991 �� �Ҽ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� :1
1 �� �Ҽ� �ƴ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/



		/*
		int a;
		int b = 1;
		String result = "";

		System.out.print("������ ���� �Է� :");
		a = Integer.parseInt(br.readLine());

		while (a > 0 )
		{
			
			b++;
			
		if (a==1 && a%a !=0 && a%b ==0)
		{
				result = "�Ҽ� �ƴ�";
		}
		else 
		{
				result = "�Ҽ�"; 
		}
		 
		}

		System.out.printf( "%d �� %s\n", a, result);
		*/

	}
}

