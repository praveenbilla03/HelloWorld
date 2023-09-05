package org.studyeasy;

public class TypeCasting {

	public static void main(String[] args) {
		int x = 10;
		//short y = (short)x;
		short y = (byte)x;
		System.out.println(y);
		
		double d1 = 21.3556d;
		float f1 = (float)d1;
		System.out.println(f1);

	}

}
