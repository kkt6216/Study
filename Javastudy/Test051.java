/*=========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - �ݺ���(while��) �ǽ� �� ���� 
============================================*/

// ����ڷκ��� ������ �� ������ �Է¹޾�
// �Է¹��� �� ���� ��
// ���� �� ���� ū �� ������ ���� ���Ͽ�
// ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 100
// �� ��° ���� �Է� : 200
// >> 100 ~ 200 ������ �� : xxxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

// ù ��° ���� �Է� : 1000
// �� ��° ���� �Է� : 2
// >> 2 ~ 1000 ������ �� : xxxxx
// ����Ϸ��� �ƹ� Ű�� ��������..

// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 10
// >> 10 ~ 10 ������ �� : 10
// ����Ϸ��� �ƹ� Ű�� ��������..

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

public class Test051
{
	public static void main(String[] args) throws IOException
	{	
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int n;				//-- ���� ������ Ȱ���� ����
		int su1, su2;		//-- ù ��°, �� ��° ����� �Է°��� ��Ƴ� ����
		int result=0;		//-- �������� ��Ƴ� ����

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� :");
		su1 = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� :");
		su2 = Integer.parseInt(br.readLine());
		
		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1 �� su2 ���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��
		if (su1 > su2)
		{
			// �ڸ� �ٲ�
			su1=su1^su2;
			su2=su2^su1;
			su1=su1^su2;
		}

		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (��� ��� �������� �Է¹��� ���� ���� �ʿ��ѵ�...
		//  �� ���� �ݺ� �������� ����ϰ� �Ǹ�...
		//  ���� ó�� �Էµ� ���� Ȯ���� �� ���� ������...)
		
		n = su1;

		while (n<=su2)
		{
			result += n;
			n++;
		}

		// ��� ���

		System.out.printf(">>%d ~ %d ������ �� : %d\n", su1, su2, result);


		
		/*
		int a;
		int b;
		int sum1;
		int sum2;

		

		System.out.print("ù ��° ���� �Է� :");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("�� ��° ���� �Է� :");
		b = Integer.parseInt(br.readLine());

        sum1 = (a+b);

		if (a>b)
		{
				a=a^b;
				b=b^a;
				a=a^b;
			{
			while(a < b)
			{
				sum1 += a;
				a++;
				
			}
			}
			System. out.printf(">> %d ~ %d ������ �� : %d\n", a, b, sum1);
			
		}
		*/
			
		

	}
}

// ������
/*
ù ��° ���� �Է� :100
�� ��° ���� �Է� :1
>>1 ~ 100 ������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/