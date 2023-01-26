package chap_07.camera;

public class FactoryCam extends Camera {
//    public String name;

    public FactoryCam() {
        this.name = "공장 카메라";
    }

//    public void takePicture(){
//        System.out.println("사진 촬영");
//    }
//
//    public void recordVideo() {
//        System.out.println("동양상 녹화");
//    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }
}
