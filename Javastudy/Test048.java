/*=========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - �ݺ���(while��) �ǽ� �� ���� 
  =========================================*/

// 1/2 + 2/3 + 3/4 + 4/5 +...+ 9/10
// �� ���� ó������� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ��� : ????? �� �Ǽ� ��� ����
// ����Ϸ��� �ƹ� Ű�� ��������

public class Test048
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		int n=0;					//-- 1���� 1�� �����ϰ� �� ���� 
		double sum = 0;				//-- �������� ��Ƴ� ����(�Ǽ� ���·� ó��)


		// ���� �� ó��
		while (n < 9)	//-- 0 1 2 3 4 5 6 7 8 
		{
			// ������ ����
			//-- ���������� �ݺ����� ������ ���ʶ߸��� �Ǵ� ���谡 �Ǵ� ����
			n++;					//-- 0 1 2 3 4 5 6 7 8 9
			sum += (double)n/(n+1);
			//	   1.0/2  2.0/3  3.0/4  4.0/5 ... 9.0/10
			//--  ������� �������� ���� ��ȯ�ϱ� ������
			//	  �Ǽ� ��� ������ �����ϵ��� ó���ϱ� ���ؼ�
			//	  ������ �����ڸ� �߽����� �ǿ����� �� �ϳ���
			//	  �Ǽ� ���·� ������ִ� ���� �߿��ϴ�.

		}

		// ��� ���
		System.out.printf("���� ��� : %f\n", sum);
		//--==>> ���� ��� : 7.071032


		
		
		
		
		
		
		
		
		/*
		double n = 1;
		double sum = 0;

		while (n <= 9)
		{
		
		sum += n/(n+1);
		n++;
		
		}
		System.out.printf("���� ��� : %.2f\n", sum);  
		*/
	}
}
// ���� ���

/*
���� ��� : 7.071032
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/