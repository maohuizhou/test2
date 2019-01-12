package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/**
 * Created by bztlgx on 5/4/2018.
 */
public class RegexTest {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String line;
		String pattern = "^[A-Z][a-z]*\\$[A-Z][a-z]*[0-9]?[0-9]?[0-9]?$";
		//pattern = "^[A-Z][a-z]*\\$[A-Z][a-z]*[0-9]{0,3}$";
		while ((line = in.readLine()) != null) {

			if(Pattern.matches(pattern, line))
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
	}
}
