/*=========================
  ���� �迭 ����
  - �迭�� �迭
===========================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
  1  8   9  16  17		
  2  7  10  15  18			
  3  6  11  14  19			
  4  5  12  13  20		
 	
 ����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test089
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[4][5];

		int n = 0;
		
		for (int i=0; i<5; i++)			//outer ��~~~~~~ i �� 0 1 2 3 4
		{
			for (int j=0; j<4; j++)		// inner ������ j �� 0 1 2 3
			{
				
				n++;
				

				if (i%2==0)
					arr[j][i] = n;
				else
					arr[3-j][i] = n;
			}
		}
		

		// ��ü ��� ���
		for (int i = 0; i<arr.length; i++)		// i �� 0 1 2 3 
		{
			for (int j=0; j<arr[i].length; j++)	// j �� 0 1 2 3 4
			{
				System.out.printf("%3d", arr[i][j]);
				
			}
			System.out.println();

		}


	}
}

/* ��Ǯ��
		int n=1;

		int[][] arr = new int[4][5];


			for (int j=0; j < 5; j++)
			{
			
				
				for (int i=0; i<4; i++)
				{
					 //�׽�Ʈ(Ȯ��)
					System.out.print(" "+ j + "," + i + " [" + n + "]");
					arr[i][j] = n;
					n++;
					
				
					if (j==1)
						arr[i][j] = (i-8) * -1;
				

					 if (j==3)
						arr[i][j] = (i-16) * -1;
				
				}
				System.out.println();
				
				
			}


			// �迭 ��ü ��� ���
		for (int i = 0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
*/


// ���� ���
/*
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
 */