package jp.co.aforce.test;

import java.util.ArrayList;

public class PracticeTest4 {
	
	//練習問題１　int型を比較するときは＝＝で、String型を比較する場合はequarsを使う必要があるため、②が正しい。
	
	//練習問題２
	public static void main(String[] args) {
		ArrayList<String> animals=new ArrayList();
		
		animals.add("犬");
		animals.add("猫");
		animals.add("うさぎ");
		animals.add("ヘビ");
		
	//練習問題３
		String favorite=animals.get(0);
		String[] search= {favorite};
		for(String s:search) {
			if(animals.contains(s)) {
				System.out.println(favorite+"はリストに含まれています。");
			}else {
				System.out.println(favorite+"はリストに含まれません。");
			}
		}
		
	//練習問題４
		int month=11;
		
		switch(month) {
		case 1:
			System.out.println("元日,成人の日");
			break;
		case 2:
			System.out.println("建国記念の日,天皇誕生日");
			break;
		case 3:
			System.out.println("春分の日");
			break;
		case 4:
			System.out.println("昭和の日");
			break;
		case 5:
			System.out.println("憲法記念日,みどりの日,こどもの日");
			break;
		case 6:
			System.out.println("なし");
			break;
		case 7:
			System.out.println("海の日,スポーツの日");
			break;
		case 8:
			System.out.println("山の日");
			break;
		case 9:
			System.out.println("敬老の日,秋分の日");
			break;
		case 10:
			System.out.println("なし");
			break;
		case 11:
			System.out.println("文化の日,勤労感謝の日");
			break;
		case 12:
			System.out.println("なし");
			break;
		}
		//switchで記述した方が見やすくわかりやすいと判断したため。
	}

}
