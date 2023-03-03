package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	Scanner sc = new Scanner(System.in);
	
	/* 배열(Array)
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것.(자료구조)
	 * - 묶여진 변수들은 하나의 배열명으로 불려지고 구분은 index를 이용함
	 *  (index는 0부터 시작하는 정수)
	 */
	
	public void ex1() {
		// 변수 vs 배열
		
		// 1-1. 변수 선언
		int num;
		// Stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 생성(할당)하고
		//그 공간에 num 이라는 이름을 부여.
		
		// 1-2. 변수 대입
		
		num = 10;
		//생성된 num이라는 변수 공간에 10을 대입
		
		// 1-3. 변수 사용
		System.out.println("num에 저장된 값 : " + num);
		//num이 작성된 자리에 num에 저장된 값을 읽어와서 출력
		
		//-----------------------------------------------------
		
		// 2-1. 배열 선언
		int[] arr;
		// Stack 영역에 int[] (int배열) 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소 값(4byte)만을 저장할 수 있음.
		
		// 2-2. 배열 할당
		arr = new int[3];
		// new : "new 연산자" 라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)를 할당
		// int[3] : int자료형 변수 3개를 하나의 묶음으로 나타냄
		// new int[3] : Heap 영역에 int 3칸짜리 int[]을 생성(할당)
					// ** 생성된 int[]에는 시작주소가 지정된다!!! **
		
		// 2-3. 배열 요소 값 대입
		// arr은 int[] 참조형 변수이지만
		// arr[0] int 자료형 변수이기 때문에 정수 값을 대입할 수 있다.
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		// 2-4. 배열 요소 값 읽어오기
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
	
	public void ex2() {
		//배열 선언 및 할당
		
		int[] arr = new int[4];
		// 1) stack 영역에 int[] 자료형 참조형 변수 arr 선언
		// 2) heap 영역에 int 자료형 4개 묶음으로 다루는 int[]할당
		// 3) 생성된 int[]의 주소를 arr 에 대입하여 참조하는 형태를 만듬
		
		// 배열 길이(몇 칸 인가): 배열명.length
		System.out.println("배열 길이 : " + arr.length);
		
		arr[0] = 100;
		arr[1] = 300;
		arr[2] = 500;
		arr[3] = 1000;
		
		for(int i = 0; i < arr.length; i++) {
			// 0 1 2 3
			System.out.printf("arr[%d]에 저장된 값: %d\n", i, arr[i]);
		}
		
	}
	
	public void ex3() {
		

		
		double[] height = new double[5];
		
		for(int i = 0; i < height.length; i++) {
			System.out.print((i + 1) + "번 키 입력 : ");
			height[i] = sc.nextDouble();
			// 각 인덱스에 입력받은 값을 대입(초기화
		}
				
		System.out.println(); // 줄바꿈
		
		double sum = 0; // 합계용 변수
		
		for(int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
			sum += height[i]; // 배열에 저장된 값을 sum에 누적
			// sum = sum + height[i]
		}
		
		System.out.printf("\n평균 : %.2f\n", sum / height.length);
		// [A,B,C,D,E]
	}
	
	public void ex4() {
		
		System.out.print("입력 받을 인원 수 : ");
		int input = sc.nextInt();
		
		//배열 선언 및 할당
		// 할당할 배열의 크기는 입력받은 크기만큼 (input)
		int[] score = new int[input];
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번 점수 입력: ");
			score[i] = sc.nextInt();
			
			sum += score[i];
		}
		
		// 최고 / 최저점 구하기
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i < score.length; i++)  {
			if(score[i] > max) { // 최고점 비교
				max = score[i];
			}
			if(score[i] < min) { // 최저점 비교
				min = score[i];
			}
		}
		System.out.println("합계: " + sum);
		System.out.printf("평균: %.2f\n", (double)sum / score.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
		
	}
	
	public void ex5() {
		// 배열 선언과 동시에 초기화
		char[] arr = new char[5];
		
		// char[] arr 이 참조하는 배열 요소에 A,B,C,D,E 대입하기
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = (char)('A' + i);
			// A == 65
			
		}
		
		// ** Arrays 클래스
		// -> Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		
		int[] arr2 = new int[4];
		//Array.toString(배열명) : 모든 요소 값 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		// 배열 선언과 동시에 초기화
		char[] arr3 = {'A', 'B', 'C', 'D', 'E'};
		
		// char[] 참조 변수 arr3를 선언하고
		// heap 영역에 char 5칸짜리 char[]을 생성하고
		// 각각 'A', 'B', 'C', 'D', 'E', 로 초기화 후 주소를 arr3에 대입
		
		System.out.println(Arrays.toString(arr3));
	}
	
	public void ex6() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		// flag == false: 일치하는 값이 존재하지 않음
		// flag == true: 일치하는 값이 존재
		
		boolean flag = false; // 검사 전에는 없다고 가정
		
		// arr 배열 요소 순차 접근
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == input) {
				System.out.println(i + "번째 인덱스에 존재");
				
				flag = true; // 일치하는 값이 있으므로 true로 변경
			}
		}
		
		// flag 상태를 검사
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}
	
	public void ex7() {
		//입력 받은 값과 일치 값이 있으면 인덱스 번호 출력
		// 없으면 "존재하지 않음"
		String[] arr= {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		//equals() ==> 배열명[i].equals(비교할 값)
		
		System.out.print("과일 입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(input)) {
				System.out.println(i + "번 인덱스에 존재");
				
				flag = true;
			}
			
		}
		if(!flag) {
			System.out.println("존재하지 않음");
		}
	}
	
	public void ex8() {
		
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		char[] arr = new char[input.length()]; // 공간 생성
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		
		System.out.print("검색할 문자열 입력 : ");
		char ch = sc.nextLine().charAt(0); 
							//String.charAt(0) : 문자열 제일 앞 문자
		
		int count = 0; // 같은 글자 개수 세기 위한 변수
		
		for(int i = 0; i < arr.length; i++) {			
			if(arr[i] == ch) {
				count++;				
			}			
		}
		
		if(count > 0) {
			System.out.println(count + "개 있음");
		}else {
			System.out.println("존재하지 않음");
		}
				
	}

}
