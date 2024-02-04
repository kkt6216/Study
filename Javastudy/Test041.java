/*=========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - switch �� �ǽ� 
  =========================================*/

// ����ڷκ��� 1 ���� 3 ������ ���� �� �ϳ��� �Է¹޾�
// �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
// ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

// �� switch ���� �Ϲ� ���� ����Ͽ� �����Ѵ�.
// �� switch ���� �⺻ ���� ����ϵ�,
//	  ��break���� �� �� ���� ����� �� �ֵ��� �����Ѵ�.

// ���� ��)
// ������ ���� �Է�(1~3) : 3
// �ڡڡ�
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է�(1~3) : 3
// ��
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է�(1~3) : 7
// �Է� ����~!!
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a ;
		String b;

		System.out.print("������ ���� �Է�(1~3) :");
		a = Integer.parseInt(br.readLine());
/*      
		// ��� �� 

		switch (a)
		{
			case 1: b ="��"; break;
			case 2: b ="�ڡ�"; break;
			case 3: b ="�ڡڡ�"; break;
			default : b = "�Է� ����~!!!"; //break;
		}

		
	    System.out.printf("%s\n", b); 
*/


		switch (a)
		{
			case 3: System.out.print("��");
			case 2: System.out.print("��");
			case 1: System.out.print("��");
						break;
			default : System.out.println("�Է� ����~!!!");
		}
		System.out. println();
	}
}


// ���� ���

/*
������ ���� �Է�(1~3) :1
��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

/*
������ ���� �Է�(1~3) :2
�ڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

/*
������ ���� �Է�(1~3) :3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է�(1~3) :4
�Է� ����~!!!

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/