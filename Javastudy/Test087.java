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
  2  3  4  5  6			
  3  4  5  6  7 			
  4  5  6  7  8		
  5  6  7  8  9			
 ����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test087
{
	public static void main(String[] args)
	{
		
		
		int n=1;
		
		// �迭 ����
		int[][] arr = new int[5][5];
			
			for (int i = 0; i<arr.length; i++)			//-- ��~~~~
			{
				n = i+1;
				for (int j=0; j<arr[i].length; j++)		//-- ������
				{	
					//�׽�Ʈ (Ȯ��)
					//System.out.print("i" + i + ",j" +j);
					//System.out.print(" [" + n + ] ");

					arr[i][j] = n;
					n++;
				}
				//System.out.println();
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
		
		/* ��Ǯ��
		int n=1;
		
		// �迭 ����
		int[][] arr = new int[5][5];
			
			for (int i = 0; i<arr.length; i++)			//-- ��~~~~
			{
				
				for (int j=0; j<arr[i].length; j++)		//-- ������
				{	
					//�׽�Ʈ (Ȯ��)
					//System.out.print("i" + i + ",j" +j);
					arr[i][j] = n;
					n++;
				}
				//System.out.println();
				n-=4;
				
				
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

*/