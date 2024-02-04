/*=========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if 문
  - if ~ else 문 실습
  =========================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if ~ else문, 조건연산자, 복합if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참(true)일 경우
//	  특정 문장을 수행하고자 할 때 사용되는 구문이다.

// 사용자로부터 임의의 정수 5개를 입력받아
// 짝수별, 홀수별 합계를 출력하는 프로그램을 구현한다.
// 단, Scanner 를 활용하여 데이터를 입력받을 수 있도록 한다.

// 실행 예)
// 임의의 정수 5개 입력(공백 구분) : 11 12 13 14 15

// >> 짝수의 합은 26 이고, 홀수의 합은 39입니다.
// 계속하려면 아무 키나 누르세요...



import java.util.Scanner;


public class Test037
{
	public static void main(String[] args)
	{

	// 주요 변수 선언
	Scanner sc = new Scanner(System.in);

	// 누적합을 담아낼 변수 초기화
	int evenSum = 0;			//-- 짝수의 합을 담아낼 변수 선언
	int oddSum = 0;				//-- 홀수의 합을 담아낼 변수 선언
	int num1, num2, num3, num4, num5;
	//-- 사용자로부터 입력받은 5개의 정수를 담을 변수 선언

	
	// 연산 및 처리
	System.out.print("임의의 정수 5개 입력(공백구분) : "); // 10 20 30 40 50
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	num3 = sc.nextInt();
	num4 = sc.nextInt();
	num5 = sc.nextInt();

	if (num1%2==0)	//-- num1이 짝수일 때...
	{
		// evenSum 을 num1 만큼 증가
		evenSum += num1;
	}
    else			//-- num1 이 짝수가 아닐 때...(홀수일 때)
	{
		// oddSum 을 num1 만큼 증가
		oddSum += num1;
	}

	if (num2%2==0)	//-- num2 가 짝수일 때...
	{
		evenSum += num2;
	}
	else
	{
		oddSum += num2;
	}

	if (num3%2==0) 
	{
		evenSum += num3; 
	}
	else
	{
		oddSum += num3;
	}

	if (num4%2==0)
	{
		evenSum += num4;
	}
	else
	{
		oddSum += num4;
	}
	if (num5%2==0)
	{
		evenSum += num5;
	}
	else
	{
		oddSum += num5;
	}


 

	// 결과 출력
	System.out.printf("\n>> 짝수의 합은 %d이고, 홀수의 합은 %d 이다.\n", evenSum,oddSum);

	}
}


// 실행결과
/*
임의의 정수 5개 입력(공백구분) : 11 22 33 44 55

>> 짝수의 합은 66이고, 홀수의 합은 99 이다.
계속하려면 아무 키나 누르십시오 . . .
*/
	
	
	
	
	
	
	
	
	
	
	/*
	int a, b, c, d, e;
	int even;
	int odd;
	 

	System.out.print("임의의 정수 5개 입력(공백 구분) : ");

	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	d = sc.nextInt();
	e = sc.nextInt();

	even = 0;
	odd = 0;

	
	if (a%2==0)
	{
		System.out.printf("%d\n", a); 
	}
	else 
		System.out.printf("%d\n", a);

	if (b%2==0)
	{
		System.out.printf("%d\n", a); 
	}
	else 
		System.out.printf("%d\n", a);

	if (b%2==0)
	{
		System.out.printf("%d\n", b); 
	}
	else 
		System.out.printf("%d\n", b);

	if (c%2==0)
	{
		System.out.printf("%d\n", c); 
	}
	else 
		System.out.printf("%d\n", c);

	if (d%2==0)
	{
		System.out.printf("%d\n", d); 
	}
	else 
		System.out.printf("%d\n", d);

	if (e%2==0)
	{
		System.out.printf("%d\n", e); 
	}
	else 
		System.out.printf("%d\n", e);
	*/


	



	


	

	

