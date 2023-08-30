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
	public static class Hem implements Comparator<Integer>{

		@Override
		public int compare(Integer a, Integer b) {
			// TODO Auto-generated method stub
			int c1=c(a);
            int c2=c(b);
            if(c1<c2)
            return -1;
            else if(c1>c2)
            return 1;
            else{
                return a-b;
            }
		}
		 public int c(int n){
		        int res=0;
		        while(n>=0){
		            if((n&1)==1){
		                res++;
		            }
		            n=n>>1;
		        }
		        return res;
		    }
		
	}

	public static void main(String[] args) {
		Integer[] arr= {0,1,2,3,4,5,6,7,8,9};
		Comparator<Integer> c= new Hem();
		Arrays.sort(arr, c);
		
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
