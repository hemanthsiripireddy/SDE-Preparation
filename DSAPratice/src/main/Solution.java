package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

//} Driver Code Ends
//User function Template for Java
class Solution {
	Set<Integer> visited = new HashSet<>();
	int[] dp = new int[10000];
	Set<Integer> primes = new HashSet<>();

	int solve(int num1, int num2) {
		// code here
		boolean[] arr = new boolean[10000];
		Arrays.fill(arr, true);
		// arr[2]=true;
		List<Integer> primesList = new ArrayList<>();
		for (int i = 2; i < 10000; i++) {

			if (arr[i]) {
				if (i >= 1000)
					primesList.add(i);
				for (int j = i * 2; j < 10000; j = j + i) {
					arr[j] = false;
				}
			}
		}
		for(int i:primesList) {
			primes.add(i);
		}

		Arrays.fill(dp, -1);
		rec(num1, num2);
		return dp[num1];

	}

	public int rec(int num, int dst) {
		if (num == dst) {
			dp[dst]=0;
			return 0;
		}
				if (dp[num] != -1)
			return dp[num];
		int temp = num;
		if (visited.contains(num)) {
			//dp[num]=20000;
			return 20000;
		}
			
		visited.add(num);
	
		int[] arr = new int[4];
		int i = 3;
		while (temp>0) {
			arr[i] = temp % 10;
			temp = temp / 10;
			i--;

		}
		int res = 20000;
		for (i = 0; i < 4; i++) {

			for (int j = 0; j <= 9; j++) {

				if (arr[i] != j) {
					temp = arr[i];
					arr[i] = j;
					int cur = findNum(arr);
					if (cur >= 1000&&primes.contains(cur)) {

						int ans = rec(cur, dst);
						res = Math.min(ans+1, res);

					}
					arr[i] = temp;

				}
			}

		}
		dp[num] = res;
		return res;
	}

	public int findNum(int[] arr) {

		int res = 0;
		for (int i = 0; i < 4; i++) {
			res = res + arr[i] * (int) Math.pow(10, 3-i);
		}
		return res;
	}
}
