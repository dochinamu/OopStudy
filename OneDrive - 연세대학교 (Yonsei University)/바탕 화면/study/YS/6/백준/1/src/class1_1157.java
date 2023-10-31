import java.util.Scanner;

public class class1_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        숫자가 입력될 것이나, String으로 받아도 무방(대문자 통일 목적)
        String n = sc.next();
//        대문자 통일
        n = n.toUpperCase();

        int max = 0;
//      지역 변수 사용 전엔 반드시 초기화!
        int maxIndex = 0;
        int[] arr = new int[26];

        for (int i = 0; i < n.length(); i++) {
//            대박 혁신적! charAt(i) - 'A'를 하면 0~25까지의 index를 얻을 수 있다.
            arr[n.charAt(i) - 'A']++;
        }

        for (int i=0; i< arr.length; i++) {
            if (arr[i] > max) {
//                최대값 그 잡채면 maxIndex를 i로 초기화
                max = arr[i];
                maxIndex = i;
            } else if (arr[i] == max) {
//                최대값이 여러 개면, maxIndex를 -1로 초기화(출력할 때 '?'로 출력하기 위함)
                maxIndex = -1;
            }
        }

        if (maxIndex == -1) {
            System.out.println("?");
        } else {
            System.out.println((char)(maxIndex + 'A'));
        }
    }
}
