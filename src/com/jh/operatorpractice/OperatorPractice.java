package com.jh.operatorpractice;

import java.util.Scanner;

public class OperatorPractice {
	// Scanner 를 계속 사용 하기 때문에 priavte 으로 필드 변수로 선언함
	private Scanner sc;

	
	public void practice1() {
		sc = new Scanner(System.in);
		System.out.println(" =================  practice1 =============== ");
		System.out.print("정수 : " );
		int number = Integer.parseInt(sc.next());
		
		if(number <= 0) {
			System.out.println("양수가 아니다.");
		}else {
			System.out.println("양수다.");
		}
		sc.close();
	}
	
	public void practice2() {
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
//		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
		sc = new Scanner(System.in);
		System.out.println(" =================  practice2 =============== ");
		System.out.print("정수 : " );
		int number = Integer.parseInt(sc.next());
		
		if(number < 0) {
			System.out.println("음수다.");
		}else if(number == 0){
			System.out.println(" 0 이다.");
		}else {
			System.out.println("양수다.");
		}
		sc.close();
	}
	
	public void practice3() {
		// 키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
		sc = new Scanner(System.in);
		System.out.println(" =================  practice3 =============== ");
		int number = 0;
		boolean key = true;
		
		do {
			System.out.print("정수 : ");
			number = Integer.parseInt(sc.next());
			
			if(number == 0) {
				System.out.println("0 입력 하셨습니다. 다시 입력 하세요.");
			}else if(number % 2 == 0) {
				System.out.println ("짝수 입니다.");
				key = false;
			}else {
				System.out.println("홀수 입니다.");
				key = false;
			}
		}while(key == true); // 조건을 만족 하면 계속돈다는 것
		sc.close();
	}
	
	public void practice4() {
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		//인원 수와 사탕 개수를 키보드로 입력 받고 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		sc = new Scanner(System.in);
		System.out.println(" =================  practice4 =============== ");
		
		System.out.print("인원 수 : ");
		int people = Integer.parseInt(sc.next());
		
		System.out.print("인원 수 : ");
		int candies = Integer.parseInt(sc.next());
		
		int div = candies / people;
		int mod = candies % people;
		
		System.out.println("1인당 사탕 개수 : " + div);
		System.out.println("남는 사탕 개수 : " + mod);
		sc.close();
		
	}
	
	public void practice5() {
		// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요. 이 때 성별이 ‘M’이면 남학생, 
		// ‘M’이 아니면 여학생으로 출력 처리 하세요.
		
		sc = new Scanner(System.in);
		System.out.println(" =================  practice5 =============== ");
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년 (숫자만) : ");
		int grad = Integer.parseInt(sc.next());
		
		System.out.print("반 (숫자만) : ");
		int class1 = Integer.parseInt(sc.next());
		
		System.out.print("번호 (숫자만) : " );
		int num = Integer.parseInt(sc.next());
		
		System.out.print("성별 (M/F) : "); 
		char ch = sc.next().toUpperCase().charAt(0);
		// toUpperCase() 메소드는 입력한 영어 값을 다 대문자로 인식 하겠다.
		// toLowerCase() 메소드는 입력한 영어 값을 다 소문자로 인식 하겠다.
		
		
		System.out.print("성적(소수점 아래 두번째 자리 까지) : ");
		double score = sc.nextDouble();
		
//		String student = "" or student = null  초기화 가능
		String student = null;
		
		if(ch == 'M') {
			student = "남학생";
		}else if(ch == 'F') {
			student = "여학생";
		}else {
			student = "혼종";
		}
		System.out.printf("%d학년 %d반 %d번 %s%s 의 성적은 %.2f 입니다.  ", grad, class1, num, name, student, score );
		sc.close();
	}
	
	public void practice6() {
		// 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 성인(19세 초과)인지 출력하세요.
		
		sc = new Scanner(System.in);
		System.out.println(" =================  practice6 =============== ");
		
		System.out.print("나이 : ");
		int age = Integer.parseInt(sc.next());
		String str = "";
		if(age > 19) {
			str = "성인";
		}else if(age <= 13) {
			str = "어린";
		}else {
			str = "청소년";
		}
		System.out.println(str);
		sc.close();
	}
	
	public void practice7() {
//		국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
		
		sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = Integer.parseInt(sc.next());
		
		System.out.print("영어 : ");
		int eng = Integer.parseInt(sc.next());
		
		System.out.print("수학 : ");
		int math = Integer.parseInt(sc.next());
		
		int sum = kor + eng + math;
		double avg = sum / 3;
		String result = "";
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println(result);
		sc.close();
	}
	
	public void practice8() {
//		주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
//		ex.
//		주민번호를 입력하세요(- 포함) : 132456-2123456
//		여자
		sc = new Scanner(System.in);
		System.out.print("주민 번호를 입력 하세요(- 포함) : ");
		char resident = sc.nextLine().charAt(7);
		
		if(resident == '1' || resident == '3') {
			System.out.println("남자");
		}else if(resident == '2' || resident == '4') {
			System.out.println("여자");
		}else {
			System.out.println("잘못 입력 하셨습니다.");
		}
		sc.close();
	}
	public void practice9() {
//		키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고 아니면 false를 출력하세요.
//		(단, num1은 num2보다 작아야 함)
		sc = new Scanner(System.in);
		boolean key = false;
		
		System.out.print("정수1 : ");
		int iNum1 = Integer.parseInt(sc.next());
		
		System.out.print("정수2 : ");
		int iNum2 = Integer.parseInt(sc.next());
		
		
		System.out.print("입력 : ");
		int newNum = Integer.parseInt(sc.next());
		
		if((newNum <= iNum1 || newNum >= iNum2) && iNum1 < iNum2 ) {
			key = true;
		}
		System.out.println(key);
		
		boolean result = newNum <= iNum1 && newNum > iNum2;
		if(result) {
			System.out.println(result);
		}else {
			System.out.println(result);
		}
		sc.close();
		
	}
	public void practice10() {
//		3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
		sc = new Scanner(System.in);
		boolean key = false;
		System.out.print("입력1 : ");
		int frist = Integer.parseInt(sc.next());
		
		System.out.print("입력2 : ");
		int second = Integer.parseInt(sc.next());
		
		System.out.print("입력3 : ");
		int  third= Integer.parseInt(sc.next());
		
		if(frist == second && frist == third) {
			key = true;
		}
		System.out.println(key);
		sc.close();
	}
	
	public void practice11() {
//		A, B, C 사원의 연봉을 입력 받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력하고 
//		인센티브 포함 급여가 3000만원 이상이면 “3000 이상”, 미만이면 “3000 미만”을 출력하세요.
//		(A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15)
		
		sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int a = Integer.parseInt(sc.next());
		
		System.out.print("B사원의 연봉 : ");
		int b = Integer.parseInt(sc.next());
		
		System.out.print("C사원의 연봉 : ");
		int c = Integer.parseInt(sc.next());
		
		double resultA = a * 1.4;
		double resultB = b; 
		double resultC = c * 1.15;
		String st1 = "3천 이상";
		String st2 = "3천 미만";
		
		if(resultA >= 3000) {
			System.out.printf("A 사원 연봉/연봉+a : %d/%f %s \n", a,resultA,st1);
		}else {
			System.out.printf("A 사원 연봉/연봉+a : %d/%f %s \n", a,resultA,st2);
		}
		if(resultB >= 3000) {
			System.out.printf("B 사원 연봉/연봉+a : %d/%f %s \n", b,resultB,st1);
		}else {
			System.out.printf("B 사원 연봉/연봉+a : %d/%f %s \n", b,resultB,st2);
		}
		if(resultC >= 3000) {
			System.out.printf("C 사원 연봉/연봉+a : %d/%f %s \n", c,resultC,st1);
		}else {
			System.out.printf("C 사원 연봉/연봉+a : %d/%f %s \n", c,resultC,st2);
		}
	}
}
