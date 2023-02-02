package chap_07.camera;

public final class ActionCam extends Camera{
    public final String lens; // = "광각렌즈";  (반드시 선언과 동시에 초기화 해야함)
    public ActionCam() {
        super("액션 카메라");
        this.lens = "광각렌즈";  // final 이렇게도 가능!
    }

    public final void makeVideo(){  // 오버라이딩 불가
        System.out.println(this.name + ": " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
