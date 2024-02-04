/*=========================
  ■■■ 배열 ■■■
  - 배열의 배열
===========================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  8   9  16  17		
  2  7  10  15  18			
  3  6  11  14  19			
  4  5  12  13  20		
 	
 계속하려면 아무 키나 누르세요...
*/

public class Test089
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[4][5];

		int n = 0;
		
		for (int i=0; i<5; i++)			//outer 웅~~~~~~ i → 0 1 2 3 4
		{
			for (int j=0; j<4; j++)		// inner 쑝쑝쑝 j → 0 1 2 3
			{
				
				n++;
				

				if (i%2==0)
					arr[j][i] = n;
				else
					arr[3-j][i] = n;
			}
		}
		

		// 전체 요쇼 출력
		for (int i = 0; i<arr.length; i++)		// i → 0 1 2 3 
		{
			for (int j=0; j<arr[i].length; j++)	// j → 0 1 2 3 4
			{
				System.out.printf("%3d", arr[i][j]);
				
			}
			System.out.println();

		}


	}
}

/* 내풀이
		int n=1;

		int[][] arr = new int[4][5];


			for (int j=0; j < 5; j++)
			{
			
				
				for (int i=0; i<4; i++)
				{
					 //테스트(확인)
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


			// 배열 전체 요소 출력
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


// 실행 결과
/*
  1  8  9 16 17
  2  7 10 15 18
  3  6 11 14 19
  4  5 12 13 20
 */