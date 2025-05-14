package _03_VariablesNaming;

public class VariablesNaming {
    public static void main(String[] args) {
        //변수명 짓는법
        /*
        1. 저장되는 데이터에 어울리는 이름, 직관적이고 한눈에 파악하기 쉬운 이름
        2. 밑줄(_), 문자, 숫자 사용가능 단, 숫자가 맨 앞에 올 수 없다.
        3. 한 단어 또는 2개 인상 단어를 연속
        4. 소문자로 시작하고 두번째 단어부터는 시작글자를 대문자
        * 파스칼 표기법(쌍봉낙타 표기법) => Lastname(단어 첫글자 대문자 ex)상단 package 명) - 클래스명, 파일명
        * 카멜 표기법(단봉낙타 표기법) => lastName => 변수명,메소드명
        5. 예약어 사용불가(public, static, void, int, float, ...) - 이미 java 내 사용 목적 있는것들
         */

        String fluteBrandName = "muramatsu ";
        String fluteModelType = "all gold 18k ";
        String fluteColor = "rose gold ";
        int fluteUsedYear = 10;
        int fluteModelYear = 2015;

        //상수 = 절대 변하지 않는 데이터 => 상수명 = 전부 대문자
//        String FLUTE_NUMBER = "80761"; //아직 상수 아님
        final String FLUTE_NUMBER = "80761";
//        FLUTE_NUMBER = "10013"; //상수로 지정되어 값이 바뀌지 않음

        System.out.println(fluteBrandName + fluteModelType + fluteColor + fluteUsedYear +" Year used "+ fluteModelYear + " model, the number is " + FLUTE_NUMBER);




    }
}
