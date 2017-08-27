package com.usc.ai;

public class NQueen8bye8 {

	static int count = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int q1 = 0; q1 < 8 ; q1++) {
			for(int q2 = 0; q2 < 8 ; q2++) {
				for(int q3 = 0; q3 < 8 ; q3++) {
					for(int q4 = 0; q4 < 8 ; q4++) {
						for(int q5 = 0; q5 < 8 ; q5++) {
							for(int q6 = 0; q6 < 8 ; q6++) {
								for(int q7 = 0; q7 < 8 ; q7++) {
									for(int q8 = 0; q8 < 8 ; q8++) {
										check(q1,q2,q3,q4,q5,q6,q7,q8);
										}
									}
								}
							}
						}
					}
				}
			}
		}

	private static void check(int q1, int q2, int q3, int q4, int q5, int q6, int q7, int q8) {
		// TODO Auto-generated method stub
		
		int[] array = new int[8];
		array[0] = q1;
		array[1] = q2;
		array[2] = q3;
		array[3] = q4;
		array[4] = q5;
		array[5] = q6;
		array[6] = q7;
		array[7] = q8;
		
		
		
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = i+1 ; j < 8 ; j++) {
				if(array[i] == array[j]) {
					return;
				}
				int no1 = j - i;
				int no2 = array[j] - array [i];
				no1 = no1 * no1;
				no2 = no2 * no2;
				if(no1 == no2){
					return;
				}
				
			}
			
		}
		System.out.println("\nFound:" + count++);
		/*for(int i = 0 ; i < 8 ; i++) {
				System.out.print(i + "," + array[i] + "\t");
	
			}*/
		for(int i = 0 ; i < 8 ; i++) {
			for(int j = 0; j< 8 ; j++) {
				if(array[i] == j) {
					System.out.print("x ");
				}
				else {
					System.out.print("- ");
				}				
			}
			System.out.println("");
		}
		
	}

}
