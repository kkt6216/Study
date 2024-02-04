/*================================
  ���� �÷���(Collection) ����
==================================*/

/*
�� List
   - ������ ����, �迭�� ����, �ߺ��� ���
   - �ֿ� ���� Ŭ����
     �� Vctor (����ȭ ����)
	 �� ArrayList (����ȭ ���� ����)
	 �� LinkedList (ü��, ��ũ, ����, ť)
*/

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;


public class Test166
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("����");
		list.add("�λ�");
		list.add("��õ");
		list.add("�뱸");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		
		// Ȯ�� �� ���� Ȯ��
		//System.out.println(list);
		//--==>> [����, �λ�, ��õ, �뱸, ����, ����, ���, ����]

		System.out.println("��ü ���� : " + list.size());
		//--==>> ��ü ���� : 8

		// ù ��° ��Ҹ� ���
		System.out.println("ù ��° ��� : " + list.get(0));
		//--==>> ù ��° ��� : ����

		// ������ ��Ҹ� ���
		System.out.println("������ ��� : " + list.get(list.size()-1));
		//--==>> ������ ��� : ����

		// ó�� ��ġ�� "�ѱ�" �߰�
		list.add(0, "�ѱ�");

		// ���� Ȯ��
		// System.out.println(list);
		//--==>> [�ѱ�, ����, �λ�, ��õ, �뱸, ����, ����, ���, ����]

		// ó�� ��ġ�� ������(���)�� "���ѹα�"���� ����
		list.set(0, "���ѹα�");

		// ���� Ȯ��
		//System.out.println(list);
		//--==>> [���ѹα�, ����, �λ�, ��õ, �뱸, ����, ����, ���, ����]

		// "����"  ���翩�� Ȯ��
		if (list.contains("����"))
		{
			System.out.println("������ �����մϴ�. ");
		}
		//--==>>  ������ �����մϴ�.

		// "����" �� �� ��° �ε����� ��ġ�ϴ��� Ȯ��
		int n = list.indexOf("����");
		System.out.println("������ ��ġ : " + n);
		//--==>> ������ ��ġ : 1

		//"���ѹα�" ����� �� ��� ����
		list.remove("���ѹα�");			// (��)
		//list.remove(0);				// (��)
		
		// ���� Ȯ��
		System.out.println(list);
		//--==>> [����, �λ�, ��õ, �뱸, ����, ����, ���, ����]


		// list �� ��ü ��� ���
		System.out.println("\n��ü ���... ��");
		ListIterator<String> li = list.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " " );
		}
		System.out.println();


		System.out.println("\n��ü ���... ��");
		for (int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(i) + " " );
		}
		System.out.println();


		System.out.println("\n��ü ���... ��");
		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();


		
		System.out.println("\n���� ���... ��");
		while (li.hasPrevious())
		{
			String s = li.previous();
			System.out.print(s + " ");
		}
		System.out.println();

		
		System.out.println("\n���� ���... ��");
		for (int idx =list.size()-1; idx>=0; idx--)
		{
			System.out.print(list.get(idx) + " " );
		}
		System.out.println();



		

		

		

		

	}
}