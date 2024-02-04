/*=====================================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문 실습(for문) 및 관찰 
  - 다중 for문(반복문의 중첩)을 활용한 구구단 출력 실습
=======================================================*/

// 실행 예)
/*

2 * 1 = 2  3 * 1 = 3  4 * 1 = 4  5 * 1 = 5
2 * 2 = 4  3 * 2 = 6  4 * 2 = 8  5 * 2 = 10
	:			:		  :			 :
2 * 9 = 18 3 * 9 = 27 4 * 9 = 36 5 * 9 = 45

6 * 1 = 6  7 * 1 = 7  8 * 1 = 8  9 * 1 = 9
6 * 2 = 12 7 * 2 = 14 8 * 2 = 16 9 * 2 = 18
	:		 :			:			:
6 * 9 = 54 7 * 9 = 63 8 * 9 = 72 9 * 9 = 81

*/

// ① 2중첩 * 2 

// ② 3중첩 * 1


public class Test059
{
	public static void main(String[] args) 
	{
		// ① Test058 과 비교하여
		//	  출력 방향(출력순서)가 다르기 때문에
		//	  반복문의 제어 흐름도 달라져야 한다.
		//	  (한 방향으로 처리되는 콘솔 기반의 출력 환경이기 때문에...)

		// ② (1)에 따라...
		//	  『단』과 『곱해지는 수』의 위치가
		//	  달라진 상태에서의 반복문 구성

		/*
		for (int i=1;i<=9 ;i++ )				// 웅~	  → 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			for (int j=2; j<=5; j++)			// 쑝쑝쑝 → 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j)); 
			}
			System.out.println();				// 개행
		}
		System.out.println();

		for (int i=1;i<=9 ;i++ )				// 웅~	  → 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			for (int j=6; j<=9; j++)			// 쑝쑝쑝 → 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j)); 
			}
			System.out.println();				// 개행
		}
		*/

		/*
		// ③ (2)에서 처리한 결과를
		//	  두 문단으로 반복하는 반복문 구성
		//	  (check~!!! → 두 번 반복하는 반복문에 (2)결과를 삽입)

		for (int h=0; h<=1; h++)		//문단 구성 check~!!!
		{
			//System.out.println("테스트" + h);
				for (int i=1;i<=9 ;i++ )		// 웅~	  → 곱해지는 수 1 2 3 4 5 6 7 8 9
		{
			for (int j=2; j<=5; j++)			// 쑝쑝쑝 → 단
			{
				System.out.printf("%4d * %d = %2d", j, i, (i*j)); 
			}
			System.out.println();				// 개행
		}
		System.out.println();

		}
		*/


		// ④ 같은 구문을
		//	  두 문단으로 나누어 처리하는 과정에서
		//	  문단에 따라 다르게 주어지는 환경(h 의 값)을 활용하는 방법으로
		//	  최종 반복문 3중첩 구성

		for (int h=0; h<=1; h++)		//문단 구성 check~!!!
		{
			for (int i=1;i<=9 ;i++ )		// 웅~	  → 곱해지는 수 1 2 3 4 5 6 7 8 9
			{
				for (int j=2; j<=5; j++)			// 쑝쑝쑝 → 단
				{
				System.out.printf("%4d * %d = %2d", j+(h*4), i,  ((i*(j+h*4))); 
				}
			System.out.println();				// 개행
			}
		System.out.println();

		}
		

	}
}
/*
		int i, j;

		for (i=1;i<=9 ;i++ )
		{
			for (j=2;j<=5; j++ )
			{
			
				System.out.printf("%2d * %d = %2d",j ,i,(i*j));
			}
			System.out.println();
		}

		System.out.println();

		for (i=1;i<=9 ;i++ )
		{
			for (j=6;j<=9 ;j++ )
			{
				System.out.printf("%2d * %d = %2d", j,i,(i*j));
			}
			System.out. println();
		}
		*/
	
