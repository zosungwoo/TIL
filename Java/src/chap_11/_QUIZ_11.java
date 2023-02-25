package chap_11;

public class _QUIZ_11 {
    public static void main(String[] args) {
        int errorCode = 2;
        try{
            switch (errorCode) {
                case 0:
                    System.out.println("상품 구매 완료하였습니다.");
                    break;
                case 1:
                    throw new NotSaleTimeException("상품 구매 가능 시간이 아닙니다.");
                case 2:
                    throw new SoldOutException("해당 상품은 매진되었습니다.");
            }
        } catch (NotSaleTimeException e){
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요");
        }
    }
}

class NotSaleTimeException extends Exception{
    public NotSaleTimeException(String message) {
        super(message);
    }
}

class SoldOutException extends Exception{
    public SoldOutException(String message) {
        super(message);
    }
}