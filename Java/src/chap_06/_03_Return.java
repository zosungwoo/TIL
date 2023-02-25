package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    public static void main(String[] args) {
        String contactNumber =  getPhoneNumber();
        System.out.println("호텔 전화번호: " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소: " + getAddress());
    }
}
