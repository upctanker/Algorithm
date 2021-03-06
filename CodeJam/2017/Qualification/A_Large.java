/* 
 * Author: Minho Kim (ISKU)
 * Date: 2017.04.07
 * E-mail: minho1a@hanmail.net
 * 
 * https://github.com/ISKU/Algorithm
 * https://code.google.com/codejam/contest/3264486/dashboard#s=p0
 */

import java.util.*;
import java.io.*;
import java.math.*;

public class A_Large {
	public static void main(String... args) throws IOException {
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();

		for (int tCase = 1; tCase <= testCase; tCase++) {
			char[] cake = input.next().toCharArray();
			int k = input.nextInt();
			int split = (cake.length - k) + 1;

			int answer = 0;
			for (int i = 0; i < split; i++) {
				if (cake[i] == '-' && i + k <= cake.length) {
					for (int j = i; j < i + k; j++)
						cake[j] = (cake[j] == '-') ? '+' : '-';
					answer++;
				}
			}

			boolean check = false;
			for (int i = 0; i < cake.length; i++)
				if (cake[i] == '-') {
					check = true;
					break;
				}

			System.out.printf("Case #%d: %s\n", tCase, check ? "IMPOSSIBLE" : String.valueOf(answer));
		}
	}
}