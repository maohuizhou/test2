package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by bztlgx on 5/5/2018.
 */
public class SortLetter {
	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {

		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;

		while ((line = in.readLine()) != null ) {
			TreeMap<Character, Integer> countMap = new TreeMap();
			line = line.toLowerCase();
			for( int i =0; i < line.length();i++){
				Character c = line.charAt(i);
				if(countMap.containsKey(c)){
					Integer count = countMap.get(c);
					countMap.put(c, ++count);
				}
				else countMap.put(c,1);
			}
			for(Map.Entry<Character, Integer> entry : countMap.entrySet())
			{
				System.out.print(entry.getKey().toString()+entry.getValue());
			}
			System.out.print("\n");
		}

	}
}