/*=========================================
  ■■■ 실행 흐름의 컨트롤(제어문) ■■■
  - if 문
  - if ~ else 문 실습
  =========================================*/

// 1. 프로그램을 작성할 때 주어진 조건에 따라
//	  분기 방향을 정하기 위해 사용하는 제어문에는
//	  if문, if ~ else문, 조건연산자, 복합if문(if문 중첩), switch문이 있다.

// 2. if문은 if 다음의 조건이 참(true)일 경우
//	  특정 문장을 수행하고자 할 때 사용되는 구문이다.

// ○ 과제
//	  사용자로부터 임의의 알파벳 한 문자를 입력받아
//	  결과를 출력하는 프로그램을 구현한다.
//	  단, 대소문자를 모두 적용할 수 있도록 처리한다.
//	  또한, 알파벳 이외의 문자가 입력되었을 경우
//	  입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 임의의 알파벳 한 문자 입력 : A ← 대문자 모음
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : e ← 소문자 모음
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : B ← 대문자 자음
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : c ← 소문자 자음
// 계속하려면 아무 키나 누르세요...

// 임의의 알파벳 한 문자 입력 : 1 ← 알파벳 아님
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...


import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038 
	{ 
    public static void main(String[] args) throws IOException
		{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char eng ,result;

		System.out.print("임의의 알파벳 한 문자 입력 : ");
		eng = (char)System.in.read();

		if (eng>='A'&& eng<='Z')
		{
			
		}
		if (eng == 'A' || eng == 'I' || eng == 'O' || eng == 'U' || eng =='E')
		{
			eng = "대문자 모음";
		}
		else
		{
			eng = "
		}
		else if (eng == 'a' || eng == 'i' || eng == 'o' || eng == 'u' || eng =='e')
		{
			eng = "소문자 모음";
		}
		else if ()
		{
		}


        

      
        }
	}