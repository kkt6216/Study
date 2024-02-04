/*=====================================
  ■■■ 클래스와 인스턴스 ■■■
=====================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하려여 작성할 수 있도록 한다.
// (Calculate 클래스 설계)

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 100 51
// 임의의 연산자(+ - * /)		  : +

// >> 100 + 51 = 151
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;
import java.io.IOException;

class Calculate
{
	// 주요 변수 선언
		int su1, su2;		//-- 사용자로부터 입력받은 두 정수를 담아낼 변수
		char op;			//-- 사용자로 부터 입력받은 연산자를 담아낼 변수

		// 메소드 정의(기능 : 입력)

	void input()  throws IOException
	{
		Scanner sc = new Scanner(System.in); 

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		su1 = sc.nextInt();
		su2 = sc.nextInt();
		

		System.out.print("임의의 연산자(+ - * /)         :");
		op = (char)System.in.read();
		
	}

	// 메소드 정의(기능 : 연산) → 나눗셈 연산도 정수 기반으로 처리
	int cal()
	{
		int result = -1;

		switch (op)
		{
		case '+': result = su1 + su2; break;
		case '-': result = su1 - su2; break;
		case '*': result = su1 * su2; break;
		case '/': result = su1 / su2; break;
		//default : result = -1
		
		}
		return result;
	}

	// 메소드 정의(기능 : 출력)
	void print(int s)
	{
		System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s);
	}
}


public class Test073
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 인스턴스 생성
		Calculate cal = new Calculate();

		cal.input();		//-- 생성한 인스턴스를 통한 입력 메소드 호출
		int r = cal.cal();	//-- 생성한 인스턴스를 통한 연산 메소드 호출
		cal.print(r);		//-- 생성한 인스턴스를 통한 출력 메소드 호출
	}
}

// 실행 결과
/*
임의의 두 정수 입력(공백 구분) : 10 10
임의의 연산자(+ - * /)         :+
>> 10 + 10 = 20
계속하려면 아무 키나 누르십시오 . . .

*/




/*
import java.util.Scanner;

class Calculate
{
	void input() 
	{
		Scanner sc = new Scanner(System.in); 
		
		int a;
		int b;
		char c;

		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.in.skip(2);

		System.out.print("임의의 연산자(+ - * /)		  :");
		c = (char)sc.nextInt();
		System.in.skip(2);


	}

	int cal()
	{
		if (c=='+')
		{
			result=a+b;
		}
		else if(c=='-')
		{
			result=a-b;
		}
		else if(c=='*')
		{
			result=a*b;
		}
		else if(c=='/')
		{
			result=a/b;
		}

		return result;

	}
	 
	
	void print()
	{

		System.out.printf("\n>> %d %c %d = %d\n", a, c, b, result);
	}
	



}






public class Test073
{
	public static void main(String[] args) 
	{
		Calculate ob = new Calculate();

		ob.input();

		int s = ob.cal();

		ob.print(s);

	}
}

*/