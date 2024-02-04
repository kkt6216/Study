/*=========================================
  ���� ���� �帧�� ��Ʈ��(���) ����
  - if ��
  - if ~ else �� �ǽ�
  =========================================*/

// 1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//	  �б� ������ ���ϱ� ���� ����ϴ� �������
//	  if��, if ~ else��, ���ǿ�����, ����if��(if�� ��ø), switch���� �ִ�.

// 2. if���� if ������ ������ ��(true)�� ���
//	  Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

// ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
// ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
// ����� ��� ������ �������� ó���Ѵ�.

// 90�� �̻�		   : A
// 80�� �̻� 90�� �̸� : B
// 70�� �̻� 80�� �̸� : C
// 60�� �̻� 70�� �̸� : D
// 60�� �̸�		   : F

// ��, BufferedReader �� Ȱ���� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
// printf() �޼ҵ带 ���� ����� �� �ֵ��� �Ѵ�.

// ���� ��)
// �̸� �Է� : �����
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70
//
// >> ����� �̸��� ������Դϴ�.
// >> ���� ������ 90,
// >> ���� ������ 80,
// >> ���� ������ 70,
// >> ������ 240�̰�, ����� 80.00�Դϴ�.
// >> ����� B �Դϴ�.
// ����Ϸ��� �ƹ� Ű�� ��������...


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test031
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		// 1. ����ڷκ��� �̸��� �Է¹޴´�.
		System.out.print("�̸� �Է� : ");
		String strName = br.readLine();
		
		// 2. ����ڷκ��� ����, ����, ���� ������ �Է¹޴´�.
		System.out.print("���� ���� :");
		String strKor = br.readLine();
		System.out.print("���� ���� :");
		String strEng = br.readLine();
		System.out.print("���� ���� :");
		String strMat = br.readLine();

		// 3. ���ڿ� ���·� �Է¹��� ���� ������ ���� ���·� ��ȯ�Ѵ�.
		int nKor = Integer.parseInt(strKor);
		int nEng = Integer.parseInt(strEng);
		int nMat = Integer.parseInt(strMat);

		// 4. ��� ������ ���� ������ ����� �����Ѵ�.
		int nTot = nKor + nEng + nMat;			//--����
		double fAvg = nTot / 3.0;				//--��� check~!!

		// 5. ��޿� ���� ���� �˻縦 �����Ѵ�.
		// char grade;
		char grade = 'F';								//-- ���
		
		if (fAvg >= 90)
		{
			grade = 'A';
		}
		// else if (fAvg >= 80 && fAvg <90)
		else if (fAvg >= 80)					//-- ����� 90�� �̸� ���� ����
		{
			grade = 'B';
		}
		else if (fAvg >= 70)					//-- ����� 80�� �̸� ���� ����
		{
			grade = 'C';
		}
		else if (fAvg >= 60)					//-- ����� 70�� �̸� ���� ����
		{
			grade = 'D';
		}
		else if (fAvg < 60)
		{
		//else
		//{
		//	grade = 'F';
		//}

		// 6. ���� ��� ���

		System.out.printf("\n>> ����� �̸��� %s�Դϴ�.\n", strName);
		System.out.printf(">> ���� ������ %s,\n", strKor);
		System.out.printf(">> ���� ������ %s,\n", strEng);
		System.out.printf(">> ���� ������ %s,\n", strMat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", nTot,fAvg);
		System.out.printf(">> ����� %c�Դϴ�.\n", grade);


		/*
		String name;
		int kor;
		int eng;
		int mat;
		int tot;
		double average;
		char grade;

		System.out.print("�̸� �Է� : ");
		name = (br.readLine());

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());


		tot = kor + eng + mat;
		average = (kor + eng + mat) / 3;

		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d,\n", kor);
		System.out.printf(">> ���� ������ %d,\n", eng);
		System.out.printf(">> ���� ������ %d,\n", mat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, average);

		if (average>= 90)
		{
			System.out.printf(">> ����� A �Դϴ�.\n");
		}
		else if (average>=80 && average<90 )
		{
			System.out.printf(">> ����� B �Դϴ�.\n");
		}
		else if (average>=70 && average<80 )
		{
			System.out.printf(">> ����� C �Դϴ�.\n");
		}
		else if (average>=60 && average<70 )
		{
			System.out.printf(">> ����� D �Դϴ�.\n");
		}
		else if (average< 60 )
		{
			System.out.printf(">> ����� F �Դϴ�.\n");
		}
		*/

	}	
}

// ������
/*
�̸� �Է� : �����
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� ������Դϴ�.
>> ���� ������ 90
>> ���� ������ 80
>> ���� ������ 70
>> ������ 240�̰�, ����� 80.00�Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/