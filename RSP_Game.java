import java.util.Random;
import java.util.Scanner;

public class RSP_Game {

	public static void main(String[] args) {

		int user_Win = 0;    //사용자가 이긴 초기화 값
		int user_draw = 0;   //사용자가 비긴 초기화 값
		int user_lose = 0;   //사용자가 진  초기화 값
		
		for (int i = 0; i < 99999999; i++) {

			// 사용자에게 가위, 바위, 보 입력받기
			System.out.println("가위(0), 바위(1), 보(2)를 입력해주세요.(종료시 q입력)");
			Scanner s = new Scanner(System.in);  
			
			String inputString = s.nextLine(); 
			
			//q 입력시 통계 출력 및 게임 종료
			if (inputString.equals("q")) {
				System.out.println("종료되었습니다.");
				System.out.println("사용자 승리" + user_Win);
				System.out.println("무승부" + user_draw);
				System.out.println("사용자 패배" + user_lose);
				break;  //반복문을 종료라는 뜻
			}

			int s_Number = Integer.parseInt(inputString); 

			// 컴퓨터에서 (0~2사이)랜덤으로 숫자 나오게 하기
			Random r = new Random();
			int random_Value = r.nextInt(3);
			System.out.println("컴퓨터 숫자"+random_Value); //컴퓨터 숫자

			// 조건 추가 - 0~2 사이의 수
			if (s_Number > 2 || s_Number < 0) {
				System.out.println("다시입력하세요(0~2사이)");
			}
			// 입력받은 숫자 s와 같을 경우 무승부 
			// 2,0
			if (s_Number == random_Value) {
				user_draw = user_draw + 1;
				System.out.println("무승부 입니다." + user_draw);
			}
			// 컴퓨터가 이긴 경우
			else if (s_Number == 2 && random_Value == 0) {
				user_lose = user_lose + 1;                   
				System.out.println("사용자 패배" + user_lose);
			} else if (s_Number == 0 && random_Value == 1) {
				user_lose = user_lose + 1;                  
				System.out.println("사용자 패배" + user_lose);
			} else if (s_Number == 1 && random_Value == 2) {
				user_lose = user_lose + 1;   
				System.out.println("사용자 패배" + user_lose);
			} else {
				user_Win = user_Win + 1;
				System.out.println("사용자 승리" + user_Win);
			} 
			
		}
	}
}

