/*=========================================
  ���� �ڹ��� ���� �� Ư¡ ����
  - ������ �ڷ���
  - �ڹ� �⺻ ����� : BufferedReafer Ŭ����
  =========================================*/

  // ����ڷκ��� �̸� , ��������, ��������, ���������� �Է¹޾�
  // �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

  // ���� ��)
  // �̸��� �Է��ϼ���: �����
  // ���� ���� �Է�: 90
  // ���� ���� �Է�: 80
  // ���� ���� �Է�: 70

  //===[���]===
  //�̸� : �����
  //���� : 240
  // ����Ϸ��� �ƹ�Ű�� ��������...

/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args)  throws IOException
	{
	
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	String a;  // �̸�
	int b;	// ��������
	int c;	// ��������
	int d;	// ��������
	int e;  // ����

	System.out.printf(" �̸��� �Է��ϼ��� : ");
	a = (br.readLine());

	System.out.print(" ���� ���� �Է� : ");
	b = Integer.parseInt(br.readLine());

	System.out.print(" ���� ���� �Է� : ");
	c = Integer.parseInt(br.readLine());

	System.out.print(" ���� ���� �Է� : ");
	d = Integer.parseInt(br.readLine());

	e = b + c + d;

	System.out.println("===[���]===");
	System.out.printf("�̸� : %s\n" , a );
	System.out.printf("���� : %d\n", e );

	}
}
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args)  throws IOException
	{
		
		// �ֿ� ���� ����

		// BufferedReader �ν��Ͻ� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strName;		// �̸� ����
		int nKor, nEng, nMat;	// ���� ,���� , ���� ����
		int nTot;				// ���� ����
		String strTemp;			// ���ڿ� �ӽ� ���� ����
		

		// ���� �� ó��
		//- ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� :");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();
		
		
		//- ����ڿ��� �ȳ� �޼��� ���(�������� �Է¾ȳ�)
		System.out.print("���� ���� �Է� :");

		//- ����ڰ� �Է��� ��(�ܺε�����)�� ������ ��Ƴ���
		strTemp = br.readLine();

		// - ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ �ٽ� ���
	    nKor = Integer.parseInt(strTemp);

		// - ����ڿ��� �ȳ��޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� :");

		// -  ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		// ��Ƴ� �����͸� ��ȯ�� �� �ʿ��� ������ ��Ƴ���
		nEng = Integer.parseInt(strTemp);

		// - ����ڿ��� �ȳ��޼��� ���(�������� �Է� �ȳ�)
		System.out.print("���� ���� �Է� :");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();

		// - ��Ƴ� �����͸� ��ȯ �� �� �ʿ��� ������ �ٽ� ���
		nMat = Integer.parseInt(strTemp);

		// - �� ���� ������ ����ִ� �����͸� (����ڰ� �Է��� ������)����
		// �����Ͽ� ������ �����ϰ� �� ����� ������ ��Ƴ���
		nTot = nKor + nEng + nMat;
		




		// ��� ���
		System.out.println("\n===[���]==");
		//System.out.println("�̸� :" = strName);
		System.out.printf("�̸� : %s\n", strName);
		//System.out.println9"���� :" + nTot);
		System.out.printf("���� : %d\n", nTot);
	}
}

/*
�̸��� �Է��ϼ��� :�����
���� ���� �Է� :90
���� ���� �Է� :80
���� ���� �Է� :70

===[���]==
�̸� : �����
���� : 240
*/