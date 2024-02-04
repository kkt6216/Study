/*================================
  ■■■ 컬렉션(Collection) ■■■
==================================*/

// Test163 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 1

1번째 요소 입력 : 최혜인
1번째 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : y

2번째 요소 입력 : 채다선
2번째 요소 입력 성공~!!!
요소 입력 계속(Y/N)? : n

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 2

[벡터 전체 출력]
최혜인
채다선
벡터 전체 출력 완료~!!!

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 3

검색할 요소 입력 : 채다선

[검색 결과 출력]
항목이 존재합니다.

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 3

검색할 요소 입력 : 정현욱

[검색 결과 출력]
항목이 존재하지 않습니다.

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 4

삭제할 요소 입력 : 정한울

[삭제 결과 출력]
항목이 존재하지 않아 삭제할 수 없습니다.

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 4

삭제할 요소 입력 : 최혜인

[삭제 결과 출력]
최혜인 항목이 삭제되었습니다.

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 5

변경할 요소 입력 : 임하성

[변경 결과 출력]
변경할 대상이 존재하지 않습니다.

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 5

변경할 요소 입력 : 채다선
수정할 내용 입력 : 이주형

[변경 결과 출력]
변경이 완료되었습니다.

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 2

[벡터 전체 출력]
이주형
벡터 전체 출력 완료~!!!

    [ 메뉴 선택 ]===========
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
    ========================
>> 메뉴 선택(1~6) : 6

프로그램 종료~!!!
계속하려면 아무 키나 누르세요...


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Vector;
import java.util.Enumeration;


class Menus		// → 완성
{
	public static final int E_ADD = 1;		//-- 요소추가
	public static final int E_DISP = 2;		//-- 요소 출력
	public static final int E_FIND = 3;		//-- 요소 검색
	public static final int E_DEL = 4;		//-- 요소 삭제
	public static final int E_CHA = 5;		//-- 요소 변경
	public static final int E_EXIT = 6;		//-- 종료
}




public class Test163
{
	// 주요 속성 구성 → 완료
	private static final Vector<Object> vt; //-- 자료구조
	private static BufferedReader br;		//-- 입력시 활용
	private static Integer sel;				//-- 선택 값
	private static String con;				//-- 계속 진행 여부
	
	// static 초기화 블럭 → 완료
	static
	{
		//Vector 자료구조 생성
		vt = new Vector<Object>();

		// BufferedReader 객체 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";

	}

	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		// 사용자에게 안내하기 위한 메세지만을 출력하는 기능
		// 메뉴를 선택하는 기능의 메소드(menuSelect())를 별도로 정의했기 때문에
		// 이 과정에서는 사용자의 선택값을 받아오지 않아도 무방함
		System.out.println("    [ 메뉴 선택 ]===========");
		System.out.println("    1. 요소 추가");
		System.out.println("    2. 요소 출력");
		System.out.println("    3. 요소 검색");
		System.out.println("    4. 요소 삭제");
		System.out.println("    5. 요소 변경");
		System.out.println("    6. 종료");
		System.out.println("    ========================");
		System.out.print(">> 메뉴 선택(1~6) : ");
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		// 선택한 메뉴에 따른 기능 분기는
		// menuRun() 에서 처리할 예정이기 때문에
		// 입력값을 받아오는 기능만 정의
		sel = Integer.parseInt(br.readLine());

	}

	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
		
		if (sel == Menus.E_ADD)
		{
			addElement();
		
		}
		else if (sel == Menus.E_DISP )
		{
			dispElement();

		}
		else if (sel == Menus.E_FIND)
		{
			findElement();
		}
		else if (sel == Menus.E_DEL)
		{
			delElement();
		}
		else if (sel == Menus.E_CHA)
		{
			chaElement();
		}
		else if (sel == Menus.E_EXIT)
		{
			exit();

		}
		
/*
		// Menus 클래스를 활용하여 처리
		switch (sel)
		{
		case Menus.E_ADD: addElement(); break;
		case Menus.E_DISP: dispElement(); break;
		case Menus.E_FIND: findElement(); break;
		case Menus.E_DEL: delElement(); break;
		case Menus.E_CHA: chaElement(); break;
		case Menus.E_EXIT: exit(); break;
		default: System.out.println("\t메뉴 선택 오류~!!!");
		}
*/
	}

	// 자료구조에 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		br = new BufferedReader(new InputStreamReader(System.in));

		String name; 
		

		
		do
		{
			System.out.println();
			System.out.printf("%d번째 요소 입력 : ", vt.size()+1);
			name = br.readLine();
			vt.add(name);
			System.out.printf("%d번째 요소 입력 성공~!!!\n", vt.size());

			System.out.print("요소 입력 계속(Y/N)? :");
			con = br.readLine();//.toUpperCase 가능

		}
		while (con.equals("y") || con.equals("Y") );
		System.out.println();
	}

	// 자료구조 전체 요소 출력 메소드
	public static void dispElement()
	{
		System.out.println();
		System.out.println("[벡터 전체 출력]    ");
		for (int i=0; i<vt.size(); i++)
		{
			System.out.println(vt.elementAt(i));
			
		}
		System.out.println("벡터 전체 출력 완료~!!!");
		System.out.println();

		/*
		for(Enumeration e = vt.name(); e.hasMoreElements();)
		{
			System.out.printf("\t%10s\n", e.nextElement());
		}
		System.out.println("벡터 전체 출력 완료~!!!");
		*/


	}

	//자료구조 내 요소 검색 메소드
	public static void findElement() throws IOException
	{
		br = new BufferedReader( new InputStreamReader(System.in));

		String search;
		boolean find;

		
		System.out.print("\n검색할 요소 입력 :");
		search= br.readLine();
		find = vt.contains(search);

		System.out.println("\n[검색 결과 출력]");
		if (find)
		{
			System.out.println("항목이 존재합니다.");

			// 추가 확인
			int i = vt.indexOf(search);
			System.out.println("(" + search + " 위치 : " + i + ")");
		}
		else
		{
			System.out.println("항목이 존재하지 않습니다. ");
		}
		System.out.println();
		

	}

	// 자료구조 내 삭제 메소드
	public static void  delElement() throws IOException
	{
		br = new BufferedReader( new InputStreamReader(System.in));

		String del;
		boolean result;
		
		System.out.print("\n삭제할 요소 입력: ");
		del = br.readLine();
		result = vt.remove(del);

		System.out.println("\n[삭제 결과 출력]");
		if (result) 
		{
			System.out.println(del + " 항목이 삭제되었습니다.");
		} 
		else 
		{
			 System.out.println("항목이 존재하지 않아 삭제할 수 없습니다.");
		}
		 System.out.println();


	}

	// 자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		br = new BufferedReader( new InputStreamReader(System.in));

		String change;
		String cor;
		int i;


		System.out.print("\n변경할 요소 입력: ");
		change = br.readLine();
		

		if (vt.contains(change))
		{
			System.out.print("수정할 내용 입력 :");
			cor = br.readLine();
			i = vt.indexOf(change);

			vt.set(i,  cor);
			System.out.println("\n[변경 결과 출력]");
			System.out.println("변경이 완료되었습니다.");
		}
		else
		{
			System.out.println("\n[변경 결과 출력]");
			System.out.println("변경할 대상이 존재하지 않습니다.");
		}
		System.out.println();
		
		


	}

	// 프로그램 종료 메소드
	public static void exit()
	{
		System.out.println("\n프로그램 종료~!!!");
		System.exit(-1);
	}




	public static void main(String[] args)throws IOException, NumberFormatException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		

	}
}