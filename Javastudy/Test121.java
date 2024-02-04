/*=======================================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
=========================================*/

// ○ 실습 문제
//	  성적 처리 프로그램을 구현한다.
//    단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 11
// 인원 수 입력(1~10) : 0
// 인원 수 입력(1~10) : 2

// 1번째 학생의 학번 이름 입력 (공백 구분) : 2309123 김다슬
// 국어 영어 수학 점수 입력    (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력 (공백 구분) : 2309125 김동민
// 국어 영어 수학 점수 입력    (공백 구분) : 85 70 60

// 2309123 김다슬   90 100  85    xxx   xx.xx
//					수  수  수
// 2309125 김동민   85  70  60   xxx   xx.xx
//					우  미  양

// 계속하려면 아무 키나 누르세요...

// 90이상		  → 수
// 80이상 90 미만 → 우
// 70이상 80 미만 → 미
// 60이상 70 미만 → 양
// 60미만 (그 외) → 가

// 속성만 존재하는 클래스 → 자료형  활용

import java.util.Scanner;


class Record
{
	String hak, name;		//-- 학번, 이름
	int kor,  eng, mat;		//-- 국어, 영어, 수학 점수
	int tot;				//-- 총점
	double avg;				//-- 평균
}

// 인터페이스
interface Sungjuk
{
	public void set();		//-- 인원 세팅
	public void input();	//-- 데이터 입력
	public void print();	//-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	Scanner sc = new Scanner(System.in);

	private int inwon;
	private Record[] rec;
	
	@Override
	public void set() 
	{
		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>10);
		System.out.println();

		rec = new Record[inwon];
	}
	
	@Override
	public void input()
	{
		for (int i=0; i<inwon; i++)
		{
			rec[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력 (공백 구분) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력    (공백 구분) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3.0;
		}
		System.out.println();
	}

	 @Override
	 public void print()
	{
		 for (int i=0; i<rec.length; i++)
		 {
			 System.out.printf("%s %s %3d %3d %3d %4d %.2f\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			 System.out.printf("%17s %2s %2s\n", panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
		 }
		 System.out.println();
		

	}

	// 내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int score)
	{
		String result="";

		switch (score/10)
		{
		case 10:result="수"; break;
		case  9:result="수"; break;
		case  8:result="우"; break;
		case  7:result="미"; break;
		case  6:result="양"; break;
		case  5:result="가"; break;
		}
		return result;
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test121
{
	public static void main(String[] args)
	{
		Sungjuk ob;

		// 문제 해결 과정에서 작성해야 할 ob 구성 및 객체 생성
		ob = new SungjukImpl();
		
		ob.set();
		ob.input();
		ob.print();
	}
}

// 실행 결과
/*
// 실행 예)
// 인원 수 입력(1~10) : 11
// 인원 수 입력(1~10) : 0
// 인원 수 입력(1~10) : 2

// 1번째 학생의 학번 이름 입력 (공백 구분) : 2309123 김다슬
// 국어 영어 수학 점수 입력    (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력 (공백 구분) : 2309125 김동민
// 국어 영어 수학 점수 입력    (공백 구분) : 85 70 60

// 2309123 김다슬   90 100  85    xxx   xx.xx
//					수  수  수
// 2309125 김동민   85  70  60   xxx   xx.xx
//					우  미  양

// 계속하려면 아무 키나 누르세요...
*/