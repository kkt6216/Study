
import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class recomend
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int card;
		int category;

		int x;
		int m=1;

		System.out.println(" =========================================== ");
		System.out.println("�� ��õ ������ ī���� ������ ������ �ּ���. �� ");
		System.out.println("��  �ſ�ī�� (1) / üũī�� (2)             ��" );
		System.out.println(" =========================================== ");
		System.out.print(" ==>> ");
		card = Integer.parseInt(br.readLine());


while (m==1)
{

		if (card == 1)
		{
			

			System.out.println(" =========================================== ");
			System.out.println("�� �ֿ� ���� ī�װ� ��ȣ�� ������ �ּ���.��");
			System.out.println("��                                         ��");
			System.out.println("�� 1. ���ࡤ����                           ��");
			System.out.println("�� 2. ��Ʈ������                           ��");
			System.out.println("�� 3. ������������                         ��");
			System.out.println("�� 4. ��š�����                           ��");
			System.out.println("�� 5. ��ȭ����ȭ                           ��");
			System.out.println(" =========================================== ");
			System.out.print(" ==>> ");
			category = Integer.parseInt(br.readLine());

		


		if (category == 1)
		{

			System.out.println();
			System.out.println("     <���ࡤ������ �����ϼ̽��ϴ�.>");
			System.out.println("\n �� 1�� ī�� ����                                     �� 2�� ī�� ����   ");                                      
			System.out.println(" ===========================================        ==========================================="); 
			System.out.println("��                                         ��      ��                                         ��");
			System.out.println("�� - ���ࡤ���� ������ ������            ��      �� - ������ ȣ�� �� �ܵ� 5~10% ����        ��");
			System.out.println("�� -������ 5%, ������ 7% �߱� ������ ��    ��      �� - ���ֵ� ����ī 24H ���� ����           �� ");
			System.out.println("��  (Ƚ������ ����) �Ե�����ī 35% �������Ρ�      ��  - �ؿ� ��Ű�� ���� ����                ��");
			System.out.println("�� -�Ե�����ī 35% ��������                ��      ��  - ���� ������ (�︪��, ���� ��) 5%���� ��");
			System.out.println(" ===========================================        ===========================================");
			System.out.println();
			System.out.println(" ===========================================");
			System.out.println("�׿��Ͻô� �޴���ȣ�� �������ּ���.        ��");      
			System.out.println("��(1.ī��߱�) (2.ī�װ�) (3.���θ޴�)   ��");
			System.out.println(" ===========================================");
			System.out.print(" ==>> ");
			x = Integer.parseInt(br.readLine());

			if (x==1)
			{

				return;
			}
			else if (x ==2)
			{
				
			}
			else if (x == 3)
			{

			}


		}
		else if (category == 2)
		{
			System.out.println();
			System.out.println("     <��Ʈ�������� �����ϼ̽��ϴ�.>");
			System.out.println("\n �� 1�� ����                                       �� 2�� ����   ");                                      
			System.out.println(" ===========================================        ==========================================="); 
			System.out.println("��                                         ��      ��                                         ��");
			System.out.println("�� - ���ࡤ���� ������ ������            ��      �� - ������ ȣ�� �� �ܵ� 5~10% ����        ��");
			System.out.println("�� -������ 5%, ������ 7% �߱� ������ ��    ��      �� - ���ֵ� ����ī 24H ���� ����           �� ");
			System.out.println("��  (Ƚ������ ����) �Ե�����ī 35% �������Ρ�      ��  - �ؿ� ��Ű�� ���� ����                ��");
			System.out.println("�� -�Ե�����ī 35% ��������                ��      ��  - ���� ������ (�︪��, ���� ��) 5%���� ��");
			System.out.println(" ===========================================        ===========================================");
		
		}

		}
		
	



}



	}
}