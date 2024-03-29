/*=========================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
===========================*/

// ○ 과제
//	  사용자로부터 임의의 정수를 임의의 갯수 만큼 입력받아
//	  입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 구현한다.
//	  단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수   : 11
// 데이터 입력(공백 구분) : 45 11 26 35 66 97 50 2 123 10 7

// >> 가장 큰 수 → 123
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test083
{
	public static void main(String[] args)
	{
		//사용자로부터 입력을 받기 위해 Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// 사용자가 입력할 데이터의 갯수를 담아낼 변수 선언
		int n;												
		
		System.out.print("입력할 데이터의 갯수   :");	//-- 사용자에게 "입력할 데이터의 갯수"를 입력하라는 메시지를 출력
		n = sc.nextInt();								//-- 사용자가 입력한 값을 정수로 읽어와 변수 n에 저장 
		
		// 크기가 n인 정수 배열 data를 생성
		int[] data = new int[n];
		

		System.out.print("데이터 입력(공백 구분) :");	//-- 사용자에게 "데이터 입력(공백 구분)"을 입력하라는 메시지를 출력
		for (int i=0; i<n; i++)
		{
			data[i] = sc.nextInt();						//-- 사용자가 입력한 데이터갯수 만큼 입력값 담아내기
		}												
		
		//-- 가장 큰 수를 담기위한 변수 h 선언 후
		//	 data[]를 0으로 초기화 
		int h = data[0];
		
		//-- data[]의 현재 요소가 변수 h에 저장된 값보다 크다면, 
		//	 변수 h의 값을 현재 요소의 값으로 업데이트 
		for (int i=0;i<n ; i++)
		{
			if (data[i] > h)
			{
				h = data[i];
			}
		}
		System.out.println("가장 큰 수 → " + h);		//-- "가장 큰 수 → " 문구와 함께 h가 출력 

	}
}

// 실행 결과
/*
입력할 데이터의 갯수   :11
데이터 입력(공백 구분) :45 11 26 35 66 97 50 2 123 10 7
가장 큰 수 → 123
계속하려면 아무 키나 누르십시오 . . .
*/