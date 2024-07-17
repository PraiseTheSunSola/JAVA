package java0717;

import java.util.ArrayList;

public class learning_Generic {

	public static void main(String[] args) {
		
		
		
		FruitBox <Apple> appleBox = new FruitBox<>();		
		appleBox.setFruit(new Apple());
		
		FruitBox <Banana> bananaBox = new FruitBox<>();
		bananaBox.setFruit(new Banana());
		
		FruitBox <Grape> GrapeBox = new FruitBox<>();
		GrapeBox.setFruit(new Grape());
		
		// �Ʒ� �ڵ�� ���׸��� ������� �ʾҴٸ� ��������ȯ�� �ؾ��Ѵ�. 
		// ���� ����ȯ�� ���������� ������带 ����Ű�� ������ �޸𸮰� �ⷷ�Ÿ� �� ����.
		
		Apple apple = (Apple)appleBox.getFruit();
		
		/*
		 
		 Toy�� ������ �ƴϹǷ� ������ �ƴϸ� ������ �� �ϰ� �ؾ��Ѵ�. 
		 ����� ����ϸ� �����ϴ�. 
		 fruit Ŭ������ ���� ���ϸ� ����� ����ϰ� 
		 FruitBox Ŭ������ ���׸� <T> �ȿ� => <T extends Fruit>
		�� �������ָ� ���ϵ鸸 ���� �� �ִ�.
		
		FruitBox<Toy> toyBox = new FruitBox<>();
		toyBox.setFruit(new Toy());
		
		*/
		
		// �Ʒ���  <Fruit>�� ���ü� �ִ°� �θ𿩼�
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		fruitBox.setFruit(new Apple() );
		
		Juice j = new Juice();
		j.makeJuice(appleBox);
		j.makeJuice(bananaBox);
		
		
		Fruit a =  new Apple();
	    			a =	new Banana();
	    			a = new Grape();
		
		/*
		A<String> a = new A<>();
		
		//	A<String> -> AŬ������ ���׸�Ÿ�� T�� String���� �����ȴ�.
	   // 	item������ String item���� ���ȴ�. 
		
		a.item= "�ֶ�";
		
		A<Integer> b = new A<>();
		b.item=233;
		*/
		
		
		
		
		
	} // end main

} // end learning_Generic

/*
class A <T>{  // ���׸��� Ŭ���� �̸� �ڿ� <>�� �ٿ��� ����Ѵ�.  ���׸� Ÿ�� ������ �� �� Ȥ�� �� �� �ߴٸ� �ݵ�� ���ο����� Ÿ�� ������ ��������Ѵ�. 
	T item;  // item�̶�� ������ T Ÿ���� ������ ������ ���� ��. 

	T[] arr;
	
	ArrayList<T> list = new ArrayList<>();  // �̳༮�� �̷� ������ �����ϰԲ� ���ԵǾ� �ֱ⿡ �����ϴ�. 
	
	// T[] arr = new T[3];  => �̷��Դ� ����� �� ����.  �� �������� Ÿ���� ��Ȯ���� �ʰ� �� �޸� ������ ���� �����͵��� ��Ȯ�� ũ�Ⱑ �����Ǿ�� �ϱ� ���� 
	
	
	void setItem(T item) {
		this.item = item;
	}
	
} // end class A


class B {  // ���׸��� ������� �ʴ´ٸ� �Ʒ��� ���� �� Ÿ�Ժ� ������ �ش� ������ �޼��带 ���������Ѵ�. 
		
		int item1;
		String item2;
		float item3;
		char item4;
		
		void setItem(int item) {
			this.item1 = item;
		}
		
		void setItem(String item) {
			this.item2 = item;
		}
		
		void setItem(float item) {
			this.item3 = item;
		}
		
		void setItem(char item) {
			this.item4 = item;
		}
}

*/






/*
		Generic
		
		- Ŭ����
		
		- Ŭ���� ������ Ÿ���� �����ϴ� ���
		Ŭ������ ������ ����ų� Ŭ���� ���ο� �������� Ÿ���� �ִ� ��� ���׸��� ����Ѵ�. 
		���׸��� ����ϸ� �޼����̵� ������ �Ű������̵� Ư�� �ϳ������� ���� �� �� �ְ� ���ִ°� �����ϴ� 
		
		���׸��� ������� �ʴ´ٸ� �� Ÿ�� �� ��� ������ ������ ����� ����Ѵ�. 
		
		���׸� Ÿ�� ǥ�� 
		
		T -> type
		E -> element
		K -> key
		V -> value
		N -> number
		
		-Ŭ������ ���׸� ǥ�� ���
		class A<T>
		
		-���׸� Ÿ���� Ŭ���� Ÿ�Ը� ������ �� �ִ�.
		A<Tea> a = new A<Tea> ();
		
		-���Ѿ��� 'Ŭ����'��� ��� �����ϴ�.
		
		-���׸�Ÿ������ ��� ������ Ŭ���� ������ �δ� ��� (������ ���)
		class A< T extends Parent>
		
		=> Parent Ŭ������ �ڽ� Ŭ������ ParentŬ������
		���׸����� Ÿ�� ������ �����ϴ�.
		
		�̿� �ٸ� Ŭ�������� �Ұ�
		
		=> ���� Ÿ������ ������ ������ ���ִ�.
		�������̽��� ���� Ÿ�� ���� ����! 
		Ŭ������ �ȵ�
		
		- ���׸� ���ϵ� ī�� <?>  
		(ī�� ���ӿ��� � �뵵�ε� ���� �� �ִ� ������ ī�带 �̸��� ���̴�.)
		
		- ���׸� Ÿ���� �Ѱ踦 ���� �ϱ� ���� ����ϴ� ���
		- �޼����� �Ű�����Ÿ������ ���׸� Ÿ�� ǥ���Ǵ� Ŭ������ ����Ѵٸ�
		  Ŭ������ ǥ���� ���׸��� ����� ǥ������ �ʱ� ������ 
		  (ǥ������ �ʴ� ���� : ( Ŭ������ �޶�) => �޸� ��ġ�� �ٸ��� ������ )
		  �ٽ� �ѹ� ���׸� ���� �ؾ��Ѵ�. 
		  
		  �̶� ���Ǵ� ���� ���� ����Ѵٶ�� �ؼ� ? �� ǥ�� 
		  
		  -���ϵ� ī���� ���� 
		  
		  <? extends T> : T Ŭ������ �� �ڽı��� ����
		  <? super T> : TŬ������ �� ������� ����( �ڽ��� �ȵ�!)
		
*/