package chap_07.camera;

// FactoryCam is a camera (IS-A 관계)
public class FactoryCam extends Camera {
//    public String name;

    public FactoryCam() {
        super("공장 카메라");
    }

//    public void takePicture(){
//        System.out.println("사진 촬영");
//    }
//
//    public void recordVideo() {
//        System.out.println("동양상 녹화");
//    }

    public void recordVideo() {
        super.recordVideo();
        detectFire();
    }

    public void detectFire() {
        System.out.println("화재를 감지합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능: 화재 감지");
    }
}
