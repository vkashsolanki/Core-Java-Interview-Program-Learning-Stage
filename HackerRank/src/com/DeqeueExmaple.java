package com;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeqeueExmaple {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<>();
		int n = in.nextInt();
		int m = in.nextInt();
		int max = 0;

		for (int i = 0; i < n; i++) {

			int num = in.nextInt();

			if (i < m - 1) {
				deque.addFirst(num);
			} else {
				deque.addFirst(num);

				Set<Integer> integerSet = new HashSet<>(deque);
				//System.out.println("Hashset is " + integerSet);

				int aide;

				aide = integerSet.size();

				if (aide > max)
					max = aide;

				if (max == m)
					break;
				deque.pollLast();

			}

		}

		System.out.println(max);
	}

}
