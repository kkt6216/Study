/*=========================================
  ���� �ڹ��� ���� �� Ư¡ ����
  =========================================*/

 // ����
 // �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
 // �� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.

 // ���� ��)
 //�� �ﰢ�� ���� ���ϴ� ���α׷� ��
 // - �ﰢ���� �غ� �Է� : 5
 // - �ﰢ���� ���� �Է� : 3
 
 // >> �غ��� 5, ���̰� 3�� �ﰢ���� ���� : xxx
 // ����Ϸ��� �ƹ� Ű�� ��������...

 // �����ν� �� �м�
 // �ﰢ���� ���� =  �غ� * ���� / 2
 // ����ڷκ��� ������ �Է¹޾� ó�� �� BufferedReader Ȱ��
 // BufferedReader �� ���� �� ���?? �� �� ���?
 //                                  -----------


/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test013
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;  // �غ�
		int b;  // ����
		double c; // ����

		System.out.print(" - �ﰢ���� �غ� �Է�  : ");
        a = Integer.parseInt(br.readLine());

		System.out.print(" - �ﰢ���� ���� �Է�  : ");
        b = Integer.parseInt(br.readLine());

		c = a * b / 2.0 ;

		System.out.println(" �� �ﰢ�� ���� ���ϴ� ���α׷� �� ");
		System.out.printf(" �غ��� %d, ���̰� %d�� �ﰢ���� ����: : %.1f\n", a, b, c);



		}
}
*/

// �Բ� Ǯ�� �� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main (String[] args) throws IOException
	{
		//�ֿ� ���� ����

		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �غ�, ����
		int underLength, height;    // �غ� , ����
		double area;				// ����    check~!!1


		//���� �� ó��
		// �� ����ڿ��� �ȳ��޼��� ���
		System.out.println("�� �ﰢ�� ���� ���ϴ� ���α׷� ��");
		//System.out.println(" - �ﰢ���� �غ� �Է�  : ");
		System.out.print(" - �ﰢ���� �غ� �Է�  : ");
		
		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� ��
		// ���� underLength �� ��Ƴ���
		underLength = Integer.parseInt(br.readLine());
		
		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		System.out.print("- �ﰢ���� ���� �Է� :");

		// �� ����ڰ� �Է��� ������(���ڿ�)�� ���� ���·� ��ȯ�� ��
		//    ���� height �� ��Ƴ���
		height = Integer.parseInt(br.readLine());

		// �� �ﰢ���� ���̸� ���ϴ� ���� ó��
		//    �ﰢ���� ���� =  �غ� * ���� / 2
		area = underLength * height / 2;
		//	    ������        ������  ������
		//     ---------------------- ------
		//              ������         ������ �� ���� ��� ����
		//									     (��, ���� ���ϰ� �������� ����)
		area = underLength * height / 2.0;   // check~!!!
		//       ������      ������   �Ǽ��� �� �Ǽ� ��� ����
		
		// #�Ǽ� �ڷ����� ��������� ������ ����������
		//	�Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//	������ ��2���� �ƴ�, �Ǽ������� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		// �� ������ �Ǽ�������� ó���ȴ�.

		// area = (double)underLenght * height / 2; 
		// area = underLenght * (double)height / 2; 
		// area = (double)(underLenght * height) / 2; 
		// area = (double)(underLenght * height / 2);  -- (X) 
		
		// ��� ���
		System.out.println();		// ����
		//System.out.print();			//-- ���� �߻� ( ������ ����)

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.12f\n",underLength, height, area);
	}
}

// ������

/*

	



// ���� ���
/*
�ﰢ���� �غ� �Է�  : 5
�ﰢ���� ���� �Է�  : 3
 �� �ﰢ�� ���� ���ϴ� ���α׷� ��
 �غ��� 5, ���̰� 3�� �ﰢ���� ����: : 7.5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/