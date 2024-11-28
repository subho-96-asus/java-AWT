import java.awt.*;
public class panelExample {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        panel.add(b1);
        panel.add(b2);
        frame.add(panel);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
    }
}
