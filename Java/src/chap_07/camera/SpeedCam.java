package chap_07.camera;

// SpeedyCam is a camera (IS-A 관계)
public class SpeedCam extends Camera{
//    public String name;

    public SpeedCam() {
        super("과속단속 카메라");
    }

//    public void takePicture(){
//        System.out.println("사진 촬영");
//    }
//
//    public void recordVideo() {
//        System.out.println("동양상 녹화");
//    }
    public void takePicture() {
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }
    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        System.out.println("번호판을 인식합니다.");
    }

    @Override  // annotation
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 속도 측정, 번호 인식");
    }
}
