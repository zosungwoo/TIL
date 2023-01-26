package chap_07.camera;

public class Camera {  // 부모 클래스
    public String name;

    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        System.out.println(this.name + ": 사진 촬영");
    }

    public void recordVideo() {
        System.out.println(this.name + ": 동양상 녹화");
    }
}
