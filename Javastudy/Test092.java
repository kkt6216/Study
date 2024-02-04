/*=========================
  ■■■ 배열 ■■■
  - 배열의 배열
===========================*/

// ○ 과제
// 배열의 배열(다차원 배열)을 활용하여
// 다음과 같은 데이터를 요소로 취하는 배열을 구성하고
// 그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T  
  U  V  W  X  Y
 	
 계속하려면 아무 키나 누르세요...
*/

public class Test092
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 + 메모리 할당
		char[][] arr = new char[5][5];

		// 변수 선언 및 초기화
		//-- 문자 'A'로 시작하는 변수 선언 및 초기화 
		char n='A';												// 65								

		// 배열의 배열을 반복문의 중첩 구문을 활용하여 구조화
		//-- 바깥쪽 반복문: 배열의 행을 나타냄
		//-- i가 0부터 시작하여 4까지 총 5번 반복 
		for (int i=0; i<arr.length; i++)						//-- 웅~ → outer → 0		1		2		3		4
		{
			// 안쪽 반복문: 배열의 열을 나타냄 
			// j가 0부터 시작하여 4까지 총 5번 반복
			for (int j=0; j<arr[i].length; j++)					//-- 쑝쑝쑝~ → inner → 01234	01234	01234	01234	01234
			{
				arr[i][j] = n;									//-- 현재 요소에 n 을 할당				
				n++;											//-- n 을 1만큼 증가 시키고 업데이트  
			}													// 'A' → 65 부터 시작하므로 두 번째 요소는 'B' → 66 ... 
		}

		// 배열 전체 요소 출력
		for (int i = 0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)	
				System.out.printf("%3c", arr[i][j]);
			
			System.out.println();
		}
			
	}

}

// 실행 결과
/*
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
계속하려면 아무 키나 누르십시오 . . .
*/