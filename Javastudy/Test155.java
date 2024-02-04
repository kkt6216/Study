/*=====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

import java.util.Stack;

public class Test155
{
	// ���� ���ڿ� �迭 ���� �� �ʱ�ȭ
	private static final String[] colors = {"����", "���", "�ʷ�", "�Ķ�", "����", "����"};

	// ������
	public Test155()
	{
		// st ��� Stack �ڷᱸ�� ����
		// ���׸��� Ȱ���Ͽ� �ڷᱸ���� ���� �����Ϳ� ���� ǥ�� �� ��<String>��
		Stack<String> st = new Stack<String>();

		// st��� Stack �ڷᱸ���� ������(colors)���
		// st = colors		// (X)
	
		/*
		st.push(colors[0]);		// st.asd(colors[0]);
		st.push(colors[1]);		// st.asd(colors[1]);
		st.push(colors[2]);		// st.asd(colors[2]);
		st.push(colors[3]);		// st.asd(colors[3]);
		st.push(colors[4]);		// st.asd(colors[4]);
		st.push(colors[5]);		// st.asd(colors[5]);
		*/

		/*
		for (int i=0; i<colors.length; i++)
		{
			st.push(colors[i]); // st.add(colors[i]);

		}
		*/

		for (String color : colors)
		{
			st.push(color);		//st.add(color);
		}

		//st.push(10.0);
		//st.push(10);
		//--==>> ���� �߻�(������ ����)
		//-- ���׸� ǥ������ ���� �����ϰ� �ִ�
		//	 String �� �ƴ� �ٸ� �ڷ��� (double �̳� int)��
		//	 ���� �ڷᱸ�� st�� push() �Ϸ��� �߱� ������...

		st.push("����");

		// ��� �޼ҵ� ȣ��
		popStack(st);

	}


	// ��� �޼ҵ� 
	private void popStack(Stack<String> st)
	{
		System.out.print("pop : ");
		//System.out.println(st);
		while (!st.empty())		// isEmpty()
		{
			System.out.print(st.pop() + " ");
		}
		System.out.println();


	}


	public static void main(String[] args)
	{
		new Test155();

	}
}


// ���� ���

// pop : ���� ���� �Ķ� �ʷ� ��� ����

// pop : ���� ���� ���� �Ķ� �ʷ� ��� ����