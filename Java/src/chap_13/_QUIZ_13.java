package chap_13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class _QUIZ_13 {
    public static void main(String[] args) {
        System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오. (주관식)");
        System.out.println("---------------------------------------");

        try(BufferedReader br = new BufferedReader(new FileReader("src/chap_13/_QUIZ_13_saying.txt"))){
            String question, answer;
            Scanner sc = new Scanner(System.in);
            while(true){
                question = br.readLine();
                answer = br.readLine();
                if (question == null || answer == null) {
                    break;
                }
                System.out.println("(문제) " + question);
                System.out.print("정답 입력 => ");

                if(answer.equals(sc.next())){
                    System.out.println("정답입니다!!!\n");
                }
                else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.\n");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("----------------------------------------");
        System.out.println("모든 퀴즈가 완료되었습니다.");
        System.out.println("수고하셨습니다.");
    }
}
