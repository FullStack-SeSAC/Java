package _02_control_satement;


import java.util.ArrayList;
import java.util.List;

public class LoopContorl {
    public static void main(String[] args)  {
        // 기본 for 문
        for (int i = 0; i <= 10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
        while 문
        - 조건식이 참일 동안 while 블럭 실행
         */
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        /*
        do-while 문
        - 적어도 한 번은 수행되는 반복문
        - while 문과 다르게 조건식이 뒤에 배치
         */
        int j = 1;
        do {
            System.out.println(j + " ");
            j++;
        } while (j <= 10);
        System.out.println();

        ///////////////////////////////////////////////////////////
        // 참고. while vs do-while
        int k = 5;

        System.out.println("while 문 시작!!");
        while(k < 5) { // 맨 처음 반복부터 조건식 결과가 false이기 때문에 루프 본문이 한번도 실행 불가
            System.out.println("k = " + k);
            k++;
        }
        System.out.println("while 문 끝!!!");

        System.out.println("do while 문 시작!!");
        do { // 조건식 검사 전에 루프 본문이 한번은 먼저 실행
            System.out.println("k = " + k);
            k++;
        } while (k < 5);
        System.out.println("do while 문 끝!!");
        // => 루프 본문이 최소한 한번은 실행되어야 할 때 사용

        ///////////////////////////////////////////////////////////
        // for-each 문(향상된 for 문)
        // - 간결성: 일반 for 문 보다 간결
        // - 오류 발생 가능성 낮음: 인덱스를 사용하지 않으니 인덱스 관려 오류 감소
        // - 순회 전용: 순차적을 접근할 때만 사용 가능
        // - 역방향 순회 불가능: 항상 처음부터 끝까지 순회
        // => 모든 요소에 대해 동일한 작업을 할 때 유리, 인덱스가 필요하거나 특정 조건에서 순회 중단 필요시 일반 for 문이나 while 문이 적합

        // case 1. 배열에 대한 for-each 문
        String[] array = {"a", "b", "c"};
        for (String a: array) {
            System.out.println("원소 = " + a);
        }
        System.out.println();

        // 참고) 일반 for 문으로 배열 순회
        // - for-each 문보다 명시적
        // - 인덱스를 사용 가능
        // - 코드가 길어짐
        for (int x = 0; x < array.length; x++) {
            String a = array[x];
            System.out.println("원소 = " + a);
        }

        // case 2. List에 대해 for-each
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for (String l : list) {
            System.out.println("l = " + l);
        }



    }
}
