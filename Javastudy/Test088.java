/*=========================
  ���� �迭 ����
  - �迭�� �迭
===========================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
  1  2  3  4  5		
  5  1  2  3  4			
  4  5  1  2  3			
  3  4  5  1  2		
  2  3  4  5  1		
 ����Ϸ��� �ƹ� Ű�� ��������...
*/

/*
  1  2  3  4  5			i=0 �� 12345		�� 0 ��ġ���� ���	�� i ��ġ���� ���	
  5  1  2  3  4			i=1 �� 12345		�� 1 ��ġ���� ���	�� i ��ġ���� ���		
  4  5  1  2  3			i=2 �� 12345		�� 2 ��ġ���� ���	�� i ��ġ���� ���		
  3  4  5  1  2			i=3 �� 12345		�� 3 ��ġ���� ���	�� i ��ġ���� ���		
  2  3  4  5  1			i=4 �� 12345		�� 4 ��ġ���� ���	�� i ��ġ���� ���	
*/

/*
  1  2  3  4  5		|	
     1  2  3  4     |	5
	    1  2  3		|	4  5
		   1  2		|	3  4  5 
		      1		|	2  3  4  5

*/

public class Test088
{
	public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)		// i �� 0 1 2 3 4
		{
			for (int n=1, j=i; n<=5; n++)				// n �� 1 2 3 4 5
			{
				// �׽�Ʈ(Ȯ��)
				 System.out.print(" "+ i + "," + j + " [" + n + "]");
				arr[i][j] = n;
				j++;
				
				if (j==5)
				{
					j=0;
				}
				
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




		/*
		int n=1;

		int arr[][] = new int[5][5];

		for (int i=0; i<arr.length; i++)
		{
			
			for (int j=0; j<arr[i].length; j++)
			{
				n = j-i;      
				
				if (j-i <0)
				{
					n+=5;
				}
				
				arr[i][j] = n+1;
			}
			
			
		}
		

		for (int i = 0; i<arr.length; i++)
		{
			
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

		*/

	}
}

// ���� ���
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/