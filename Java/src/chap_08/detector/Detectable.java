package chap_08.detector;

public interface Detectable {
    String name = "감지자";  // 기본적으로 public static final String name으로 선언됨
    void detect();  // 기본적으로 public abstract void detect()로 선언됨
}
