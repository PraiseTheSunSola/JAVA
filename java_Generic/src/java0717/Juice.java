package java0717;

public class Juice {

	public void makeJuice(FruitBox <? extends Fruit> box) {
		
	}
	
	
	/*
	 	�Ʒ��� ����  ���� FruitBox�� ����ϰ� �ֱ� �����ε��� �� �� ����.

	 
	 	public void makeJuice(FruitBox <Apple> box) {
		
	}
	
	public void makeJuice(FruitBox <Banana> box) {
		
	}
	
		 	FruitBox		box�� <Apple>�� ����� ����. 
	 	box�� FruitBox Ÿ���̱� ������ 
	 	makeJuice(FruitBox <Fruit> box)  �ص� �����ε��� ���� �ʴ´�.
	
	
	
		public void makeJuice(FruitBox <Fruit> box) {
		
	}
	
	public void makeJuice(FruitBox <Fruit> box) {
		
	}
	
	���� Juice Ŭ������ ���׸��� ����ϰ� ���� ������, 
	���׸��� ������� FruitBox <Fruit> box���� ������� �ʴ´�. 
	
	�׷��� Juice Ŭ�������� ���׸��� �ѹ� �� ����ؾ��Ѵ�. 
	
	public void makeJuice(FruitBox <T extends Fruit> box) {
		
	}
	
	�ٸ� �޼��忡�� �ٷ� ���� �ڵ�ó���� Ÿ�� ǥ���� ���� �ʴ´�. 
	�׷��� <T extends Fruit> => <?>���� ���ָ� ������ �ȴ�. 
	
	<?> = ���ϵ� ī�����Ѵ�.  �޼����ʿ� ����ϴ� ǥ�����̴�. 
	
	�ٸ� ���ϸ� ������ ���� extends Fruit ��� ������ �ɾ����� 
	
	<?> ���� ���� ǥ�ø� ������Ѵ�. 
	
	=> FruitBox <? extends Fruit> �̷���. 
	
	������ ������ �ڵ� �󿡴� ���������� Ÿ�� ������ �޸� ������ ���߿�
	 ���� �� �ִ�. 
	
	 */
	
	
}	// end Juice
