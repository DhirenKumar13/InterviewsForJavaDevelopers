package org.dhiren.practices.string;

public class ExtractCategories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "This is category:appreal as in of category:makeup"
				+ " and also the presence of category:furniture ";
		printCategory(a);
	}
	
	public static void printCategory(String text) {
		int counter = 0;
		while(true) {
			int found = text.indexOf("category:",counter);
			if(found == -1)
				break;
			int start = found + 9;
			int end = text.indexOf(" ", start);
			System.out.println(text.substring(start, end));
			counter = end + 1;
		}
	}

}
