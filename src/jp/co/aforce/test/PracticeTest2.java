package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest2 {
	public static void main(String[] args) {
		
		int x=10;
		int y=28;
		double z=3.14;
		
		//練習問題１
		System.out.println(x*y);
		
		//練習問題２
		System.out.println(y/x);
		System.out.println(y%x);
		
		//練習問題３
		double number=y*z;
		System.out.println(number);
		
		//練習問題４
		number++;
		System.out.println(number);
		
		//練習問題５
		int age=22;
		Random random=new Random();
		int randomNumber=random.nextInt(101);
		int r=randomNumber;
		
		
		System.out.println("r="+r);
		if(age>r) {
			System.out.println("私の方が年上です。");
		}else if(age<r) {
			System.out.println("私の方が年下です。");
		}else if(age==r){
			System.out.println("私と同い年です。");
		}
		
		
	}

}
