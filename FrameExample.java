import java.awt.*;

public class FrameExample {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Frame Example");
        Button button = new Button("Click Me");
        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout()); 
        frame.setVisible(true);
    }
}
