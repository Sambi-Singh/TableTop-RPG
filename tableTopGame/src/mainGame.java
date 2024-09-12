import javax.swing.JFrame;

//ended tutorial at 5:45 Game Loop and Key Input - Sept 12, 2024
public class mainGame {
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setTitle("First Fantasy");
        
        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack(); //size window to fit gamPanel setting size

        window.setLocationRelativeTo(null); //null places window at screen center
        window.setVisible(true);

        gamePanel.startGameThread();
    }
}
