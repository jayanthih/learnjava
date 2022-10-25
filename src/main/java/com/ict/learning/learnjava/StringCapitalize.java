package com.ict.learning.learnjava;

import java.util.StringTokenizer;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

public class StringCapitalize {

	public static void main(String[] args) {
		String description = "After more than 30 years of service as one of the Navy's top aviators, Pete \"Maverick\" Mitchell is where he belongs, pushing the envelope as a courageous test pilot and dodging the advancement in rank that would ground him. Training a detachment of graduates for a special assignment, Maverick must confront the ghosts of his past and his deepest fears, culminating in a mission that demands the ultimate sacrifice from those who choose to fly it.";
		System.out.println(description);
		description = WordUtils.capitalize(description);
		System.out.println(description);
		description = WordUtils.uncapitalize(description);
		System.out.println(description);
		System.out.println(description.replaceAll("[a-zA-Z]+", ""));
		System.out.println((description.replaceAll("[a-zA-Z]+", "")).replaceAll(" ",""));
		System.out.println();
		
		
		
		StringTokenizer st = new StringTokenizer(description);
		st.countTokens();
		System.out.println(st.countTokens());
		int spacecount = description.split(" ").length-1;
		System.out.println("space count  " +spacecount);
		int spacecount1 = StringUtils.countMatches(description, " ");
		System.out.println("space count1  " +spacecount1);
		int withwhitespace = description.length();
		System.out.println("withwhitespace " +withwhitespace);
		int withoutwhitespace = withwhitespace-spacecount;
		System.out.println("withoutwhitespace "+ withoutwhitespace);
		
		int specialcharacters = description.split("'",-1).length-1;
		System.out.println("specialcharacters "+ specialcharacters);
		int specialcharacters1 =  StringUtils.countMatches(description, "'");
		System.out.println("specialcharacters1 "+ specialcharacters1);
		
		int specialcharac = description.split(",",-1).length-1;
		System.out.println("specialcharac "+ specialcharac);
		int specialcharac1 = StringUtils.countMatches(description, ","); 
		System.out.println("specialcharact1"+ specialcharac1);
		
		int specialcharac2 = description.split("\"",-1).length-1;
		System.out.println("specialcharac2 "+ specialcharac2);
		int specialcharac3 = StringUtils.countMatches(description, "\"");; 
		System.out.println("specialcharac3 "+ specialcharac3);
		
		int specialcharac4 = description.split("\\.",-1).length-1;
		System.out.println("specialcharac4 "+ specialcharac4);
		int specialcharac5 = StringUtils.countMatches(description, "."); 
		System.out.println("specialcharac5 "+ specialcharac5);
		
		
	
		int allspecialchars = description.split("\"",-1).length-1+description.split(",",-1).length-1+description.split("'",-1).length-1+description.split("\\.",-1).length-1;
		System.out.println("allspecialchars "+ allspecialchars);
		int allspecialchars2 =StringUtils.countMatches(description, "'")+StringUtils.countMatches(description, ",")+StringUtils.countMatches(description, "\"")+StringUtils.countMatches(description, ".");;
		System.out.println("allspecialchars2 "+ allspecialchars2);
	    System.out.println(specialcharacters1 +specialcharac1 +specialcharac3 +specialcharac5);
		
	}

}
