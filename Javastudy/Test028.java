/*==================================
  ■■■ 연산자(Operator) ■■■
  - 조건 연산자 == 삼항 연산자
  ==================================*/

  // 사용잘부터 임의의 정수를 입력받아
  // 입력받은 정수가 양수인지, 음수인지, 0인지 구분하여
  // 이 결과를 출력하는 프로그램을 구현한다.
  // 단, 입력 데이터는 BufferedReader 를 활용하고,
  // 조건연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

  // 실행 예)
  // 임의의 정수 입력 : -24
  // -24 → 음수
  // 계속하려면 아무 키나 누르세요...

  // 임의의 정수 입력 : 2597
  // 2597 → 양수
  // 계속하려면 아무 키나 누르세요...

  // 임의의 정수 입력 : 0
  // 0 → 영
  // 계속하려면 아무 키나 누르세요...

  // 힌트 : 조건연산자(삼항연산자) 중첩



  import java.io.BufferedReader;
  import java.io.InputStreamReader;
  import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 내가 풀이한 내용
		
		int n;
		String strResult;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		strResult = ( n > 0)? "양수" : ( n == 0) ? "영" : "음수" ;
		
		
		System.out.printf("%d → %s\n", n, strResult);
		

/*
		// 함께 풀이한 내용

		int n;
		String strResult;

		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br(readLine());

		/*
		n 이 0보다 크다 → true → n 은 양수
						→ false →	 n 이 0 보다 작다 → true → n 음수
													  → false → n 은 영
													  
		*/
/*
		//  () ? () : ();
		//  (n>0) ? ("양수") : (다시 확인);
		//						----------
		//				     (n < 0) ? ("음수":) : ("영");
		//   (n > 0) ? ("양수") :(( n < 0) ? ("음수":) : ("영"));

		//   n 이 5 일 경우...
		//   ( 5 > 0) ? ("양수") :(( n < 0) ? ("음수":) : ("영"));
        //   ( true ) ? ("양수") :(( n < 0) ? ("음수":) : ("영"));
		//    "양수";

		//   n 이 -5 일 경우...
		//   ( -5 > 0) ? ("양수") :(( n < 0) ? ("음수":) : ("영"));
        //   ( false ) ? ("양수") :(( n < 0) ? ("음수":) : ("영"));
		//   (( n < 0) ? ("음수":) : ("영"));
		//   (( -5 < 0) ? ("음수":) : ("영"));
		//   (( true) ? ("음수":) : ("영"));
		//    "음수";

		//   n 이 0 일 경우...
		//   ( 0 > 0) ? ("양수") :(( n < 0) ? ("음수":) : ("영"));
        //   ( false ) ? ("양수") :(( n < 0) ? ("음수":) : ("영"));
		//   (( n < 0) ? ("음수":) : ("영"));
		//   (( 0 < 0) ? ("음수":) : ("영"));
		//   (( false) ? ("음수":) : ("영"));
		//	  "영";


		strResult = (n > 0) ? ("양수") :(( n < 0) ? (("음수":) : ("영"));

		System.out.println(n + " →" + strResult);
		*/


	}
}