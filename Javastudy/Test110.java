/*===========================================
  ■■■ 정렬(Sort) 알고리즘 ■■■
===========================================*/

// ○ 과제
//	  사용자로부터 여러 학생의 성적 데이터를 입력받아
//	  점수가 높은 학생부터 낮은 순으로 등수를 부여하여
//	  결과를 출력하는 프로그램을 구현한다.
//	  단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 임하성 90
// 이름 점수 입력(2, 공백 구분) : 정한울 80
// 이름 점수 입력(3, 공백 구분) : 정현욱 85
// 이름 점수 입력(4, 공백 구분) : 채다선 75
// 이름 점수 입력(5, 공백 구분) : 최혜인 95
/*
-----------------------
1등 최혜인 95
2등 임하성 90
3등 정현욱 85
4등 정한울 80
5등 채다선 75
-----------------------
계속하려면 아무 키나 누르세요...
*/

import java.util.Scanner;

public class Test110
{
	public static void main(String[] args)
	{	
		//-- 사용자로부터 인원 수 입력을 받기 위한  Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언 및 초기화 
		int inwon;														//-- 입력 받을 인원 수
		int rank=1;														//-- 등수 변수 선언 및 1등 부터 표기하기 위해 1로 초기화

		String[] name;													//-- 이름을 담을 문자열 배열 선언 
        int[] score;													//-- 점수를 담을 정수형 배열 선언


		System.out.print("인원 수 입력 : ");							//-- 사용자에게 메세지 호출
		inwon = sc.nextInt();

	    name = new String[inwon];										//-- 입력된 인원 수 만큼 이름을 저장할 배열 생성 
        score = new int[inwon];											//-- 입력된 인원 수 만큼 점수를 저장할 배열 생성

		for (int i=0; i<inwon; i++)
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ", i+1); //-- i는 0부터 시작하므로 i+1을 하여 1부터 출력
			name[i] = sc.next();										//	 이름을 입력받아 배열에 저장
			score[i] = sc.nextInt();									//	 점수를 입력받아 배열에 저장

			// 테스트(확인)
			// System.out.println(name[i] + score[i]);
		}
		
		//-- 선택 정렬 사용
		for (int i =0; i <inwon ; i++ )
		{
			for (int j = i+1; j <inwon ; j++ )
			{
				if (score[i] < score[j])
				{
					//-- score[i]가 score[j]보다 작을 경우 두 값의 자리를 바꿀 수 있도록 처리
					//	 (내림차순) 
					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];

					//-- 문자열 형태의 배열인 name[i]는 '^' 연산이 불가능 하므로... 다음과 같이 ... 
					//	 name[i]의 값을 비어 있는  문자열 temp 에 넘겨준다.  
					//   → name[j]의 값을  name[i]에 넘겨준다.	  
					//   → name[i]의 값이 들어있는 temp를 name[j]에 넘겨준다.	→ name[j]방에 name[i]의 값이 들어온다.
					//   결과 → name[i] 와 name[j]가 서로 바뀌게 됨
					String temp = name[i];						
					name[i] = name[j];							
					name[j] = temp;								
				}
			}
		}
		//-- 결과 출력
		System.out.println("\n-----------------------");
		for (int i =0; i < inwon; i++ )
		{
			System.out.println(rank + "등  " + name[i]+ "   " + score[i] + "   ");
			rank++;
		}
		System.out.println("-----------------------");
	}

}
// 실행 결과
/*
-----------------------
1등  최혜인   95
2등  임하성   90
3등  정현욱   85
4등  정한울   80
5등  채다선   75
-----------------------
계속하려면 아무 키나 누르십시오 . . .
*/

		

		
	











	