package string;

import java.util.Arrays;

public class Anagram {

	/*
	 * function to check whether two strings are anagram of each other
	 */
	static boolean areAnagram(char[] str1, char[] str2) {
		// Get lengths of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	static boolean checkAnagram(char[] str1, char[] str2) {
		int count1[] = new int[256];
		Arrays.fill(count1, 0);
		int count2[] = new int[256];
		Arrays.fill(count2, 0);

		for (int i = 0; i < str1.length && i < str2.length; i++) {
			count1[str1[i]]++;
			count2[str2[i]]++;
		}

		// Get lengths of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		for (int i = 0; i < 256; i++) {
			if (count1[i] != count2[i]) {
				return false;
			}

		}
		return true;
	}

	/* Driver Code */
	public static void main(String args[]) {
		char str1[] = { 't', 'e', 's', 't' };
		char str2[] = { 't', 't', 'e', 'w' };
		checkAnagram(str1, str2);
		// Function Call
		if (areAnagram(str1, str2))
			System.out.println("The two strings are" + " anagram of each other");
		else
			System.out.println("The two strings are not" + " anagram of each other");// O(nlogn)
	}
}
