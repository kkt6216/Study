/*================================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - �ڹٿ��� �⺻������ �����ϴ� �ֿ� Ŭ������
  - Random Ŭ����
=================================================*/

/*
�� java.util.Random Ŭ������

   ���� ������ ������ �߻����� �����ϴ� Ŭ�����̴�.
   Math Ŭ������ ���� �޼ҵ��� random() �޼ҵ嵵 ������ �����ϴ� �޼ҵ�������
   0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
   �ʿ��� ������ ������ ������ ���ؼ��� �߰����� ������ ���� ���·� �����ؾ� �Ѵ�.
   �׷��� �ڹٴ� ���� ������ ������ �߻������ִ�
   ���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.

*/

// �ζ� ��ȣ ����(���� �߻� ���α׷�)

// ���α׷��� ����Ǹ�...
// �⺻������ �ζ� 5������ �����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
//   3 12 15 24 31 41
//   1 12 18 36 41 52
//   4  9 12 13 22 30
//   5 10 13 14 22 40 
//  22 31 36 40 43 44
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// �迭 ���� ���� �� �޸� �Ҵ� �� �ζ� ��ȣ�� ��Ƶ� �迭�� 6ĭ
	private int[] num;

	// ������
	Lotto()
	{
		num = new int[6];
	}

	public int[] getNum()
	{
		
		return num;

	}

	// 6���� ������ �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		// Random �ν��Ͻ� ����
		Random rd = new Random();
		int n ;
		int cnt = 0;


		jump:

		while (cnt < 6)				// cnt �� 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;	// 0 ~ 44 �� ��+1�� �� 1 ~ 45
		
			for (int i=0; i<cnt; i++)
			{
				// num[i] ��ҿ� n �� ��
				if (num[i] == n)
					continue jump;
			}

			num[cnt++] = n;
		}

		// ���� �޼ҵ� ȣ��
		sorting();



		/*
		for (int i=0; i<6; i++)
		{
			num[i] = rd.nextInt(45)+1;
			
			for (int j=1; j<i  ;j++ )
			{
				if (num[i]==num[j])
				{
					i--;
				}
				
			}
			
		}
		sorting();
		*/


		
	}
	
	// ���� �޼ҵ� ����
	private void sorting()
	{
		Arrays.sort(num);
		
		


		/*
		for (int i = 0; i< num.length-1; i++)
		{
			for (int j=i+1; j<num.length; j++)
			{
				if (num[i] > num[j])
				{
					num[i] = num[i]^num[j];
					num[j] = num[j]^num[i];
					num[i] = num[i]^num[j];
				}
			}
		}
		*/

	}
}

public class Test146
{
	public static void main(String[] args)
	{
		// Lotto Ŭ���� ��� �ν��Ͻ� ����
		Lotto lotto = new Lotto();

		int[] arr = lotto.getNum();

		// �⺻ 5 ����
		for (int i=1; i<=5; i++)
		{
			// �ζ� 1���� ����
			lotto.start();

			// ��� ���
			for(int n : lotto.getNum())
			{
				System.out.printf("%3d", n);
			}
			System.out.println();


			lotto.getNum();



			/*
			for (int j=0 ; j<arr.length; j++)
			{
				System.out.printf("%3d", arr[j]);

				if (j==5)
					System.out.println();
		
			}
			*/
			
			
		}
		

	}
}


// ���� ���
/*
 10 15 16 26 38 45
  7 10 11 15 25 29
  3 19 27 28 31 43
  2  5  7 25 30 35
  2  5 24 31 37 38
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
  5  7 16 23 41 43
 11 15 19 22 39 45
  8 11 17 25 35 36
  9 13 21 27 33 42
  1  2 11 21 28 40
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
 12 15 30 34 41 43
  5  6  9 17 22 39
  6 14 21 22 37 40
 23 28 29 30 32 42
  9 12 17 28 37 42
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/