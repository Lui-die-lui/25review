package _02_DataTypes;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("hello"); // "" : 문자열
        System.out.println(123); // non : 정수

        //변수
        /*자료형 변수명 = 데이터;
        정수 - int, long
        */

        int num = 123;
        int num1; //변수 선언
        num1 = 234; //값넣고
        num1 = 456; //수정(최종)

        System.out.println("num1은" + num1);

        long l = 1_000_000_000_000L;
        //long 변수명 = 0000L->L은 long 변수 끝에 무조건 사용

        System.out.println("l은" + l);

        //실수 - float, double (실사용은 더블이 많음)
        float f = 3.14f; //float 또한 마지막에 f 붙여줘야함
        double d = 3.14123412341234; //float 보다 소수점이 더 길게 들어감
        //*부동 소수점 오류 검색해보기

        System.out.println("f는" + f);
        System.out.println("d는" + d);

        //문자 - char(캐릭터)
        char a = 'a'; //''=문자, ""=문자열
        char b = 'b';
        System.out.println('a' + 'b');
        System.out.println(a + b);
        //아스키 코드 때문에 숫자값 등장
        System.out.println("" + a + b);//""를 문자열로 인식

        //문자열 - string
        String str = "안녕하세요"; //String=참조형 자료형- / java class
        //String 은 문자열 그대로 변수명 = 변수값 을 나타내줌
        System.out.println(str);

        //논리 자료형 - boolan 참/거짓(true/false) 중 나옴
        boolean isNotEmpty;
        isNotEmpty = true;
        isNotEmpty = false;

        System.out.println(isNotEmpty);

        //(인사말)00 제 이름은 00 입니다.
        // 제 나이는 00 이고, 전공은 00입니다.
        // mbti는 00 입니다.

        String hi = "안녕하세요";
        String name = "이슬기";
        int age = 30;
        String major = "음악학과 플룻전공";
        String mbti = "entj";

        System.out.println(hi + " 제 이름은 " + name + "입니다");
        System.out.println("제 나이는 " + age +"이고, 전공은 " + major + "입니다." );
        System.out.println("mbti 는 " + mbti + "입니다.");



    }
}