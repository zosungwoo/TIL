package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try{
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
//            System.out.println("택시에 탑승한다.");
        } catch (Exception e){
            System.out.println("문제 발생: " + e.getMessage());
        } finally {  // 무조건 실행되는 구문 (파일 처리 시 파일을 닫는 작업 등을 해줄 수 있음)
            System.out.println("택시의 문을 닫는다.");
        }

        // try + catch
        // try + catch + finally
        // try + finally
        System.out.println("------------------");

        try{
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
