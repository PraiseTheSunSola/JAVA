package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		

		Game[] FromSoftware = new Game[7];
		
		FromSoftware[0] = new Game("킹스필드", "1인칭 액션rpg", "PS1");
		FromSoftware[1] = new Game("데몬즈소울", "3인칭 액션rpg, 소울류", "PS3");
		FromSoftware[2] = new Game("다크소울1", "3인칭 액션rpg, 소울류", "PS3,PS4,PS5,XBOX360,PC");
		FromSoftware[3] = new Game("다크소울3", "3인칭 액션rpg, 소울류", "PS4,PS5,XBOX, PC");
		FromSoftware[4] = new Game("세키로", "3인칭 액션 어드벤처", "PS4,PS5,XOBX1,PC");
		FromSoftware[5] = new Game("블러드본", "3인칭 액션rpg, 소울류", "PS4,PS5");
		FromSoftware[6] = new Game("엘든링", "3인칭 액션rpg, 소울류", "PS4,PS5,XOBX,PC");
		
		
		for( Game from : FromSoftware) {
			System.out.println(from);
		}
		
	} // end main

} // end ObjectArray2

// 7개의 게임정보를 가진 객체를 생성하고 출력하세요. 