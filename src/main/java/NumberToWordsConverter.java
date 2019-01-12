package main.java;

import java.io.IOException;

/**
 * Created by bztlgx on 05/05/2018.
 *
 */
// 2147483647 is the biggest int number java can handle
// that large numbers (usually larger than 2147483647 (2^30 -1)  and smaller than -2147483648) will lose some of the bits and would be represented incorrectly.
// this program is to solve the large scale number and number which with decimal point

public class NumberToWordsConverter {
	private final String[] ONES={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
			"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	private final String[] TENS={"","tTen","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};
	private final String[] THOUSANDS={"","Thousand","Million","Billion","Trillion","Quadrillion","Quintillion","Sextillion","Septillion","Octillion","Nonillion"};
	private final String[] Nths = {"","Tenth","Hundredth","Thousandth", "Ten_Thousandth","Hundred_Thousandth", "Millionth"};
    /*
Quadrillion    10^15
Quintillion    10^18
Sextillion 102^1
Septillion 10^24
Octillion  10^27
Nonillion   10^30
 */

	public String numberToWordswithDecimalPoint(String numString){
		String words = "";
		String[] temp=null;
		if(numString.contains(".")){
			temp = numString.split("\\.");
		}
		if(temp!=null){
			words=numberToWords(temp[0])+" and " + numberToWords(temp[1]) + " " + Nths[temp[1].length()];

		}
		return words;
	}


	public String numberToWords(String numString){

		int length = numString.length();
		String words="";
		if(length == 1 && (Integer.parseInt(numString)==0)){
			return "Zero";
		}
		if(length <=3){
			return convert(Integer.parseInt(numString));
		}
		else{
			int end = length;
			int i=0;

			while(end>3){
				if(words.length()>0)
					words = convert(Integer.parseInt(numString.substring(end-3,end)))+" "+THOUSANDS[i] + ", "+ words;
				else
					words = convert(Integer.parseInt(numString.substring(end-3,end)))+" "+THOUSANDS[i];
				i++;
				end= end-3;
			}
			if(end<=3){
				words = convert(Integer.parseInt(numString.substring(0,end)))+" "+THOUSANDS[i] + ", " + words;
			}
		}
		return words.trim();
	}

	private String convert(int number){
		if(number == 0)
			return "";
		else if (number < 20){
			return ONES[number];
		}
		else if( number < 100){
			return TENS[number/10]+"-" + convert(number%10);
		}
		else {
			return ONES[number/100]+"Hundred "+convert(number%100);
		}
	}

    public static void main(String args[]) throws IOException {

	    NumberToWordsConverter nc = new NumberToWordsConverter();

	        System.out.println(" number to words : ");
		    System.out.println(nc.numberToWords("135324756768579789"));
		    System.out.println(" number to words with decimal point: ");
		    System.out.println(nc.numberToWordswithDecimalPoint("246345756876.678967"));



    }


}


