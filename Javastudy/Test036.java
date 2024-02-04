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

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 753
// 두 번째 정수 입력 : 22
// 세 번째 정수 입력 : 124
//
// >> 정렬 결과 : 22 124 753
// 계속하려면 아무 키나 누르세요...

/*
	8	21	74
	------
	--		--
		-------

	7	25	99
	-----
	--		--	
		-------	

	12	25	87
	------
	--		--
		------

① 첫 번째 정수 vs 두 번째 정수 크기 비교
	→ 첫 번째 정수가 두 번째 정수보다 클 경우... 자리 바꿈

② 첫 번째 정수 vs 세 번째 정수 크기 비교
	→ 첫 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈

③ 두 번째 정수 vs 세 번째 정수 크기 비교
	→ 두 번째 정수가 세 번째 정수보다 클 경우... 자리 바꿈

*/



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


	int a, b, c;			//-- 사용자가 입력하는 임의의 정수를 담아둘 변수

	System.out.print("첫 번째 정수 입력 :");
	a = Integer.parseInt(br.readLine());
	System.out.print("두 번째 정수 입력 :");
	b = Integer.parseInt(br.readLine());
	System.out.print("세 번째 정수 입력 :");
	c = Integer.parseInt(br.readLine());
	
	if (a > b)			//-- 첫 번째 정수가 두 번째 정수보다 클 경우
	{
		// 자리 바꿈
		a=a^b;
		b=b^a;
		a=a^b;
	}

	if (a > c)			//-- 첫 번째 정수가 세 번째 정수보다 클 경우
	{
		// 자리 바꿈
		a=a^c;
		c=c^a;
		a=a^c;
	}

	if (b > c)			//-- 두 번째 정수가 세 번째 정수보다 클 경우
	{
		// 자리 바꿈
		b=b^c;
		c=c^b;
		b=b^c;
	}


	// 최종 결과 출력
	System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);
	
	


	
	/* 내가풀이한내용

	int a,b,c;
	
	System.out.print("첫 번째 정수 입력 :");
	a = Integer.parseInt(br.readLine());

	System.out.print("두 번째 정수 입력 :");
	b = Integer.parseInt(br.readLine());

	System.out.print("세 번째 정수 입력 :");
	c = Integer.parseInt(br.readLine());

	if (a<b && b<c && a<c)
		System.out.printf(">> 정렬 결과 : %d  %d  %d\n:", a,b,c); 
	else if (a<b && a<c && b>c)		
		System.out.printf(">> 정렬 결과 : %d  %d  %d\n:", a,c,b); 
	else if (a>b && a<c && b<c)
		System.out.printf(">> 정렬 결과 : %d  %d  %d\n:", b,a,c);
	else if (a>b && c>b && a<c)
		System.out.printf(">> 정렬 결과 : %d  %d  %d\n:", b,c,a);
	else if (a>c && c<b && a<b)
		System.out.printf(">> 정렬 결과 : %d  %d  %d\n:", c,a,b);
	else if (a>c && a>b && c<b)
		System.out.printf(">> 정렬 결과 : %d  %d  %d\n:", c,b,a);
	*/

	}
}
// 실행 결과

/*
첫 번째 정수 입력 :300
두 번째 정수 입력 :200
세 번째 정수 입력 :100

>> 정렬 결과 : 100 200 300
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 :200
두 번째 정수 입력 :300
세 번째 정수 입력 :100

>> 정렬 결과 : 100 200 300
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 :100
두 번째 정수 입력 :100
세 번째 정수 입력 :200

>> 정렬 결과 : 100 100 200
계속하려면 아무 키나 누르십시오 . . .

*/