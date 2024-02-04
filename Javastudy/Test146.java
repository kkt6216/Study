/*================================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - 자바에서 기본적으로 제공하는 주요 클래스들
  - Random 클래스
=================================================*/

/*
○ java.util.Random 클래스는

   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도 난수를 제공하는 메소드이지만
   0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 형태의 난수를 만들어내기 위해서는 추가적인 연산을 여러 형태로 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.

*/

// 로또 번호 생성(난수 발생 프로그램)

// 프로그램이 실행되면...
// 기본적으로 로또 5게임을 수행하는 프로그램을 구현한다.

// 실행 예)
//   3 12 15 24 31 41
//   1 12 18 36 41 52
//   4  9 12 13 22 30
//   5 10 13 14 22 40 
//  22 31 36 40 43 44
// 계속하려면 아무 키나 누르세요...


import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int[] num;

	// 생성자
	Lotto()
	{
		num = new int[6];
	}

	public int[] getNum()
	{
		
		return num;

	}

	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{
		// Random 인스턴스 생성
		Random rd = new Random();
		int n ;
		int cnt = 0;


		jump:

		while (cnt < 6)				// cnt → 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;	// 0 ~ 44 → 『+1』 → 1 ~ 45
		
			for (int i=0; i<cnt; i++)
			{
				// num[i] 요소와 n 을 비교
				if (num[i] == n)
					continue jump;
			}

			num[cnt++] = n;
		}

		// 정렬 메소드 호출
		sorting();



		/*
		for (int i=0; i<6; i++)
		{
			num[i] = rd.nextInt(45)+1;
			
			for (int j=1; j<i  ;j++ )
			{
				if (num[i]==num[j])
				{
					i--;
				}
				
			}
			
		}
		sorting();
		*/


		
	}
	
	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
		
		


		/*
		for (int i = 0; i< num.length-1; i++)
		{
			for (int j=i+1; j<num.length; j++)
			{
				if (num[i] > num[j])
				{
					num[i] = num[i]^num[j];
					num[j] = num[j]^num[i];
					num[i] = num[i]^num[j];
				}
			}
		}
		*/

	}
}

public class Test146
{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		int[] arr = lotto.getNum();

		// 기본 5 게임
		for (int i=1; i<=5; i++)
		{
			// 로또 1게임 수행
			lotto.start();

			// 결과 출력
			for(int n : lotto.getNum())
			{
				System.out.printf("%3d", n);
			}
			System.out.println();


			lotto.getNum();



			/*
			for (int j=0 ; j<arr.length; j++)
			{
				System.out.printf("%3d", arr[j]);

				if (j==5)
					System.out.println();
		
			}
			*/
			
			
		}
		

	}
}


// 실행 결과
/*
 10 15 16 26 38 45
  7 10 11 15 25 29
  3 19 27 28 31 43
  2  5  7 25 30 35
  2  5 24 31 37 38
계속하려면 아무 키나 누르십시오 . . .
*/

/*
  5  7 16 23 41 43
 11 15 19 22 39 45
  8 11 17 25 35 36
  9 13 21 27 33 42
  1  2 11 21 28 40
계속하려면 아무 키나 누르십시오 . . .
*/

/*
 12 15 30 34 41 43
  5  6  9 17 22 39
  6 14 21 22 37 40
 23 28 29 30 32 42
  9 12 17 28 37 42
계속하려면 아무 키나 누르십시오 . . .
*/