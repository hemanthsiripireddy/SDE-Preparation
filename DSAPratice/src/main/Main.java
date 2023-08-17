package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import arrays.MaximumSideLengthofaSquarewithSumLessthanorEqualtoThreshold;
import arrays.NumberofAdjacentElementsWiththeSameColor;
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
		String str="[[35,-23],[-12,-48],[-34,-40],[21,-25],[-35,-44],[24,1],[16,-9],[41,4],[-36,-49],[42,-49],[-37,-20],[-35,11],[-2,-36],[18,21],[18,8],[-24,14],[-23,-11],[-8,44],[-19,-3],[0,-10],[-21,-4],[23,18],[20,11],[-42,24],[6,-19]]";
		//System.out.println(str.length());
		String res=SquareBrackerToCurlyBrackets.covert(str);
		System.out.println(res);
		//MaximumSideLengthofaSquarewithSumLessthanorEqualtoThreshold.client();
		
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
