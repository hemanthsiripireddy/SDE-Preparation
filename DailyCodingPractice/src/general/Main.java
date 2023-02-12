package general;

//import java.util.Scanner;

import week1.CalcFrequencyOfElementInArray;
import week1.CommonElemetnsinThreeSortedArray;
import week1.CyclicallyRotateAnArray;
import week1.FindAllPairs;
import week1.FindPeekElement;

import week1.MoveAllNegativeNumbersToRight;
import week1.QuickSort;
import week1.SearchElement;
import week1.UnionAndIntersection;
import week2.CountOfReversePairs;
import week2.FindIndexOfFirstRepeatingElement;
import week2.FindRankofElementsInArray;
import week2.FindSubArrayWithGivenSum;
import week2.MinimumNumberofSwapsRequiredToSortAnArray;
import week2.SortTheArrayThatContains0s1s2s;
import week3.CountTotalNumberOfConsonants;
import week3.FibanaciiSeries;
import week3.FindAllEvenLengthBinarySequencesWithSameSumofFirstAndSecondHalfBits;
import week3.FindAllUniqueCombinations;
import week3.FindKthPermutationSequence;
import week3.FindKthPermutationSequence2;
import week3.LengthOfTheLongestSubstringWithoutAnyRepeatingCharacter;
import week3.LongestConsecutiveSequenceInaArray;
import week3.MinJumps;
import week3.NumberOfSubArraysWithGivenXorK;
import week4.GridUniquepaths;
import week4.LengthofthelongestsubarraywithzeroSum;
import week4.ModifyLinkedList;
import week4.PossibleExpressionToEvaluateTarget;
import week4.PrintAllPanlidromicSubstrings;
import week4.StockBuyandSell;
import week5.ArithmeticSlices;
import week5.DecodeString;
import week5.DifferentWaysToAddParaenthesis;
import week5.Fib;
import week5.Fibo;
import week5.JumpGame;
import week5.SwapPairs;
import week5.WildcardMatching;
import week6.CountGoodNumber;
import week6.EliminationGame;
import week6.FindIfLinkedListCyclePresent;
import week6.FindTheWinnerOfTheCircularGame;
import week6.MergeNodesinBetweenZeros;
import week6.PredicttheWinner;
import week6.RemoveDuplicatesfromSortedList;

import java.util.*;

public class Main {
	static int[] arr1;

	public static void main(String[] args){

	
		// Creating an empty HashSet
		HashSet<String> set = new HashSet<String>();

		// Use add() method to add elements into the Set
		set.add("Welcome");
		set.add("To");
		set.add("Geeks");
		set.add("4");
		set.add("Geeks");

		// Displaying the HashSet
		System.out.println("HashSet: " + set);

		// Creating a new cloned set
		HashSet cloned_set = new HashSet();

		// Cloning the set using clone() method
		cloned_set = (HashSet) set.clone();

		// Displaying the new Set after Cloning;
		System.out.println("The new set: " + cloned_set);
	}
}


