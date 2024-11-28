import java.awt.*;
public class scrollPaneExample {
    public static void main(String[] args) {
        Frame fm = new Frame("ScrollPane program.");
        ScrollPane sp = new ScrollPane();
        sp.add(new TextArea(30,50));
        fm.add(sp);
        fm.setSize(300,400);
        fm.setVisible(true);

    }
}
