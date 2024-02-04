/*=========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - 반복문(while문) 실습 및 관찰 
  =========================================*/

  // 반복문을 활용하여 누적곱 연산 수행
  // cf.			   누적합
  
  // 1 * 2 * 3 * 4 * ... * 9 * 10

  // 실행 예)
  // 연산 결과 : xxxx
  // 계속 하려면 아무 키나 누르세요...

public class Test049
{
	public static void main(String[] args)
	{	

		// 주요 변수 선언 및 초기화
		int n = 0;					//-- 루프 변수
		int result = 1;				//-- 누적곱을 담아낼 변수
		//-- check~!!!				//   (1로 초기화)
		//	 누적합을 처리할 때와 같이
		//	 0으로 초기화를 수행하게 되면
		//	 어떤 수를 곱하더라도 연산 결과는 0

		// 연산 및 처리(반복문 구성)
		while (n<10)
		{	
			n++;
			result *= n;
		}
		// 결과 출력
		System. out.printf("연산 결과 : %d\n", result);


		/*
		int n = 1;
		int sum = 1;

		while (n<=10)
		{	
			
			sum *= n;
			n++;
		}
			System. out.printf("연산 결과 : %d\n", sum);
		*/

	}
}

// 실행 결과
/*
연산 결과 : 3628800
계속하려면 아무 키나 누르십시오 . . .
*/