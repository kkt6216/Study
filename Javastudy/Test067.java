/*=====================================
  ■■■ 메소드의 재귀 호출 ■■■ 
======================================*/

public class Test067
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	// showHi() 메소드의 코드 내에서 두 군데 위치 바꾸기

	public static void showHi(int cnt)
	{
		
		System.out.println("Hi~");
		if(cnt==1)
			return;
		showHi(cnt--);
		
		
	}
}