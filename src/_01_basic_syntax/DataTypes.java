package _01_basic_syntax;

//  Primitive Type (기본형)
// - 사용되기 전에 선언되어야 함
// - OS에 따라 자료형 길이가 변하지 않는다
// - "비객체" 타입 => Null 값 소유 불가(Null도 객체 취급)

//  Reference Type (참조형)
// - java.lang.Object 클래스를 상속받음
// - 기본형이 아니면 모두 참조형

public class DataTypes {
    public static void main(String[] args) {
        // Primitive Type (기본형)
        System.out.println("==== Primitive Type ====");

        //  정수형 변수 선언
        int x = 10; // 32bit
        long y = 1000000000L; // 64bit, long타입은 뒤에 'L'이나 'l' 붙여야함
        short z = 32767; // 16bit
        byte b =127; // 8bit

        // 실수형 변수 선언
        float a = 3.14F; // 32bit, float 타입은 'F' 혹은 'f' 를 붙여야 함
        double c = 2.71828; // 64bit

        // 문자형 변수 선언
        char ch = 'A'; // 작은 따옴표 사용

        // 논리형 변수
        boolean bool = true;

        // 변수 출력
        System.out.println("정수형 변수: " + x + ", " + y + ", " + z + ", " + b);
        
        System.out.println("실수형 변수: " + a + ", " + c);
        System.out.println("문자형 변수: " + ch);
        System.out.println("논리형 변수: " + ch);
    }
}