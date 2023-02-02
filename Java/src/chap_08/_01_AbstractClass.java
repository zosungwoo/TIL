package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화
        // 추상 클래스: 완성되지 않은 클래스
        // 추상 메소드: 추상 클래스에서만 사용 가능한, 껍데기만 있는 클래스

//        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

        Camera factoryCam2 = new FactoryCam();  // 추상클래스형으로 선언 가능!
        factoryCam2.showMainFeature();
    }
}
