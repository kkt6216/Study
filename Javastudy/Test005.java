/*=================================
 ■■■ 자바의 개요 및 특징  ■■■
 - 변수와 자료형
 -키워드 및 식별자
 - printf()
 =================================*/

public class Test005
{
	public static void main(String[] args)
	{
		// 변수 선언(메모리 확보) 및 초기화(메모리에 값을 할당)
		int a=10, b=5;

		// 변수 선언
		int c, d;

		// 연산 및 처리
		c = a + b;		//-- a + b 의 결과값을 변수 c 에 대입.
		d = a - b;		//-- a - b 의 결과값을 변수 d 에 대입.

		// 결과 출력 → 『10 + 5 = 15』 의 형태...
		System.out.println( a + "+" + b + " +"  +  " = " + c); 
		//--==>> 10 + 5 = 15
		//					숫자 문자열 숫자문자열 숫자
		//-- 자바에서는 서로 다른 자료형의 데이터들끼리도
		//	『+』 연산이 가능하며
		//	다른 어떤 자료형과 문자열 데이터의 『+』 연산 결과는 문자열.
		//	즉, 문자열 결합 연산자로써 『+』

		//println() / print() / printf()/ format()

		System.out.println("abcd");
		System.out.print("abcd\n");

		// ※ 문자열 영역 안에서 사용되는 『"\n"』은 개행(줄바꿈)~!!

		// printf() / format()
		//-- JDK 1.5 부터 지원되는 메소드

		//System.out.printf("○ + ○ = ○" , 10, 20, 30);
		System.out.printf("%d + %d = %d\n" , 10, 20, 30);	// 『\n』 개행
		System.out.printf("%d + %d = %d%n" , 10, 20, 30);	// 『%n』 개행
		//--==>> 10 + 20 = 30
		//		 10 + 20 = 30
		//-- 『%n』 → (10진수 정수형) 는 서식 지정 옵션 

		
		//System.out.printf("○ 와 ○\n", 12, 13);
		System.out.printf("%d 와 %d\n", 12, 13);
		//System.out.printf("○ 와 △\n", 12, 13.45);
		//System.out.printf("%d 와 %d\n", 12, 13.45);
		//--== 에러 발생(런타임 에러)
		
		System.out.printf("%d 와 %f\n" , 12, 13.45);
		//--==>> 12 와 13.450000
		//-- 『%f』 → 실수형 서식 지정 옵션

		System.out.printf("%d 와 %.1f\n" , 11, 12.34);
		//--==>> 11 와 12.3
		//-- 『%.1f』 → 소수점 이하 첫 번째 자리까지 표현

		System.out.printf("%d 와 %.2f\n" , 11, 12.34);
		//--==>> 11 와 12.34
		//-- 『%.2f』 → 소수점 이하 두 번째 자리까지 표현

		System.out.printf("%d 와 %.3f\n" , 11, 12.34);
		//--==>> 11 와 12.340
		//-- 『%.2f』 → 소수점 이하 세 번째 자리까지 표현

		System.out.printf("%f\n", 3.141592);
		//--==>> 3.141592

		System.out.printf("%.4f\n", 3.141592);
		//--==>> 3.1416
		//-- 『%.4f』 → 소수점 이하 네 번째 자리지 표현 
		//               ( 다섯 번째 자리에서 반올림)

		//실행 결과

		/*
		10+5 + = 15
abcd
abcd
10 + 20 = 30
10 + 20 = 30
12 와 13
12 와 13.450000
11 와 12.3
11 와 12.34
11 와 12.340
3.141592
3.1416
*/

        

	}
}