package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc = new Scanner(System.in);
	
	
	public void practice1() {
		
		int sum = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
			
			if(i % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
	public void practice2() {
		
		int sum = 0;
		int[] arr = new int[9];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
			if(i % 2 == 1) {
				sum += arr[i];
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
	
	public void practice3() {
		
		System.out.print("양의 정수 : ");		
		int[] arr = new int[sc.nextInt()]; // 여기 참고!! 2개합친거
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() { // 풀이랑 너무 달라서 다시 확인
		
		int count = 0;
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("입력 " + i + " : ");
			arr[i] = sc.nextInt();			
		}
		System.out.print("검색할 값 : ");
		int input = sc.nextInt();
		for(int i = 0; i < 5; i++) {
			if(input == arr[i]) {
				System.out.println("인덱스 : " + i);
				count = arr[i];
			}
			
		}
		if(input != count) {
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}

	}
	
	public void practice5() {
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) {
				System.out.print(i + " ");
				count ++; 				
			}			
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice6() {
		
		int sum = 0;
		System.out.print("정수 : ");
		int input =sc.nextInt();
		int[] arr= new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice7() {
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.next();
		
		char[] arr = new char[input.length()];
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i <= 7) {
				arr[i] = input.charAt(i);
			} else {
				arr[i] = '*';
			}
			System.out.print(arr[i]);
		}				
	}
	
	public void practice8() {
		
		while (true) {
			
			System.out.print("정수 : ");
			int input = sc.nextInt();
			
			if (input < 3 || input % 2 == 0) {
				System.out.println("다시 입력하세요.");
			} else {
				int[] arr = new int[input];
				
				int num = 0;
				
				for(int i = 0; i < arr.length; i++) {
					if(i <= arr.length / 2) {
						arr[i] = ++num;
					} else {
						arr[i] = --num;
					}
					if (i == arr.length - 1) {
						System.out.print(arr[i]);
					} else {
						System.out.print(arr[i] + ", ");
					}
				}
				break;
			}
		}			
	}
	
	public void practice9() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);			
		}
		
		System.out.print("발생한 난수 : ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
	}
	
	public void practice10() {
		
		
		int[] arr = new int[10];		
		
		System.out.print("발생한 난수 : ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		int max = 1;
		int min = 10;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} 
			if(arr[i] < min) {
				min = arr[i];
			}
		}
				
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);		
	}
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {			
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int x = 0; x < i; x++) {
				if(arr[i] == arr[x]) {					
					i--;
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}	
	}
	
	public void practice12() {
		
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {			
			lotto[i]= (int)(Math.random() * 45 + 1);
			
			for(int x = 0; x < i; x++) {
				if(lotto[i] == lotto[x]) {					
					i--;
					break;
				}
			}
		}
		Arrays.sort(lotto); // 오름차순 정렬
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}		
	}
	
	public void practice13() { //풀이 확인
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);						
		}
		
		int count = 0; // 문자 개수 카운트
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i=0; i<arr.length; i++) {

            boolean flag = true; // 중복 체크용 flag

            for(int j=0; j<i; j++) {
                if(arr[i] == arr[j]) {
                    flag = false; // 중복이 발생했을때
                    break;
                }
            }

            if(flag) { // 중복이 발생하지 않았을 경우

                if(i == 0) {
                    System.out.print(arr[i]);
                }else {
                    System.out.print(", " + arr[i]);
                }

                count++;
            }
        }

        System.out.println();
        System.out.println("문자 개수 : " + count);
		
	}
	
	public void practice14() { //풀이 확인
		
		System.out.print("배열의 크기를 입력하세요 : ");
        int size = sc.nextInt();
        sc.nextLine(); // 개행용 = 어떤 변수에 담아주면 안됌

        String[] arr = new String[size];

        for(int i=0; i<arr.length ; i++) {
            System.out.print((i+1) + "번째 문자열 : ");
            arr[i] = sc.nextLine();
        }

        while(true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            char ch = sc.nextLine().charAt(0);

            if(ch == 'y' || ch == 'Y') {

                System.out.print("더 입력하고 싶은 개수 : ");
                int addSize = sc.nextInt();
                sc.nextLine();

                String[] newArr = new String[arr.length + addSize];

                for(int i=0; i<newArr.length ; i++) {
                    if(i<arr.length) { 
                        newArr[i] = arr[i];
                    }else {
                        System.out.print((i+1) + "번째 문자열 : ");
                        newArr[i] = sc.nextLine();
                    }
                }

                arr = newArr;

            }else if(ch == 'n' || ch == 'N'){
                break;
            }else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }
        }

        System.out.println(Arrays.toString(arr));
	}
	
}
