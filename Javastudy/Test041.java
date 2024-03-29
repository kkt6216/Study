/*=========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - switch 문 실습 
  =========================================*/

// 사용자로부터 1 부터 3 까지의 정수 중 하나를 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
// 단, 두 가지 방법으로 구현할 수 있도록 한다.

// ① switch 문의 일반 모델을 사용하여 구현한다.
// ② switch 문의 기본 모델을 사용하되,
//	  『break』를 딱 한 번만 사용할 수 있도록 구현한다.

// 실행 예)
// 임의의 정수 입력(1~3) : 3
// ★★★
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력(1~3) : 3
// ★
// 계속하려면 아무 키나 누르세요...

// 임의의 정수 입력(1~3) : 7
// 입력 오류~!!
// 계속하려면 아무 키나 누르세요...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a ;
		String b;

		System.out.print("임의의 정수 입력(1~3) :");
		a = Integer.parseInt(br.readLine());
/*      
		// 방법 ① 

		switch (a)
		{
			case 1: b ="★"; break;
			case 2: b ="★★"; break;
			case 3: b ="★★★"; break;
			default : b = "입력 오류~!!!"; //break;
		}

		
	    System.out.printf("%s\n", b); 
*/


		switch (a)
		{
			case 3: System.out.print("★");
			case 2: System.out.print("★");
			case 1: System.out.print("★");
						break;
			default : System.out.println("입력 오류~!!!");
		}
		System.out. println();
	}
}


// 실행 결과

/*
임의의 정수 입력(1~3) :1
★
계속하려면 아무 키나 누르십시오 . . .

*/

/*
임의의 정수 입력(1~3) :2
★★
계속하려면 아무 키나 누르십시오 . . .

*/

/*
임의의 정수 입력(1~3) :3
★★★
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(1~3) :4
입력 오류~!!!

계속하려면 아무 키나 누르십시오 . . .
*/