package chap_08.camera;

import chap_08.detector.AccidentDetector;
import chap_08.detector.Detectable;
import chap_08.reporter.Reportable;
import chap_08.reporter.VideoReporter;

public class SpeedCam extends Camera implements Detectable, Reportable {
    Detectable detector;
    Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
