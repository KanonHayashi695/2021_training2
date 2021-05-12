package jp.co.aforce.test;
import java.util.Random;

public class PracticeTest5 {
	public static void main(String[] args) {
		//練習問題１
		Random random=new Random();
		int fortune=random.nextInt(10);
		
		switch(fortune) {
		case 1:
			System.out.println("吉です");
			break;
		case 2:
			System.out.println("中吉です");
			break;
		case 3:
			System.out.println("大吉です");
			break;
		default:
			System.out.println("凶です");
			break;

		}
		
		//練習問題２
		int sum=0;
		for(int i=0; i<100; i++) {
			if(i%7==0) {
				System.out.println(i);
				sum=sum+i;
			}
			
			
		}
		System.out.println(sum);
		
		
		//練習問題３
		int kuku[][]=new int[9][9];
		for (int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				kuku[i][j]=(i+1)*(j+1);
			}
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.println(kuku[i][j]+"");
			}
				System.out.println();
		}
	}

}
