/*=====================================================
  ���� ���� �帧�� ��Ʈ��(���) ���� 
=======================================================*/

// break �ǽ�

// ������ ���� ó���� �̷������ ���α׷��� �����Ѵ�.
// ��, �Է¹޴� ������ 1 ~ 100 ���� �ȿ�����
// �����ϵ��� ó���Ѵ�.

// ���� ��)
//
// ������ ���� �Է�: -10
//
// ������ ���� �Է� : 0
//
// ������ ���� �Է� : 2023
//
// ������ ���� �Է� : 10
// >> 1 ~ 10 ������ �� : 55
// ����Ͻðڽ��ϱ�(Y/N)? : y
//
// ������ ���� �Է� : 100
// >> 1 ~ 100 ������ �� : 5050
// ����Ͻðڽ��ϱ�?(Y/N): N
// ����Ϸ��� �ƹ� Ű�� ��������... �� ���α׷� ����

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test064
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// check~!!!
		// ������ ������ �ʱ�ȭ ��ġ ~!!!
		int n, s,i;
		
		//-- n : ��밡 �Է°��� ��Ƶ� ����
		//	 s : ������ ���� ����� ��Ƴ� ����
		//	 i : 1���� 1�� ������� �Է°����� �����ϰ� �� ����

		char ch;
		//-- ���μ����� ��� �������� ������ ���θ� ��Ƶ� ����


		while (true)
		{
			// ���� �ݺ�(���ѷ���)

		
			do
			{
				System.out.print("\n������ ���� �Է� : ");
				n = Integer.parseInt(br.readLine());
			}
			while (n<1 || n>100);

			// �׽�Ʈ(Ȯ��)
			//System.out.println("��ȿ�� ���� �Է� �Ϸ�~!!!!");
			
			// ������ ������ �ʱ�ȭ ��ġ check~!!!
			s = 0;

			for (i=1; i<=n; i++)
			{
				s += i;				//-- ������ ����
			}

			System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, s);

			System.out.print("����Ͻðڽ��ϱ�(Y/N) : ");		// y Y
			ch = (char)System.in.read();
			//-- ������� ������ ���� ���� (�ǻ�ǥ��)

			// �׸��ҷ� �� ��������
			//if (ch=='N' || ch =='n')	//-- N �Ǵ� n �Է��Ѱ� �¾�?
			//
			if (ch != 'Y' && ch != 'y')	//-- Y �Ǵ� y �Է��Ѱ� �ƴѰ� �¾�?
			{
				// �ݺ����� ���߰� �������� �� �ִ� �ڵ� �ۼ� �ʿ�
				//-- ��, ���� ���� �ǻ� ǥ���� �ߴٸ�
				//	 �׵��� �����ߴ� �ݺ����� ���߰� ���������� �Ѵ�.
				break;
				//-- �����. + (�׸��� ����������.) check~!!!

			}// end if

			// ���Ͱ�(\r\n)ó��
			System.in.skip(2);
			
		}//end while(true)

	}
}
		
		
		/*
		int n;
		int num;
		int sum;
		char a;
		

		do
		{
			System.out.print("������ ���� �Է� :");
			n =  Integer.parseInt(br.readLine());
			sum=0;

			if (n>=1 && n<=100)
			{
				for (num=0;num<=n; num++)
				{
				
					sum += num;
				}

				System.out.printf(">> 1 ~ %d ������ �� : %d\n", n, sum);
				

				System.out.print("����Ͻðڽ��ϱ�?(Y/N) :");
				a = (char)System.in.read();
				System.in.skip(2);


				if (a != 'Y' || a != 'y' )
				{
					break;
				}
			}
		}
		while (n >= 1 && n<= 100);
		*/
			
		



// ���� ���
/*

������ ���� �Է� : 10
>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�(Y/N) : y

������ ���� �Է� : 100
>> 1 ~ 100 ������ �� : 5050
����Ͻðڽ��ϱ�(Y/N) : y

������ ���� �Է� : 10
>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�(Y/N) : y

������ ���� �Է� : 10
>> 1 ~ 10 ������ �� : 55
����Ͻðڽ��ϱ�(Y/N) : n
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/