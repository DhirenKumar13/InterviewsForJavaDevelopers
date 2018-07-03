package org.dhiren.practices.string;

public class StringUtilities {

	public static void main(String[] args) {
		String a = "ABCDEFG";
		System.out.println(a.substring(1)); //BCDEFG
		System.out.println(a.substring(0)); //ABCDEFG
		System.out.println(a.substring(0, 2)); //AB
		System.out.println(a.substring(1, 2)); //B
		// System.out.println(a.substring(0, -1)); // StringIndexOutOfBoundsException -1
		System.out.println("###########################");
		System.out.println(a.subSequence(0, 2)); //AB
		//System.out.println(a.subSequence(0, 8)); //StringIndexOutOfBoundsException 8
		System.out.println("###########################");
		String myStr = "Hello Dhiren ! Hello Again";
		System.out.println(myStr.indexOf("Hello")); // 0
		System.out.println(myStr.indexOf("Hello", 6)); // 15
		System.out.println(myStr.indexOf("Hello", 11)); // 15
		System.out.println(myStr.indexOf("el")); //1
		System.out.println(myStr.indexOf("Hello", -11)); // 0
		System.out.println(myStr.indexOf("Hello", 0)); //0
	}

}
