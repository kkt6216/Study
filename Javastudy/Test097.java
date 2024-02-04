/*====================
  ���� �迭 ����
  - �迭�� ����
======================*/

// Test097.java ���ϰ� ��~!!!

// �� �ڹٿ��� �迭 ������ ���翡�� ������ ����, �ּҰ� ���� �� ���� ���°� �����Ѵ�.

//	  �ּҰ� ���� �� ���� ����
//	  ������ �����ϸ� ���纻�� ������ ��ġ�� �Ǵ� ���� ���
//	  (�ڹ��� �迭 �� �ƴ϶� ��� ������ �����Ϳ� �ش��ϴ� ���� ���)

//	  ������ ���� �� ���� ����
//	  ���� ��ҷ� ����ִ� ���� ���� �����
//	  ������ �����ص� ���纻�� ������ ��ġ�� �ʴ� ���� ���

// ������ ����
// - int �� �迭�� ���� ���� ���縦 ó���ϴ� 
//	 �޼ҵ带 �����ϴ� ���·� �ǽ� ����

public class Test097
{
	public static void main(String[] args)
	{
		int[] nums = {10, 20, 30, 40, 50};		//-- �迭 ����

		int[] copys1 = nums;					//-- ���� �ǹ��� �迭 ���� ����
												//   (�ּҰ� ����)

		int[] copys2 = copyArray(nums);			//-- ���� �ǹ��� �迭 ���� ����
												//	 (����� ���� �޼ҵ� ȣ�� �� ������ ����)

		int[] copys3 = (int[])nums.clone();		//-- ���� �ǹ��� �迭 ���� ����
												//   (�ڹ� ���� �� clone() �޼ҵ�)

		// ���� �迭(nums) ����� ���� �߻�~!!!
		nums[1] = 2345;

		// ��� Ȯ��
		for (int i=0; i<nums.length; i++)
		{	
			System.out.printf("%5d",nums[i]);
		}
		System.out.println();
		//--==>>  10 2345   30   40   50


		for (int i=0; i<copys1.length; i++)
		{	
			System.out.printf("%5d",copys1[i]);
		}
		System.out.println();
		//--==>> 10 2345   30   40   50

		for (int i=0; i<copys2.length; i++)
		{	
			System.out.printf("%5d",copys2[i]);
		}
		System.out.println();
		//--==>>  10   20   30   40   50

		for (int i=0; i<copys3.length; i++)
		{	
			System.out.printf("%5d",copys3[i]);
		}
		System.out.println();
		//--==>>   10   20   30   40   50

	}
	
	// �Ű������� int �迭 Ÿ���� �Ѱܹ޾�
	// �� �迭�� ������ ��
	// ������ �迭�� ��ȯ�ϴ� ����� ���� �޼ҵ� ����
	public static int[] copyArray(int[] os)
	{
		// �Ű������� �Ѱܹ��� �迭(os)
		// ��, ���� �迭��ŭ�� �迭��(�޸� ����)�� Ȯ����
		// ������ �迭 ����
		//int[] result;
		int[] result = new int[os.length];

		// ���� �迭(os)�� ����ִ� ������ ��ҵ��� ���� �迭(result)�� ��Ƴ���
		//result =os;  //-- (x)
		for (int i=0; i<result.length; i++)
		{
			result[i] = os[i];
		}

		// ������ �迭(result) ��ȯ
		return result;


	}
}