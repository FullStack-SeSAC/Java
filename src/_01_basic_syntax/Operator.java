package _01_basic_syntax;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a, b;

        x = 10;
        y = 20;
        a = 5.0f;
        b = 10.0f;

        System.out.println("==== x, y ====");
        // 산술 연산자: 숫자형 데이터에 대해서 산술 연상 가능

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));

        System.out.println("==== a, b ====");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 증가, 감소 연산자
        System.out.println("==== 증감연산자 ====");
        System.out.println("x++ = x++ + ' ' + x"); // 후위증가
        System.out.println("++x = " + ++x); // 전위 증가
        System.out.println("x-- = " + x-- + ' ' + x); // 후위 감소
        System.out.println("x-- = " + x-- + ' ' + x); // 후위 감소2
        System.out.println("--x = " + --x); // 전위 증가

    }
}

