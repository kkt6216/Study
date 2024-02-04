/*=============================
  ■■■ 자바의 개요 및 특징 ■■■
  ============================*/

// ○ 퀴즈
//	  사전에 부여된 반지름 정보를 통해
//	  원의 넓이와 둘레를 구하는 프로그램을 구현한다.
//	  → 반지름 : 10

// 원의넓이 : 반지름 * 반지름 * 원주율
// 원의 둘레 : 지름 * 원주율

// 실행 예)
// 넓이 : xxxx
// 둘레 : xxxx
// 계속하려면 아무 키나 누르세요...

public class Test010
{
public static void main(String[] args)
	
	{
	
	int a = 10;
	double b = a * a * 3.14;
	double c = a * 2 * 3.14;

		System.out.printf("넓이 :%.0f\n", b); 
		System.out.printf("둘레 :%.0f\n", c);


	


/*	
	// 함께 풀이한 내용 ------------------------
	
	// 주요변수 선언
	int r = 10;			//-- 반지름(r)
	//double pi=3.141592; //-- 원주율(π)
	//final double pi=3.141592; //-- 원주율(π)
	final double PI=3.141592; //-- 원주율(π)
	//-- 『final』 키워드 : 변수의 상수화 ~!!!

	// rainbowcolor → RAINBOWCOLOR → RAINBOW_COLOR
	// userName → USERNAME → USER_NAME
	// applePrice → APPLEPRICE → APPLE_PRICE

	double area, length;			//-- 원의 넓이, 둘레


	// 연산 및 처리
	// 1. 넓이 연산
	//    원의넓이 : 반지름 * 반지름 * 3.141592
	area = r * r * PI;

	// 2. 둘레 연산
	//    원의 둘레 : 반지름 * 2 * 3.141592
	length = r * 2 * PI;

	// 결과 출력
	//System.out.println("넓이 : " + area);
	//System.out.println("둘레 : " + length);

	//System.out.printf("넓이 :%.3f\n " , area);
	//System.out.printf("둘레 :%.3f\n " , length);

	System.out.printf("넓이 :%.3f\n둘레 :%.3f\n " area , length);

*/
	

   
}
}