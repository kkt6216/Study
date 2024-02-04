
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
		System.out.println("§ 추천 받으실 카드의 종류를 선택해 주세요. § ");
		System.out.println("§  신용카드 (1) / 체크카드 (2)             §" );
		System.out.println(" =========================================== ");
		System.out.print(" ==>> ");
		card = Integer.parseInt(br.readLine());


while (m==1)
{

		if (card == 1)
		{
			

			System.out.println(" =========================================== ");
			System.out.println("§ 주요 혜택 카테고리 번호를 선택해 주세요.§");
			System.out.println("§                                         §");
			System.out.println("§ 1. 여행·숙박                           §");
			System.out.println("§ 2. 마트·쇼핑                           §");
			System.out.println("§ 3. 레저·스포츠                         §");
			System.out.println("§ 4. 통신·교통                           §");
			System.out.println("§ 5. 영화·문화                           §");
			System.out.println(" =========================================== ");
			System.out.print(" ==>> ");
			category = Integer.parseInt(br.readLine());

		


		if (category == 1)
		{

			System.out.println();
			System.out.println("     <여행·숙박을 선택하셨습니다.>");
			System.out.println("\n ○ 1번 카드 혜택                                     ○ 2번 카드 혜택   ");                                      
			System.out.println(" ===========================================        ==========================================="); 
			System.out.println("§                                         §      §                                         §");
			System.out.println("§ - 여행·숙박 혜택의 상세정보            §      § - 국내외 호텔 및 콘도 5~10% 할인        §");
			System.out.println("§ -국내선 5%, 국제선 7% 발권 수수료 할    §      § - 제주도 렌터카 24H 무료 제공           § ");
			System.out.println("§  (횟수제한 없음) 롯데렌터카 35% 현장할인§      §  - 해외 패키지 여행 할인                §");
			System.out.println("§ -롯데렌터카 35% 현장할인                §      §  - 국내 섬여행 (울릉도, 독도 등) 5%할인 §");
			System.out.println(" ===========================================        ===========================================");
			System.out.println();
			System.out.println(" ===========================================");
			System.out.println("§원하시는 메뉴번호를 선택해주세요.        §");      
			System.out.println("§(1.카드발급) (2.카테고리) (3.메인메뉴)   §");
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
			System.out.println("     <마트·쇼핑을 선택하셨습니다.>");
			System.out.println("\n ○ 1번 혜택                                       ○ 2번 혜택   ");                                      
			System.out.println(" ===========================================        ==========================================="); 
			System.out.println("§                                         §      §                                         §");
			System.out.println("§ - 여행·숙박 혜택의 상세정보            §      § - 국내외 호텔 및 콘도 5~10% 할인        §");
			System.out.println("§ -국내선 5%, 국제선 7% 발권 수수료 할    §      § - 제주도 렌터카 24H 무료 제공           § ");
			System.out.println("§  (횟수제한 없음) 롯데렌터카 35% 현장할인§      §  - 해외 패키지 여행 할인                §");
			System.out.println("§ -롯데렌터카 35% 현장할인                §      §  - 국내 섬여행 (울릉도, 독도 등) 5%할인 §");
			System.out.println(" ===========================================        ===========================================");
		
		}

		}
		
	



}



	}
}