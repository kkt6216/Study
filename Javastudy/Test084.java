/*=========================
  ■■■ 배열 ■■■
  - 배열의 선언과 초기화
  - 배열의 기본적 활용
===========================*/

// ○ 과제
//	  사용자로부터 임의의 학생 수를 입력받고
//	  그 만큼의 점수(정수 형태)를 입력받아
//	  전체 학생 점수의 합, 평균, 편차를 구해서
//	  결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력 : 90
// 2번 학생의 점수 입력 : 82
// 3번 학생의 점수 입력 : 64
// 4번 학생의 점수 입력 : 36
// 5번 학생의 점수 입력 : 98

// >> 합: 370
// >> 평균 : 74.0
// >> 편차
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0
// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test084
{
	public static void main(String[] args)
	{
		//사용자로부터 입력을 받기 위해 Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 주요 변수 선언
		int st;														//-- 사용자가 입력할 학생 수 를 담아낼 변수 선언

		int sum = 0;												//-- 점수의 합을 담을 변수
		double average;												//-- 점수의 평균을 담을 변수
		double deviation;											//-- 점수의 편차를 담을 변수

		System.out.print("학생 수 입력            :");				//-- 사용자에게 "학생 수 입력" 메시지를 출력
		st = sc.nextInt();											//-- 사용자가 입력한 값을 정수로 읽어와 변수 st에 저장
   
		
		int[] arr1 = new int[st];									//-- 입력받은 학생 수만큼 점수를 저장할 배열을 생성				
				
		// 각 학생의 점수를 입력 받기
		for (int i=0; i<st; i++)									
		{
			System.out.printf("%d 번 학생의 점수 입력   :",i+1);	//-- 사용자가 입력한 데이터갯수 만큼 입력값 담아내기
			arr1[i] = sc.nextInt();
		}

		
		// 전체 학생의 점수 합을 계산
		for (int i=0; i<st; i++)
		{
			sum += arr1[i];
		}
		// 평균 계산	(평균 = 점수의 합/학생수)
		average = sum/st;											
		
		// 결과 출력
		System.out.println();										//-- 개행
		System.out.printf(">> 합   : %d\n", sum);					
		System.out.printf(">> 평균 : %.2f\n", average);
		
		// 각 학생의 편차를 계산하여 출력 (편차 = 평균 - 점수)
		System.out.println(">> 편차");
	    for (int i=0; i<st; i++)
	    {
			deviation = average - arr1[i];
			System.out.printf("%d : %.1f\n", arr1[i], deviation);
	    }
		

	}
}
// 실행 결과
/*
학생 수 입력            :5
1 번 학생의 점수 입력   :90
2 번 학생의 점수 입력   :82
3 번 학생의 점수 입력   :64
4 번 학생의 점수 입력   :36
5 번 학생의 점수 입력   :98

>> 합   : 370
>> 평균 : 74.00
>> 편차
90 : -16.0
82 : -8.0
64 : 10.0
36 : 38.0
98 : -24.0
계속하려면 아무 키나 누르십시오 . . .
*/