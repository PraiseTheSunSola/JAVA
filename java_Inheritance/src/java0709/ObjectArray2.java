package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		

		Game[] FromSoftware = new Game[7];
		
		FromSoftware[0] = new Game("ŷ���ʵ�", "1��Ī �׼�rpg", "PS1");
		FromSoftware[1] = new Game("������ҿ�", "3��Ī �׼�rpg, �ҿ��", "PS3");
		FromSoftware[2] = new Game("��ũ�ҿ�1", "3��Ī �׼�rpg, �ҿ��", "PS3,PS4,PS5,XBOX360,PC");
		FromSoftware[3] = new Game("��ũ�ҿ�3", "3��Ī �׼�rpg, �ҿ��", "PS4,PS5,XBOX, PC");
		FromSoftware[4] = new Game("��Ű��", "3��Ī �׼� ��庥ó", "PS4,PS5,XOBX1,PC");
		FromSoftware[5] = new Game("���庻", "3��Ī �׼�rpg, �ҿ��", "PS4,PS5");
		FromSoftware[6] = new Game("���縵", "3��Ī �׼�rpg, �ҿ��", "PS4,PS5,XOBX,PC");
		
		
		for( Game from : FromSoftware) {
			System.out.println(from);
		}
		
	} // end main

} // end ObjectArray2

// 7���� ���������� ���� ��ü�� �����ϰ� ����ϼ���. 