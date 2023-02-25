package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능
        // 3. 밑줄 또는 문자로 시작
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자
        // 6. 예약어 사용 불가

        // 입국 신고서 (여행)
        String nationality = "대한민국";
        String firstName = "성우";
        String lastName = "조";
        String dateOfBirth = "2000-08-12";
        String residentialAddress = "신라호텔";  // 체류지
        String purposeOfVisit = "관광";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_no_2 = "KE657";

        int accompany = 2;  // 동반 가족 수
        int lengthOfStay = 5;   // 체류 기간

        String item1 = "시계";
        String item2 = "가방";

        // 프로그램의 흐름을 위해 사용되는 경우 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        // 상수는 대문자로
        final String CODE = "KR";
    }
}
