package java0627;

import java.util.Scanner;

public class java_basic2 {

	public static void main(String[] args) {
		
		Scanner sun = new Scanner(System.in);
		
		//  ��� 
		
		
		//���ǹ� - if (������ ����), switch ( �ڵ� ���� ����)
		// �ݺ��� - for, while, do~while (�������� ���� ��� Ȥ�� ������ �ִ� ���.) 
		
		//if���� ���ǽ� - �񱳿����ڿ� �������ڷ� ���� �����. 
		//	��, ���� ������ ���ü� �ִ� ��
		// Ű�� 150 �̻��̴�.  				Ű   >=  150
		// 10�� ���� ���� ���� 				��ü���⳯¥ �� ==  10
		//  32000�� �̻���  ���� ���� 			�������� �����  >= 32000
		
		// �Ǹ����� ��ǰ�鸸 ��� 					��ǰ����  == �Ǹ�  ,  ������  >  0
		
		int tall = 135;
		if(tall >= 150) {
			// Ű�� 150�̻��� �´ٸ� ������ �� ������ 
		}else {
			// Ű�� 150�̻��� �ƴ϶�� ������ �� ������
		}
		
		//  ���� �հ� ���� - �հ� ( 60�� �̻�), ���հ� ( 60�� �̸�)
		
		int score = 72;
		int pass = 60;
		
		if(score >= pass) {
			System.out.print("�հ�");
		}else {
			System.out.print("���հ�");
		}
		
		// if ~ else  -  ���ǽ��� ��, ������  ���� ����Ǵ� ������ �ٸ����
		// �ϳ��� ���ǿ� �� ���� ������ �ִ°��  if ~ else ������ �ۼ�.
		
		// ���� ���� ��� -  A(90���̻�), B(80���̻�), C(70���̻�),  D(������)
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		
		score = 89;
		if ( a > score) {
			System.out.println( "A");
		} else if ( b < score &&  b >= 80) { // ���� �����ؾ��� ������ �� ������� else if(���ǽ�)�� �ʿ���� else�� �־ ��.
			System.out.println( "B");
		}else if(c < b && c >= 70) {
			System.out.println("C");
		}else {
			System.out.println("D");
		}
		
		/*
		 *  switch - ���� ������ case�� �����Ͽ�
		 *  				 case�� ��ġ�ϴ� ���� ��� �ߵ� �Ǵ� ���ǹ� �⺻������ 
		 *  
		 *  ������ ������ �����. ����Ű�� w,a,s,d �̰�
		 *  pŰ�� �Ͻ����� , oŰ�� ����ϱ� , i�� ó������ �ٽ� ����
		 *  ctrl+s�� ���� �����̶�� �Ѵٸ�
		 *  
		 *  switch(Ű���尪){
		 *  				case 'a' : ���೻��
		 *  				case 'w' : ���೻��
		 *  				case 's' : ���೻��
		 *  				case 'd' : ���೻��
		 *  				case 'p' : ���೻��
		 *  				case 'o' : ���೻��
		 *  				case 'i' : ���೻��
		 *  				case 'ctrl' : 
		 *  					switch(Ű2){
		 *  
		 *  				}
		 *  }
		 *  
		 *  			���α׷��� �Ӹ޴� ����
		 *  
		 *  			switch(menu){
		 *  					case "open":
		 *  					case "save":
		 *  					case "build":
		 *  					case "git" :
		 *  					case "exit": 
		 *  				}
		 *  			if(menu.eqas("open")
		 *  			���ǽ��� == �����ڰ� ���ȴٸ�  switch���� �ۼ��ϴ� ���� ��� �غ���.
		 *  
		 *  		// ���� ��ư�� Ŭ���ϸ� ������ �����ϰ�
		 *  		// ���� ��ư�� Ŭ���ϸ� �� ������ �����ϰ�
		 *  		// ���� ��ư�� Ŭ���ϸ� ������ �����ض�.
		 *  
		 */
		
		
		
//		String button = "����";
//		
//		switch(button) {
//		case " ���� " :
//			System.out.println("���� ����");
//			break;
//		case "�ڵ�����":
//		case " ����"	 :
//			System.out.println("���� ����");
//			break;
//		case "����" :
//			System.out.println( "���� ����");
//		}
		
		
		// ���ο� ������ ���̸� Ű����� �Է��ϼ���. ( ������ �Ű澲�� ���� )
		//���� �Ǵ� ������ ���̰� ũ�ٸ� �����簢��
		// ���ο� ������ ���̰� ���ٸ� ���簢�� �̶�� ����ϼ���.
		// switch������ (if�� ���� ���� ����)
		
		int width = 0;
		int height = 0;
		
		System.out.print("���α��� : ");
		width = sun.nextInt();
		System.out.print("���α��� : ");
		height = sun.nextInt();
		
		int res = width - height; // 10 - 5 -> 5
		
		
		switch(res) { // res Ÿ���� int�̱� ������ 3.1  ���� . ���� ���ڴ� �ȵȴ�. 
		case 0:
			System.out.println("���簢��");
			break;
		default :
			System.out.println("�����簢��");
		}
// switch������ default�� �� ���� ���
// switch�� ���� ���� case�� ��ġ�ϴ°� ���ٸ� default ����ȴ�.
// �־��� case�� ��ġ�ϴ°� �ϳ��� ������ default�� �����ϰ� ����.		

		
	}

}
