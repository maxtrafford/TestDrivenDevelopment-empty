package com.qa.testdrivendevelopment;
import java.lang.reflect.Array;
public class Questions {

	/**
	 * EXAMPLE: THIS ONE HAS BEEN DONE FOR YOU <br>
	 * 
	 * Given a name, return "Hi" plus the name <br>
	 * <br>
	 * For Example:<br>
	 * greetingExample("John") → "Hi John" <br>
	 * greetingExample("Matt") → "Hi Matt" <br>
	 * greetingExample("Angelica") → "Hi Angelica"
	 * 
	 */
	public String greetingExample(String name) {
		return "Hi " + name;
	}

	/**
	 * Given a string, return a string where for every char in the original string,
	 * there are three chars.<br>
	 * <br>
	 * 
	 * For Example:<br>
	 * multChar("The") → "TTThhheee"<br>
	 * multChar("AAbb") → "AAAAAAbbbbbb"<br>
	 * multChar("Hi-There") → "HHHiii---TTThhheeerrreee"
	 */
	public String multiChar(String input) {
		String a = "";
		for(int index =0; index<input.length();index++) {
			a = a + input.charAt(index) + input.charAt(index) + input.charAt(index);
			System.out.println(a);
		}
		return a ;
	}

	/**
	 * Return the string (backwards) that is between the first and last appearance
	 * of "bread" in the given string, or return the empty string "" if there is not
	 * 2 occurances of "bread". Ignore Case<br>
	 * <br>
	 * For Example: sandwichFilling("breadclivebread") → "evilc"<br>
	 * sandwichFilling("xxbreadfridgebreadyy") → "egdirf"<br>
	 * sandwichFilling("xxBreadfridgeBReAdyy") → "egdirf"<br>
	 * sandwichFilling("xxbreadyy") → "" sandwichFilling("xxbreADyy") → ""<br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */

	public String sandwichFilling(String sandwich) {
		String a ="";
		if (sandwich.toLowerCase().contains("bread")) {
//			System.out.println(sandwich);
			String b =sandwich.toLowerCase().substring(sandwich.toLowerCase().indexOf("bread")+5);
//			System.out.println(b);
			if(b.toLowerCase().contains("bread")) {
				b = b.toLowerCase().substring(0,b.indexOf("bread"));
//			System.out.println(b);
//			System.out.println(b.length());
				for(int index=b.length()-1; index >=0; index+=-1) {
//					System.out.println(index);
					 a = a + b.charAt(index);
//					 System.out.println(a);
				}
				} 		else { 
							a = "";
			}

			}	else {
					a = "";
			}
//		System.out.println(a);
		return a;
	}


	/**
	 * Given three ints, a b c, one of them is small, one is medium and one is
	 * large. Return true if the three values are evenly spaced, so the difference
	 * between small and medium is the same as the difference between medium and
	 * large. Do not assume the ints will come to you in a reasonable order.<br>
	 * <br>
	 * For Example:<br>
	 * evenlySpaced(2, 4, 6) → true<br>
	 * evenlySpaced(4, 6, 2) → true<br>
	 * evenlySpaced(4, 6, 3) → false<br>
	 * evenlySpaced(4, 60, 9) → false
	 */
	public boolean evenlySpaced(int a, int b, int c) {
		
		if( Math.max(a,Math.max(b, c)) == a) { //a 
			
			if(a - Math.max(b, c)== Math.max(b, c)-Math.min(b, c)) {
				return true;	
			}
		}
			else if( Math.max(a,Math.max(b, c)) == b) {
				if(b - Math.max(a, c)== Math.max(a, c)-Math.min(a, c)) {
					return true;	
				}
			}
			
		
				
			else { // ==c
				if(c - Math.max(a, b)== Math.max(a, b)-Math.min(a, b)) {
					return true;	
				}
				
			}
		return false;
	}

	/**
	 * Given a string and an int n, return a string that removes n letters from
	 * the'middle' of the string. The string length will be at least n. The input
	 * string will have an odd number of letters. n will always be an odd
	 * number.<br>
	 * <br>
	 * For Example:<br>
	 * nMid("Hello", 3) → "Ho"<br>
	 * nMid("Chocolate", 3) → "Choate"<br>
	 * nMid("Chocolate", 1) → "Choclate"<br>
	 */
	public String nMid(String input, int n) {
		System.out.println((input.length()-n)/2);
		String a = input.substring(0,(input.length()-n)/2) + input.substring(input.length()-(input.length()-n)/2);
//		for(int index =(input.length()-n)/2; index <=n-(input.length()-n)/2; index++) {
//			String a = input.();
//		}
	
//		input.substring(,, "");
		System.out.println(a);
		
    	return a;
	}

	/**
	 * Given a string, return the boolean True if it ends in "java" and False if
	 * does not end in "java". Ignore Case.<br>
	 * <br>
	 * For Example: <br>
	 * endsJava("ilovejava") → true <br>
	 * endsJava("iloveJaVa") → true <br>
	 * endsJava("welovejava") → true <br>
	 * endsJava("welovejavamoreeveryday") → false <br>
	 * endsJava("javaiscool") → false <br>
	 * endsJava("pythoniscool") → false <br>
	 */
	public boolean endsJava(String input) {
		if(input.toLowerCase().endsWith("java")) {
			return true;
		}
    	return false;
	}

	/**
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same, do not ignore case.<br>
	 * <br>
	 * For Example: superBlock("hooopplla") → 3 <br>
	 * superBlock("abbCCCddDDDDeeEEE") → 4 <br>
	 * superBlock("abbCCCCC")) → 5 <br>
	 * superBlock("") → 0 <br>
	 * <br>
	 * HINT: "a" == "a" if false HINT: "a".equals("a") is true
	 */
	public int superBlock(String input) {
		char a = 0;
		int supercount = 0;
		int count = 0;
		System.out.println(input);
		for(int index=0; index<input.length();index++) {
			if(input.charAt(index) == a) {
				 count = count + 1;
				 System.out.println(count);
					if(count>supercount){
						supercount = count;
						System.out.println(supercount);
				}
			}	else {
					a = input.charAt(index);

					count = 1; 
			}
				
		}
		
    	return supercount;
	}

	/**
	 * Given a string - return the number of times "am" appears in the String
	 * ignoring case - BUT ONLY WHEN the word "am" appears without being followed or
	 * preceded by other letters <br>
	 * <br>
	 * For Example: <br>
	 * amISearch("Am I in Amsterdam") → 1 <br>
	 * amISearch("I am in Amsterdam am I?") → 2 <br>
	 * amISearch("I have been in Amsterdam") → 0 <br>
	 * <br>
	 * HINT: String.toLowerCase
	 */
	public int amISearch(String sentence) {
		
		int count = 0;
//		 
		sentence = " " + sentence;
		System.out.println(sentence);
		while(sentence.toLowerCase().contains(" am ")) {
			    sentence = sentence.toLowerCase().substring(0,sentence.toLowerCase().indexOf(" am ")) + sentence.toLowerCase().substring(sentence.toLowerCase().indexOf(" am ")+3,sentence.length());
				count = count + 1;
				System.out.println(count);
			}
		
    	return count;
	}

	/**
	 * Given a number if this number is divisible by 3 return "fizz" if this number
	 * is divisible by 5 return "buzz" if this number is divisible by both 3 and 5
	 * return "fizzbuzz" if this number is not divisible by 3 or 5 return null<br>
	 * <br>
	 * For Example: <br>
	 * fizzBuzz(3) → "fizz" <br>
	 * fizzBuzz(10) → "buzz" <br>
	 * fizzBuzz(15) → "fizzbuzz" <br>
	 * fizzBuzz(8) → null
	 */
	public String fizzBuzz(int number) {
		if(number % 3 == 0 && number % 5 == 0) {
			return "fizzbuzz";
		} 
		else if (number % 3 == 0) {
			return "fizz";
		}
		else if (number % 5 == 0) {
			return "buzz";
		}
		else {
			return null; 
		}
		
	}

	/**
	 * Given a string, split the string into the individual numbers present then add
	 * each digit of each number to get a final value for each number <br>
	 * <br>
	 * String example = "55 72 86"<br>
	 * <br>
	 * "55" will = the integer 10 <br>
	 * "72" will = the integer 9 <br>
	 * "86" will = the integer 14 <br>
	 * <br>
	 * You then need to return the highest vale <br>
	 * <br>
	 * For Example: <br>
	 * largest("55 72 86") → 14 <br>
	 * largest("15 72 80 164") → 11 <br>
	 * largest("555 72 86 45 10") → 15 <br>
	 * <br>
	 * HINT: Integer.parseInt
	 */

	public int largest(String input) {
		int ret = 0;
		String[] split1 = input.split(" ");
		System.out.println(split1[0]);
		for(String n :split1) {
			System.out.println("this is n" + n);
			int sumDig=0;
			String[] split2 = n.split("");
			for(String b : split2) {
				System.out.println(sumDig);
				System.out.println(Integer.parseInt(b));
				sumDig= sumDig +Integer.parseInt(b);
				System.out.println("This is SumDig " + sumDig);
				
			}
			if (sumDig>ret) {
				ret = sumDig;
				System.out.println(ret);
			}
				
			System.out.println("ret is " +ret);	


	}
		return ret;

	}



	/**
	 * Given a string, int and a char, return a boolean value if the 'nth'
	 * (represented by the int provided) char of the String supplied is the same as
	 * the char supplied. The int provided will NOT always be less than than the
	 * length of the String. Ignore case and Whitespace. <br>
	 * <br>
	 * For Example: <br>
	 * compares("The",2,'h') → true <br>
	 * compares("AAbb",1,'b') → false <br>
	 * compares("Hi-There",10,'e') → false <br>
	 * <br>
	 * HINT: String.charAt
	 */
	public boolean compares(String word, int index, char letter) {
		System.out.println(index);
		System.out.println(letter);
		System.out.println(word);
		if (index-1>word.length()){
			 return false;
		}
		else if( word.charAt(index-1) == letter) {
			System.out.println(word.charAt(index-1));
		} 
		return true;

	}


		

}
