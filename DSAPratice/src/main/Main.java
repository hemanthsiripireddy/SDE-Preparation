package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import arrays.RearrangeArraytoMaximizePrefixScore;
import bitManupulation.CheckIfElementIsPowerOf2;
import bitManupulation.PartitiontoKEqualSumSubsets;
import dp.TrappingRainWaterII;
import graphs.NumberofWaystoArriveatDestination;
import hashing.ArrayofDoubledPairs;
import heap.MaximumNumberofEventsThatCanBeAttended;
import numberTheory.WaterandJugProblem;
import searchingAndSorting.MaxChunksToMakeSorted;
import stackAndQueue.MaximumSumCircularSubarray;
import strings.MostCommonWord;
import strings.NumberToStringConversion;
import trie.LexicographicalNumbers;

public class Main {

	public static void main(String[] args) {
		ArrayofDoubledPairs.method();
	}

	public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

		int[][] res = new int[rows][cols];
		int c = 1;
		int cr = rStart, cc = cStart;
		res[cr][cc] = c++;
		int ns = 1;
		int n = 1;
		int total = rows * cols;
		while (c <= total) {
			

			int count = 0;
			while (count < ns) {
				cc++;
				if (cr >= 0 && cr < rows && cc >= 0 && cc < cols) {
					res[cr][cc] = c++;

				}
				count++;
			}
			if (n == 1) {
				n++;
			} else {
				ns++;
				n = 1;
			}
			count = 0;
			while (count < ns) {
				cr++;
				if (cr >= 0 && cr < rows && cc >= 0 && cc < cols) {
					res[cr][cc] = c++;

				}
				count++;

			}
			if (n == 1) {
				n++;
			} else {
				ns++;
				n = 1;
			}
			count = 0;
			while (count < ns) {
				cc--;
				if (cr >= 0 && cr < rows && cc >= 0 && cc < cols) {
					res[cr][cc] = c++;

				}
				count++;

			}
			if (n == 1) {
				n++;
			} else {
				ns++;
				n = 1;
			}
			count = 0;
			while (count < ns) {
				cr--;
				if (cr >= 0 && cr < rows && cc >= 0 && cc < cols) {
					res[cr][cc] = c++;

				}
				count++;

			}
			if (n == 1) {
				n++;
			} else {
				ns++;
				n = 1;
			}
		}
		return res;

	}
}
