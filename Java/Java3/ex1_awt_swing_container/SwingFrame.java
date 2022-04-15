import javax.swing.JFrame;
public class SwingFrame{
    public static void main(String[] args){
        JFrame frame = new JFrame("SwingFrame");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}