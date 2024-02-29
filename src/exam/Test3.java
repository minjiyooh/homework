package exam;

import java.util.Scanner;

//2자리 숫자를 입력받아서, 입력받은 숫자를 거꾸로 1이될때까지 출력하되,
//한줄에 5개씩 출력하는 프로그램을 만드시오.
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su, cnt=0; // 생각! 수 하나를 입력받아야하니까 su 카운트해야하니까 cnt
		
		System.out.print("두 자리수를 입력하세요? ");
		su = sc.nextInt();
		
		
		while(su >= 1) {
			System.out.print(su + " ");
			su--;
			cnt ++;
			if(cnt % 5 == 0) System.out.println();
		}
		
		sc.close();
	}
}
