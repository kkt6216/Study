/*=====================================
  ���� �޼ҵ��� ��� ȣ�� ���� 
======================================*/

public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(3);
	}

	// showHi() �޼ҵ��� �ڵ� ������ �� ���� ��ġ �ٲٱ�

	public static void showHi(int cnt)
	{
		
		
		showHi(cnt--);
		if(cnt==1)
		System.out.println("Hi~");
		return;
	}
}