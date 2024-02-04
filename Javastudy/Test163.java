/*================================
  ���� �÷���(Collection) ����
==================================*/

// Test163 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 1

1��° ��� �Է� : ������
1��° ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : y

2��° ��� �Է� : ä�ټ�
2��° ��� �Է� ����~!!!
��� �Է� ���(Y/N)? : n

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 2

[���� ��ü ���]
������
ä�ټ�
���� ��ü ��� �Ϸ�~!!!

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 3

�˻��� ��� �Է� : ä�ټ�

[�˻� ��� ���]
�׸��� �����մϴ�.

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 3

�˻��� ��� �Է� : ������

[�˻� ��� ���]
�׸��� �������� �ʽ��ϴ�.

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 4

������ ��� �Է� : ���ѿ�

[���� ��� ���]
�׸��� �������� �ʾ� ������ �� �����ϴ�.

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 4

������ ��� �Է� : ������

[���� ��� ���]
������ �׸��� �����Ǿ����ϴ�.

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 5

������ ��� �Է� : ���ϼ�

[���� ��� ���]
������ ����� �������� �ʽ��ϴ�.

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 5

������ ��� �Է� : ä�ټ�
������ ���� �Է� : ������

[���� ��� ���]
������ �Ϸ�Ǿ����ϴ�.

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 2

[���� ��ü ���]
������
���� ��ü ��� �Ϸ�~!!!

    [ �޴� ���� ]===========
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
    ========================
>> �޴� ����(1~6) : 6

���α׷� ����~!!!
����Ϸ��� �ƹ� Ű�� ��������...


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Vector;
import java.util.Enumeration;


class Menus		// �� �ϼ�
{
	public static final int E_ADD = 1;		//-- ����߰�
	public static final int E_DISP = 2;		//-- ��� ���
	public static final int E_FIND = 3;		//-- ��� �˻�
	public static final int E_DEL = 4;		//-- ��� ����
	public static final int E_CHA = 5;		//-- ��� ����
	public static final int E_EXIT = 6;		//-- ����
}




public class Test163
{
	// �ֿ� �Ӽ� ���� �� �Ϸ�
	private static final Vector<Object> vt; //-- �ڷᱸ��
	private static BufferedReader br;		//-- �Է½� Ȱ��
	private static Integer sel;				//-- ���� ��
	private static String con;				//-- ��� ���� ����
	
	// static �ʱ�ȭ �� �� �Ϸ�
	static
	{
		//Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader ��ü ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";

	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		// ����ڿ��� �ȳ��ϱ� ���� �޼������� ����ϴ� ���
		// �޴��� �����ϴ� ����� �޼ҵ�(menuSelect())�� ������ �����߱� ������
		// �� ���������� ������� ���ð��� �޾ƿ��� �ʾƵ� ������
		System.out.println("    [ �޴� ���� ]===========");
		System.out.println("    1. ��� �߰�");
		System.out.println("    2. ��� ���");
		System.out.println("    3. ��� �˻�");
		System.out.println("    4. ��� ����");
		System.out.println("    5. ��� ����");
		System.out.println("    6. ����");
		System.out.println("    ========================");
		System.out.print(">> �޴� ����(1~6) : ");
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		// ������ �޴��� ���� ��� �б��
		// menuRun() ���� ó���� �����̱� ������
		// �Է°��� �޾ƿ��� ��ɸ� ����
		sel = Integer.parseInt(br.readLine());

	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
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
		// Menus Ŭ������ Ȱ���Ͽ� ó��
		switch (sel)
		{
		case Menus.E_ADD: addElement(); break;
		case Menus.E_DISP: dispElement(); break;
		case Menus.E_FIND: findElement(); break;
		case Menus.E_DEL: delElement(); break;
		case Menus.E_CHA: chaElement(); break;
		case Menus.E_EXIT: exit(); break;
		default: System.out.println("\t�޴� ���� ����~!!!");
		}
*/
	}

	// �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		br = new BufferedReader(new InputStreamReader(System.in));

		String name; 
		

		
		do
		{
			System.out.println();
			System.out.printf("%d��° ��� �Է� : ", vt.size()+1);
			name = br.readLine();
			vt.add(name);
			System.out.printf("%d��° ��� �Է� ����~!!!\n", vt.size());

			System.out.print("��� �Է� ���(Y/N)? :");
			con = br.readLine();//.toUpperCase ����

		}
		while (con.equals("y") || con.equals("Y") );
		System.out.println();
	}

	// �ڷᱸ�� ��ü ��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println();
		System.out.println("[���� ��ü ���]    ");
		for (int i=0; i<vt.size(); i++)
		{
			System.out.println(vt.elementAt(i));
			
		}
		System.out.println("���� ��ü ��� �Ϸ�~!!!");
		System.out.println();

		/*
		for(Enumeration e = vt.name(); e.hasMoreElements();)
		{
			System.out.printf("\t%10s\n", e.nextElement());
		}
		System.out.println("���� ��ü ��� �Ϸ�~!!!");
		*/


	}

	//�ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		br = new BufferedReader( new InputStreamReader(System.in));

		String search;
		boolean find;

		
		System.out.print("\n�˻��� ��� �Է� :");
		search= br.readLine();
		find = vt.contains(search);

		System.out.println("\n[�˻� ��� ���]");
		if (find)
		{
			System.out.println("�׸��� �����մϴ�.");

			// �߰� Ȯ��
			int i = vt.indexOf(search);
			System.out.println("(" + search + " ��ġ : " + i + ")");
		}
		else
		{
			System.out.println("�׸��� �������� �ʽ��ϴ�. ");
		}
		System.out.println();
		

	}

	// �ڷᱸ�� �� ���� �޼ҵ�
	public static void  delElement() throws IOException
	{
		br = new BufferedReader( new InputStreamReader(System.in));

		String del;
		boolean result;
		
		System.out.print("\n������ ��� �Է�: ");
		del = br.readLine();
		result = vt.remove(del);

		System.out.println("\n[���� ��� ���]");
		if (result) 
		{
			System.out.println(del + " �׸��� �����Ǿ����ϴ�.");
		} 
		else 
		{
			 System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		}
		 System.out.println();


	}

	// �ڷᱸ�� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		br = new BufferedReader( new InputStreamReader(System.in));

		String change;
		String cor;
		int i;


		System.out.print("\n������ ��� �Է�: ");
		change = br.readLine();
		

		if (vt.contains(change))
		{
			System.out.print("������ ���� �Է� :");
			cor = br.readLine();
			i = vt.indexOf(change);

			vt.set(i,  cor);
			System.out.println("\n[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("\n[���� ��� ���]");
			System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}
		System.out.println();
		
		


	}

	// ���α׷� ���� �޼ҵ�
	public static void exit()
	{
		System.out.println("\n���α׷� ����~!!!");
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