package chap_07.camera;

public class SpeedCam extends Camera{
//    public String name;

    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

//    public void takePicture(){
//        System.out.println("사진 촬영");
//    }
//
//    public void recordVideo() {
//        System.out.println("동양상 녹화");
//    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("번호판을 인식합니다.");
    }

}
