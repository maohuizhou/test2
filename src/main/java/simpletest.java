package main.java;

import org.junit.Test;

import java.util.regex.Pattern;

/**
 * Created by bztlgx on 5/8/2018.
 */
public class simpletest {

	@Test
	public void test1(){
		//NumsToWords nw = new NumsToWords();
		//NumsToWords.translateNumber("23124125.23");
		NumberWordsConverter t1 = new NumberWordsConverter();
		System.out.println(t1.numberToWords(0));
		System.out.println(t1.numberToWords(10));
		System.out.println(t1.numberToWords(1000));
		System.out.println(t1.numberToWords(10000));
		System.out.println(t1.numberToWords(23432648));

	    System.out.println(t1.numberToWords("23,432,648"));
		System.out.println(t1.numberToWords("1qet"));
		System.out.println(t1.numberToWords("15"));
		System.out.println(t1.numberToWords("94"));
		System.out.println(t1.numberToWords("90"));
		System.out.println(t1.numberToWords("200"));
		System.out.println(t1.numberToWords("201"));
		System.out.println(t1.numberToWords("113452354351"));
		System.out.println(t1.numberToWords("12000"));

		System.out.println(t1.numberToWords("23432648"));
		System.out.println(t1.numberToWords("323452345153153452147483647"));
		if(!Pattern.matches("[A-Z]{2,3}","AB")){
			System.out.println("Please provide the correct Country Code");
		}
		if(!Pattern.matches("[A-Z]{2,3}","abc")){
			System.out.println("Please provide the correct Country Code ==>" + "agaga" );
		}
		if(!Pattern.matches("[g,p]","g")){
			System.out.println("Please provide the correct type: p or g");
		}
		if(!Pattern.matches("[g,p]","G")){
			System.out.println("Please provide the correct type: p or g ==>G");
		}
		if(!Pattern.matches("[g,p]","x")){
			System.out.println("Please provide the correct type: p or g ==>x");
		}
		if(!Pattern.matches("[g,p]","p")){
			System.out.println("Please provide the correct type: p or g ==>p");
		}
		assert(true);
	}

}
