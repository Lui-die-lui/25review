package _04_TypeCasting;

public class TypeCasting {
    public static void main(String[] args) {
        //형변환 TypeCasting

        //정수에서 실수로
        int scoreInt = 98;
        System.out.println(scoreInt);
        System.out.println((float) scoreInt);// scoreInt를 실수로 바꿔줌(float 변수) = 98.0
        System.out.println((double) scoreInt);// scoreInt를 실수로 바꿔줌(double 변수) = 98.0
        System.out.println(scoreInt);// 재할당이 아닌 출력만 했기 때문에 변수에 영향 없음 = 98

        //실수에서 정수
        float scoreFloat = 97.5F;
        System.out.println(scoreFloat);
        System.out.println((int) scoreFloat);// 실수에서 정수로 형변환 = 97

        double scoreDouble = 88.5;
        System.out.println((int) scoreDouble);// 실수에서 정수로 형변환(뒷자리 떼짐) = 88

        double sum1 = 98 + 77.3;
        System.out.println(sum1); // = 175.3

        int sum2 = 98 +(int) 55.3F;// float 55.3F를 int로 형변환하면 소수점이 잘려서 55가 됨
        System.out.println(sum2);// 98 + 55 = 153 출력

        int convertedScoreInt = (int) scoreDouble; // 위 scoreDouble 값을 정수로 형 변환 -> 소수점 잘림
        System.out.println(convertedScoreInt); // 값 88 출력
        //double -> float -> long -> int (수동 형변환) 중간에 (int)가 '수동'

        double convertedScoreDouble = scoreInt; // 정수 -> 실수(double) 로 형변환
        System.out.println(convertedScoreDouble); // 98.0 값 나옴
        //정수 → 실수는 데이터 손실이 없고, 더 큰 타입이기 때문에 자동 형변환
        //int -> long -> float -> double (자동 형변환)뒤로 갈 수록 더 넓은 범위 가능

        long scoreLong = 45L;
        convertedScoreInt = (int) scoreLong;
        System.out.println(convertedScoreInt);
        //함수가 int값만 받는데 long일때 long -> int로 형변환
        //왜 쓰는지는 알아야 할거 아니야... 얼탱

        //숫자에서 문자열로
        //int(정수)에서 문자열
        String strNum1 = String.valueOf(55);// 숫자->문자열 형변환 첫번째 방법
        strNum1 = Integer.toString(55);// 이하동문 두번째 방법
        System.out.println(strNum1);

        //double에서 문자열
        String strNum2 = String.valueOf(88.37); // 실수 형태로 보이지만 사실은 문자열(string 변환)
        strNum2 = Double .toString(88.37);
        System.out.println(strNum2);

        //float에서 문자열
        String strNum3 = String.valueOf(123.45F);
        strNum3 = Float.toString(123.45F);
        System.out.println(strNum3);

        //문자열을 숫자로 "123" -> 123(int값)
        int i = Integer.parseInt("123");
        System.out.println(i); //문자열 -> int 정수 값
        double d = Double.parseDouble("123.45");
        System.out.println(d); //문자열 -> double 실수 값

       // i = Integer.parseInt("숫자");
       // System.out.println(i);






    }
}
