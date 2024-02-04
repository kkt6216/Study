/*=========================
  ■■■ 배열 ■■■
  - 배열의 배열
===========================*/

// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  1  2  3  4  5		
  5  1  2  3  4			
  4  5  1  2  3			
  3  4  5  1  2		
  2  3  4  5  1		
 계속하려면 아무 키나 누르세요...
*/

/*
  1  2  3  4  5			i=0 → 12345		→ 0 위치부터 출발	→ i 위치부터 출발	
  5  1  2  3  4			i=1 → 12345		→ 1 위치부터 출발	→ i 위치부터 출발		
  4  5  1  2  3			i=2 → 12345		→ 2 위치부터 출발	→ i 위치부터 출발		
  3  4  5  1  2			i=3 → 12345		→ 3 위치부터 출발	→ i 위치부터 출발		
  2  3  4  5  1			i=4 → 12345		→ 4 위치부터 출발	→ i 위치부터 출발	
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
		// 배열의 배열 선언 및 메모리 할당
		int[][] arr = new int[5][5];

		for (int i=0; i<arr.length; i++)		// i → 0 1 2 3 4
		{
			for (int n=1, j=i; n<=5; n++)				// n → 1 2 3 4 5
			{
				// 테스트(확인)
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
		
		// 배열 전체 요소 출력
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

// 실행 결과
/*
  1  2  3  4  5
  5  1  2  3  4
  4  5  1  2  3
  3  4  5  1  2
  2  3  4  5  1
계속하려면 아무 키나 누르십시오 . . .
*/