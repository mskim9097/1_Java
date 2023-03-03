package edu.kh.array2.practice;

import java.util.Scanner;

public class Array2Practice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		
		String[][]arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
				System.out.print(arr[i][j]);				
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		
		int num = 1;
		int[][]arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		
		int num = 16;
		int[][]arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice4() { // 나중에 다시풀기@@@@@@@@@@@@@@@@@
		
		
		int[][]arr = new int[4][4];
		
		
		
		for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr[i].length ; j++) {

				if(i != 3 && j != 3) {
					arr[i][j] = (int)(Math.random() * 10 + 1);
					
					arr[i][3] += arr[i][j];
					arr[3][j] += arr[i][j];
					arr[3][3] += arr[i][j];
				}
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public void practice5() {
		
		do {
			System.out.print("행 크기 : ");
			int input1 = sc.nextInt();
			System.out.print("열 크기 : ");
			int input2 = sc.nextInt();
			
			if(input1 >= 1 && input1 <= 10 && input2 >= 1 && input2 <= 10) {				
				
				char[][] arr = new char[input1][input2];
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char)((int)(Math.random() * 26 + 1) + 64);
						System.out.print(arr[i][j] + " ");
					}System.out.println();
				}
				break;
			} else {
				System.out.println("반드시 1~10 사이의 정수를 입력해야합니다.");
			}
		} while(true);

	
		
	}
	
	public void practice6() {
		
		System.out.print("행의 크기 : ");
		int input = sc.nextInt();
		
		char[][] arr = new char[input][];
		
		for(int i = 0; i < input; i++) {
			System.out.print(i + "열의 크기 : ");
			int input2 = sc.nextInt();
			arr[i] = new char[input2];			
		}
		
		char num = 'a';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num;
				num++;
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
		
	}
	
	public void practice7() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미",
				"박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int num = 0;
		System.out.println("== 1분단 ==");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = students[num];
				num ++;
				System.out.print(arr1[i][j] + "  ");
			}System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = students[num];
				num ++;
				System.out.print(arr2[i][j] + "  ");
			}System.out.println();
		}
		
	}
	
	public void practice8() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미",
				"박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		int num = 0;
		System.out.println("== 1분단 ==");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = students[num];
				num ++;
				System.out.print(arr1[i][j] + "  ");
			}System.out.println();
		}
		System.out.println("== 2분단 ==");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = students[num];
				num ++;
				System.out.print(arr2[i][j] + "  ");
			}System.out.println();
		}
		
		System.out.println("=============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				if(input.equals(arr1[i][j])) {
					if(j % 2 ==0) {
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 왼쪽에 있습니다.", input, i + 1);
					} else {
						System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 오른쪽에 있습니다.", input, i + 1);
					}
					
				}
				
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				if(input.equals(arr2[i][j])) {
					if(j % 2 ==0) {
						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 왼쪽에 있습니다.", input, i + 1);
					} else {
						System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 오른쪽에 있습니다.", input, i + 1);
					}
					
				}
				
			}
		}
		
		
	}
	
	public void practice9() {
		
		String arr[][] = new String[6][6];
		
		System.out.print("행 인덱스 입력 : ");
		int row = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int cow = sc.nextInt();
		
		for(int x = 0; x < arr.length; x++) {
			for(int y = 0; y < arr.length; y++) {
				if(y == 0 && x != 0) {
					System.out.print(x - 1 + " ");
				} else if(y != 0 && x == 0) {
					System.out.print(y - 1 + " ");
				} else if(x - 1 == row && cow == y - 1) {
					System.out.print('X');
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
	
	public void practice10() {
		
		String arr[][] = new String[6][6];
		
		do {
			System.out.print("행 인덱스 입력 : ");
			int row = sc.nextInt();
			if(row == 99) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.print("열 인덱스 입력 : ");
				int cow = sc.nextInt();
				
				for(int x = 0; x < arr.length; x++) {
					for(int y = 0; y < arr.length; y++) {
						if(y == 0 && x != 0) {
							System.out.print(x - 1 + " ");
						} else if(y != 0 && x == 0) {
							System.out.print(y - 1 + " ");
						} else if(x - 1 == row && cow == y - 1) {
							arr[x][y] = "X ";
							System.out.print(arr[x][y]);
						} else if(arr[x][y] == "X "){
							System.out.print("X ");
						} else {
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}						
		}while(true);
		
		
		
		
	}

}
