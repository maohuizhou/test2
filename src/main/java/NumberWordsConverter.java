package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/**
 * Created by BZTLGX on 5/5/2018.
 */
public class NumberWordsConverter {


	private final String[] ONES = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
	private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion","Trillion","Quadrillion","Quintillion","Sextillion","Septillion","ten^24"};

	/**
	 * input is the int type number
	 * @param number
	 * @return english words representation of the nubmer
	 */
	public String numberToWords(int number) {
		if (number == 0) return "Zero";

		int i = 0;
		String words = "";

		while (number > 0) {
			if (number % 1000 != 0)
				words = convert(number % 1000) +THOUSANDS[i] + " " + words;
			number /= 1000;
			i++;
		}

		return words.trim();
	}

	/**
	 * input is the string type number can be large scale
	 * the input must be non-zero leading digits string only
	 * @param number
	 * @return english words representation of the number
	 */
	public String numberToWords(String number) {

		String pattern ="([1-9]\\d*)";
		if(!Pattern.matches(pattern,number)){
			System.out.println("Wrong input format! ==> " + number);
			return "";
		}
		String words = "";
		int length = number.length();
		if(length==1 && Integer.parseInt(number)==0)
			return "Zero";
		else if(length<=3){
			words = convert(Integer.parseInt(number)) + " " + words;
		}
		else {
			int i = 0;
			int end = length;
			while (end>3 ) {

				words = convert(Integer.parseInt(number.substring(end-3, end))) + THOUSANDS[i] + " " + words;
				i++;
				end = end - 3;

			}
			if(end<=3){

				words = convert(Integer.parseInt(number.substring(0, end))) + THOUSANDS[i] + " " + words;

			}
		}
			return words.trim();

	}

	private String convert(int num) {
		if (num == 0)
			return "";
		else if (num < 20)
			return ONES[num] + " ";
		else if (num < 100)
			return TENS[num / 10] + " " + convert(num % 10);
		else
			return ONES[num / 100] + " Hundred " + convert(num % 100);
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		NumberWordsConverter nwc = new NumberWordsConverter();
		while ((line = in.readLine()) != null ) {
			System.out.println( nwc.numberToWords(line));
		}
	}
}
