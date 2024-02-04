/*===================================
  ���� Ŭ������ �ν��Ͻ� ����
  - Ŭ������ �ν��Ͻ� Ȱ��
=====================================*/

// �л����� �̸�, ��������, ��������, ���������� �Է¹޾�
// ����, ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
// Ŭ���� ����� ������ ���̵���ο� ���� ������ �� �ֵ��� �Ѵ�.

// [���̵� ����]

// 2. Sungjuk Ŭ����
//	  - �ο� ���� �Է¹޾�,
//	  �Է¹��� �ο� �� ��ŭ �̸�, ��������, ��������, ���������� �Է¹ް�
//	  ������ ����� �����ϴ� Ŭ������ ������ ��~!!!
//	  ���Ӽ� : �ο���, Record Ÿ���� �迭
//	  ����� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���

import java.util.Scanner;
import java.io.IOException;

public class  Sungjuk
{
	Scanner sc = new Scanner(System.in);

	// �ֿ� �Ӽ� ����
	int inwon;		//--�ο���
	Record[] rec;	//-- Record �迭(�л� �� �� �� Record �迭 �� �� �� Ȱ��)
					//	 Record �� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭
	
	

	// �ֿ� ��� ����
	// �� �ο� �� �Է�
	public void set() 
	{
		Scanner sc = new Scanner(System.in);

		
		
		do
		{
			System.out.print("�ο� �� �Է�(1 ~ 100) : " );
			inwon = sc.nextInt();
		}
		while (inwon<1 || inwon>100);

		// check~!
		// Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		// �迭���� inwon ��ŭ ������ ���� ��
		// Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�~~!!
		rec = new Record[inwon];
		
	}
	
	// �� �� ������ �Է� + �� ���� �� ��� ����
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		String[] subTitle = {"���� ���� : ", "���� ���� : ", "���� ���� : "}; 

		// �ο� �� ��ŭ �ݺ� �� �ο� ���� ����Ͽ� ������� �迭�� ���̸�ŭ �ݺ�
		//for (int i=0; i<inwon; i++)
		for (int i=0; i<rec.length; i++)
		{
			// check~!!
			// Record Ŭ���� ����� �ν��Ͻ� ����
			//Record ob = new Record();
			//rec[i] = ob;
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �̸� �Է� :", (i+1));
			rec[i].name = sc.next();

			/*
			System.out.print("���� ���� : ");
			rec[i].score[0] = sc.nextInt();

			System.out.print("���� ���� : ");
			rec[i].score[1] = sc.nextInt();

			System.out.print("���� ���� : ");
			rec[i].score[2] = sc.nextInt();
			*/

			for (int j=0; j<subTitle.length; j++)
			{
				//�ȳ� �޼��� ���
				System.out.print(subTitle[j]);
				rec[i].score[j] = sc.nextInt();

				// ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
				// ������ ���� ���� ����
				rec[i].tot += rec[i].score[j];

			}

			// ��� �����ϱ�
			rec[i].avg = rec[i].tot / 3.0;


		}// end outer for

	}//end input()


	// �� ��� ���
	// ������ 90 80 70 240 xx.xx 2
	// ������ 92 82 72 xxx xx.xx 1
	// ����� 82 72 62 xxx xx.xx 3
	public void print()
	{
		// ���� ���� ���� �޼ҵ� ȣ��
		ranking();

		// ����
		System.out.println();

		// �л� �� �� �� �ݺ� ��� ���� ����
		//for (int i=0; i<inwon; i++)
		for (int i=0; i<rec.length; i++)
		{
			// �̸� ���
			System.out.printf("%5s", rec[i].name);

			// ����(����, ����, ���� ) �ݺ����
			for (int j=0; j<3; j++)
			{
				System.out.printf("%4d", rec[i].score[j]);
			}

			// ����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);

			// ���� ��� �߰�
			System.out.printf("%4d", rec[i].rank);

			// ����
			System.out.println();
		}
		
	}

	// + �� ���� ����
	//	  - ���� �������� ���꿡 �ʿ��� �����Ͱ� �̹� �����ϴ� ��Ȳ	�� �Ű����� �Ѱ��� �ʿ� ����
	//	  - Record �迭�� rank �Ӽ��� ������ ���� ��� ���� �� ��ȯ �ڷ��� void
	//	  - Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� �� �������� ������ private
	private void ranking()
	{
		// ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
		for (int i =0; i<inwon; i++)
			rec[i].rank = 1;

		// ��� ���� �� �Է� �ο��� 5���̶� �����ϸ�...
			for (int i=0; i<inwon-1; i++)				// �� �� �񱳱��� �� 0         1       2      3
			{
				for (int j=i+1; j<inwon; j++)			// �� �� �񱳴�� �� 1 2 3 4   2 3 4   3 4    4
				{
					if (rec[i].avg > rec[j].avg)		// �񱳱����� ����� �񱳴���� ��պ��� ũ�ٸ�
					{
						// �񱳴���� rank �� 1��ŭ ����
						rec[j].rank++;
						
					}
					else if (rec[j].avg > rec[i].avg)   // �񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ�
					{
						// �񱳱����� rank �� 1��ŭ ����
						rec[i].rank++;
					}		
				 }

			 }
			
	}
		
}



	
	
	/*
	Scanner sc = new Scanner(System.in);
	Record rc = new Record();
	int su;

	Record[] input()	throws IOException
	{	
		do
		{
			System.out.print("�ο� �� �Է�(1 ~ 100) : " );
			su = sc.nextInt();
		}
		while (su<1 || su>100);
		
		Record[] arr = new Record[su];
		
		
		for (int i=0; i<su; i++)
		{	
			arr[i] = new Record();
			
			System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
			arr[i].name = sc.next();

			System.out.print("���� ���� : ");
			arr[i].score[0] = sc.nextInt();

			System.out.print("���� ���� : ");
			arr[i].score[1] = sc.nextInt();

			System.out.print("���� ���� : ");
			arr[i].score[2] = sc.nextInt();

			arr[i].tot = arr[i].score[0] + arr[i].score[1] + arr[i].score[2];
			arr[i].avg = (arr[i].score[0] + arr[i].score[1] + arr[i].score[2]) / 3.0;
			System.out.println();
		

		}

		return arr;
	}

	



		



		void print(Record[] arr)
		{
			for (int i = 0; i<su; i++)
			{
			System.out.printf("%s %d %d %d %d %.2f\n",arr[i].name, arr[i].score[0], arr[i].score[1], arr[i].score[2], arr[i].tot, arr[i].avg);
			}
		}
}
*/