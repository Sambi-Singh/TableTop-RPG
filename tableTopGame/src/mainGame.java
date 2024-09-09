import javax.swing.JFrame;

public class mainGame {
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("First Fantasy");
        
        window.setLocationRelativeTo(null); //null places window at screen center
        window.setVisible(true);
    }
}
