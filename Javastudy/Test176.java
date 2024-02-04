/*======================================
  ���� �ڹ��� �⺻ �����(I/O) ����
  - Reader Writer  �ǽ�
======================================*/

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.io.IOException;


public class Test176
{
	public void process(InputStream is)		// ��Sysem.in�� ����~!!!
	{
		int data;
	
		System.out.println("���ڿ� �Է�(����:ctrl+z)");
		
		try
		{
			// �Ű����� is ��� ����Ʈ ��� ��Ʈ�� ��ü(InputStream)��
			// ���� ��Ʈ������ ��ȯ�Ͽ� (�� InputStreamReader) �� ���� ����)
			// Reader Ÿ���� rd ���� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is);
			//==>> ���� ��� �Է� ��Ʈ�� rd~!!!

			// ����Ʈ ��� ��Ʈ�� ��ü�� �ڹ� �⺻ ��� ��Ʈ��(System.out)��
			// ���� ��Ʈ������ ��ȯ�Ͽ�(�� OutStreamWriter �� ���� ����)
			// Writer Ÿ���� wt ���� ������ �� �ֵ��� ó��
			Writer wt = new OutputStreamWriter(System.out);
			//==>> ���� ��� ��� ��Ʈ�� wt~!!!

			// �о���̴� ��Ʈ�����κ��� �ϳ��� ����
			while ((data = rd.read())  != -1)
			{
				wt.write(data);		//-- �������� ��Ʈ��(���ٱ�)�� data �� �ϳ��� ���
				wt.flush();			//-- ����� ��Ʈ��(���ٱ�)�� �о�� ������
			}
			
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

	
	}


	public static void main(String[] args)
	{
		Test176 ob = new Test176();
		ob.process(System.in);
	}
}


// ���� ���
/*

���ڿ� �Է�(����:ctrl+z)
1234567
1234567
abcdefg
abcdefg
������ٸ��ٻ�
������ٸ��ٻ�
^Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/