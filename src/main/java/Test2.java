package main.java;

/**
 * Created by bztlgx on 5/4/2018.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
	/**
	 * Iterate through each line of input.
	 */
	public static void main(String[] args) throws IOException {
		HashMap<Character, Integer> countChars = new LinkedHashMap<>();
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		while ((line = in.readLine()) != null && !line.equalsIgnoreCase("===")) {
			line = line.toLowerCase();
			char[] lineArray = line.toCharArray();
			Arrays.sort(lineArray);
			for (char c : lineArray) {
				char lowerc = new Character(c);
				if (countChars.containsKey(lowerc)) {
					Integer count = countChars.get(lowerc);
					count++;
					countChars.put(lowerc, count);
				} else {
					countChars.put(lowerc, 1);
				}
			}
		}
		for(Map.Entry<Character, Integer> entry : countChars.entrySet())
		{
			System.out.print(entry.getKey().toString()+entry.getValue());
		}
	}
}
