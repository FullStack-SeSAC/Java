package _02_control_satement;

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


    }
}
