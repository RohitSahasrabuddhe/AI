package com.usc.ai;
import java.util.Scanner;

public class NPuzzleSolvabilityChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		int puzzleBox[][];
		int puzzleArray[];
		int blankSpaceRowLocation = 0;
		
		System.out.println("Enter the value of N for N-Puzzle Problem:");
		
		n = scan.nextInt();
		
		puzzleBox = new int[n][n];
		puzzleArray = new int[n*n-1];
		int index = 0;
		for (int i = 0 ; i <n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				puzzleBox[i][j] = scan.nextInt();
				if(puzzleBox[i][j] != 0) {
					puzzleArray[index++] = puzzleBox[i][j];
				}
				else {
					blankSpaceRowLocation = i;
				}
				
			}
		}
		System.out.println("The puzzle is as follows");
		for (int i = 0 ; i <n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(puzzleBox[i][j] == 0) {
					System.out.print("-"+"\t");
				}
				else {
					System.out.print(puzzleBox[i][j]+"\t");
				}
				}
			System.out.print("\n");
		}
		
		/*for (int i = 0 ; i <puzzleArray.length ; i++) {
			System.out.print(puzzleArray[i]+"  ");
		}*/
		
		solvabilityChecker(puzzleArray, n, blankSpaceRowLocation);
		
		scan.close();

	}
	
	public static void solvabilityChecker(int puzzleArray[], int n, int blankSpaceRowLocation) {
		int count = inversionCount(puzzleArray);
		System.out.println("count is"+count);
		
		if(n%2 == 0){
			//even
			if((n-blankSpaceRowLocation%2) == 0 && count%2 != 0) {
				System.out.println("1.Puzzle is solvable");
			}
			if((n-blankSpaceRowLocation%2) != 0 && count%2 == 0) {
				System.out.println("1.Puzzle is solvable");
			}
			
		}
		else{
			//odd
			if(count%2 == 0) {
				System.out.println("Puzzle is solvable");
			}
		}
		
	}
	
	public static int inversionCount(int[] puzzleArray) {
		int inversionCount = 0;
		for(int i = 0; i < puzzleArray.length ; i++) {
			for(int j = i+1 ; j < puzzleArray.length ; j++) {
				if(puzzleArray[j] < puzzleArray[i]) {
					inversionCount++;
				}
			}
		}
		
		return inversionCount;
	}

}
