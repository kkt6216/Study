/*=========================
  ���� �迭 ����
  - �迭�� �迭
===========================*/

// �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
// ������ ���� �����͸� ��ҷ� ���ϴ� �迭�� �����ϰ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
/*
   1   2   3   4   10
   5   6   7   8   26
   9  10  11  12   42 
  13  14  15  16   58
  28  32  26  40  136
 	
 ����Ϸ��� �ƹ� Ű�� ��������...
*/

/*

�� �ݺ����� ó���� �ʿ��� ������ �� �ݺ����� ó���� �ʿ����� ���� ����
							  ��	
				1   2   3   4 �� 10
				5   6   7   8 �� 26
				9  10  11  12 �� 42 
			   13  14  15  16 �� 58
							  ��
			 ������������������ 

			   28   32  36   40   136
*/

public class Test091
{
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int n=0;

		// �׽�Ʈ ���� 
		//int sum = 0;

		// �� for�� ����2�� ��-1�� �� �ݺ����� ó���� �ʿ����� ���� ����
		for (int i=0; i<arr.length-1; i++)			//-- ��~~~ i ��  0    1    2    3
		{
			for (int j=0; j<arr[i].length-1; j++)	//-- ������ j �� 0123 0123 0123 1023
			{
				n++;
				arr[i][j] = n;

				//sum += arr[i][j];
				//System.out.printf("%4d",sum);
				
				arr[i][4] = arr[i][j];
				/*
				arr[0][4] += arr[0][0];
						  += arr[0][1];
						  += arr[0][2];
						  += arr[0][3];
						  :
				*/
				
				arr[arr.length-1][j] = arr[i][j];
				/*
				arr[4][0] += arr[0][0];
				          += arr[1][0];
						  += arr[2][0];
						  += arr[3][0];
						  :
				*/
				
				arr[4][4] = arr[i][j];
				/*
				arr[4][4] += arr[0][0];
				          += arr[0][1];
						  += arr[0][2];
						  += arr[0][3];
						  :
				*/
		

			}
			
		}



		
		// �迭�� �迭 ��ü ��� ����
		for (int i=0; i<arr.length; i++)
		{
		
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%4d", arr[i][j]);
				
			}
			System.out.println();

		}
		
	
	}
}





/* ��Ǯ��
		int[][] arr = new int[5][5];
		int n=1;

		for (int i=0; i<4; i++)
		{
		
			for (int j=0; j<4; j++)
			{
				
				arr[i][j] = n;

				arr[i][4] += n;
				arr[4][j] += n;
				arr[4][4] += n;
				n++;
				

			
			}
			
		}


		// ��ü ��� ���
		for (int i = 0; i<arr.length; i++)		
		{
			for (int j=0; j<arr[i].length; j++)	
			{
				System.out.printf("%4d", arr[i][j]);
				
			}
			System.out.println();

	    }
    }
}

*/


