package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    /* 실습문제 1
    길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
    순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
    짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
    */
    public void practice1() {
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");

            if (i % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("\n짝수 번째 인덱스 합 : " + sum);
    }

    /* 실습문제 2
    길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
    순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
    홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
     */
    public void practice2() {
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
            System.out.print(arr[i] + " ");

            if (i % 2 == 1) {
                sum += arr[i];
            }
        }

        System.out.println("\n홀수 번째 인덱스 합 : " + sum);
    }

    /* 실습문제 3
    사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
    1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
    */
    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 : ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

    }

    /*실습문제 4
    정수 5개를 입력 받아 배열을 초기화 하고
    검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
    배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
     */
    public void practice4() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("입력 %d : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int search = sc.nextInt();

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("인덱스 : " + i);
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("일치하는 값이 존재하지 않습니다.");
    }


    /* 실습문제 5
    문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
    개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
    ex.
    문자열 : application
    문자 : i
    application에 i가 존재하는 위치(인덱스) : 4 8
    i 개수 : 2
    */
    public void practice5() {
        // 1. 사용자에게 문자열과 문자 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = sc.nextLine();


        // 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기

        // 먼저 사용자가 입력한 문자열 길이만큼의 char배열을 할당
        char[] arr = new char[str.length()];

        // 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);

        // 3. 검색할 문자가 문자열에 몇개가 들어있는지와 어느 인덱스에 있는지 파악

        int count = 0;    // 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
        // 문자열에서 동일한 문자가 발생할 때마다 1씩 증가

        // 반복문 수행전 문자열 출력
        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

        // 인덱스마다 접근하기 위해 반복문 사용
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우
                System.out.print(i + " ");    // 해당 인덱스 이어서 출력

                count++;    // 그리고 count 1증가
            }
        }

        // 위에서 print()를 사용했기 때문에 개행이 되어있지 않음
        System.out.println();    // 줄바꿈

        System.out.println(ch + "개수 : " + count);

    }


    /* 실습문제 6
    사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
    배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
    그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
     */
    public void practice6() {
        // 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        // 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
        for (int i = 0; i < arr.length; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            arr[i] = sc.nextInt();
        }


        // 3. 전체 값 나열 및 총 합 출력
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println();
        System.out.println("총 합 : " + sum);
    }

    /* 실습문제 7
    주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
    단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
    [실행 화면]
    주민등록번호(-포함) : 123456-1234567
    123456-1******
    */
    public void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호(-포함) : ");
        String input = sc.next();

        char[] arr = new char[input.length()];

        for (int i = 0; i < arr.length; i++) {

            if (i <= 7) { // 7번 인덱스 이하(생년월일, - , 성별)
                arr[i] = input.charAt(i);
            } else { // 8번 인덱스 이상부터는 *
                arr[i] = '*';
            }
            System.out.print(arr[i]);
        }
    }

    /* 실습문제 8
    3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
    중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
    단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
    다시 정수를 받도록 하세요.
    [실행 화면]
    정수 : 4
    다시 입력하세요.
    정수 : -6
    다시 입력하세요.
    정수 : 5
    1, 2, 3, 2, 1
    */
    public void practice8() {

        Scanner sc = new Scanner(System.in);

        while (true) { // 3 이상의 수가 입력 될 때 까지 무한 반봅
            // -> 3 이상이 입력되면 break문으로 종료

            System.out.print("정수 : ");
            int input = sc.nextInt();

            if (input < 3 || input % 2 == 0) { // 3 미만 또는 짝수인 경우 -> 반복
                System.out.println("다시 입력하세요.");

            } else {
                // 입력 받은 정수 만큼의 크기를 가지는 배열 생성
                int[] arr = new int[input];

                int num = 0; // arr 배열에 대입될 값

                for (int i = 0; i < arr.length; i++) {
                    if (i <= arr.length / 2) { // 중간 이전 까지 -> 증가
                        arr[i] = ++num;

                    } else { // 중간 이후 -> 감소
                        arr[i] = --num;
                    }

                    // 출력 시 , 추가 (단, 마지막 제외)
                    if (i == arr.length - 1) { // 마지막 바퀴
                        System.out.print(arr[i]);

                    } else {
                        System.out.print(arr[i] + ", ");
                    }

                }
                break; // while 반복 멈춤
            }
        }
    }

    /* 실습문제 9
    10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
    1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
    [실행 화면]
    발생한 난수 : 9 7 6 2 5 10 7 2 9 6
    */
    public void practice9(){
        int[] arr = new int[10];

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }

        System.out.print("발생한 난수 : ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    /* 실습문제 10
    10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
    1~10 사이의 난수를 발생시켜 배열에 초기화 후
    배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
    [실행 화면]
    발생한 난수 : 5 3 2 7 4 8 6 10 9 10
    최대값 : 10
    최소값 : 2
    */
    public void practice10(){
// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
        int[] arr = new int[10];

        // 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화 후 출력
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random() * 10 + 1);

            System.out.print(arr[i] + " ");
        }

        System.out.println(); // 개행

        // 3. 반복문을 통해 최대값 최소값 알아내기
        int max = 1;  // 최소값을 담아줄 변수
        int min = 10; // 최대값을 담아줄 변수

        for(int i=0; i<arr.length; i++) {

            if(arr[i] > max) { // 해당 인덱스의 값이 max 보다 큰 경우
                max = arr[i]; // 해당 값을 max 변수에 담아줌
            }

            if(arr[i] < min) { // 해당 인덱스의  값이 min 보다 작은 경우
                min = arr[i]; // 해당 값을 min 변수에 담아줌
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }

    /* 실습문제 11
    10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
    1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
    */
    public void practice11(){
        // 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
        int[] arr = new int[10];

        // 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
        for(int i=0; i<arr.length; i++) {

            arr[i] = (int)(Math.random() * 10 + 1);

            for(int j=0; j<i; j++) { // 중복 제거
                if(arr[i] == arr[j]) {
                    i--;
                    break;
                }
            }
        }

        // 3. 출력
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /* 실습문제 12
    로또 번호 자동 생성기 프로그램을 만들기.
    (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
    [실행 화면]
    3 4 15 17 28 40
    */
    public void practice12(){
        // 1. 크기가 6인 정수형 배열 선언 및 할당
        int[] lotto = new int[6];

        // 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
        for(int i=0; i<lotto.length; i++) {
            lotto[i] = (int)(Math.random() * 45 + 1);

            for(int j=0; j<i; j++) { // 중복 제거
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }

        // 3. 오름차순 정렬(선택정렬)
        for(int i=0; i<lotto.length-1; i++) { // 비교 주체
            for(int j=i+1; j<lotto.length; j++) { // 비교 대상
                if(lotto[i] > lotto[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨

                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        // 4. 출력
        for(int i=0; i<lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }

    /* 실습문제 13
    문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
    문자의 개수와 함께 출력하세요. (중복 제거)
    [실행 화면]
    문자열 : application
    문자열에 있는 문자 : a, p, l, i, c, t, o, n
    문자 개수 : 8
    */
    public void practice13(){
        // 1. 사용자에게 문자열 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = sc.nextLine();

        // 2. 해당 문자열의 문자들을 char[]에 담기
        char[] arr = new char[str.length()];

        for(int i=0; i<arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        // 3. char배열에서 중복값 존재할 경우 출력X,
        int count = 0; // 문자 개수 카운트

        System.out.print("문자열에 있는 문자 : ");

        for(int i=0; i<arr.length; i++) {

            boolean flag = true; // 중복 체크용 flag

            for(int j=0; j<i; j++) {
                if(arr[i] == arr[j]) {
                    flag = false; // 중복이발생했을 때
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

    /* 실습문제 14
    사용자가 입력한 배열의 길이만큼의 String 배열을 선언 및 할당하고
    배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 하세요.
    단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
    늘린 곳에 어떤 데이터를 넣을 것인지 받으세요.
    사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.
     */
    public void practice14(){

        // 1. 첫 배열 크기 지정
        Scanner sc= new Scanner(System.in);

        System.out.print("배열의 크기를 입력하시오 : ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[size];

        // 2. 첫 배열에 저장할 문자열 입력 받기
        for(int i=0; i<arr.length ; i++) {
            System.out.print((i+1) + "번째 문자열 : ");
            arr[i] = sc.nextLine();
        }

        // 3. 반복이 시작되는 구간부터 무한루프로 작성하여 내부에 종료 조건을 만들어 break
        while(true) {
            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            char ch = sc.nextLine().charAt(0);

            // 4. 값을 더 입력할 경우
            if(ch == 'y' || ch == 'Y') {

                // 5. 더 입력받을 개수 입력 받기
                System.out.print("더 입력하고 싶은 개수 : ");
                int addSize = sc.nextInt();
                sc.nextLine();

                // 6. 새로 값을 입력 받을 배열 생성 --> 기존 배열 크기 + 추가 입력 개수
                String[] newArr = new String[arr.length + addSize];

                // 7. 배열 복사 + 새로운 문자열 입력 받기
                for(int i=0; i<newArr.length ; i++) {
                    if(i<arr.length) { // 인덱스의 크기가 기존 배열보다 작을 경우 기존 배열값 복사
                        newArr[i] = arr[i];
                    }else { // 인덱스의 크기가 기존 배열보다 클 경우 새로운 문자열 입력 받기
                        System.out.print((i+1) + "번째 문자열 : ");
                        newArr[i] = sc.nextLine();
                    }
                }

                // 8. 기존 배열공간을 참조하던 변수 arr에 새로운 배열 공간의 주소 newArr 대입
                arr = newArr;

            }else if(ch == 'n' || ch == 'N'){ // 9. 값을 더 입력하지 않은 경우
                break; // 반복문 종료
            }else { // 잘못 입력한 경우
                System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
            }
        }

        // 10. 배열값 모두 출력
        System.out.println(Arrays.toString(arr));
    }
}