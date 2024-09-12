import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

//screen for the game
public class GamePanel extends JPanel implements Runnable{
    //Screen settings
    final int originalTileSize = 16; //16 * 16 tile is used for most 2d games

    //Scale resolution so the title does not look 
    //small on modern computers
    final int scale = 3;

    final int tileSize = originalTileSize * scale;

    //4*3 max number of tiles on screen
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;

    Thread gameThread; //Used to draw screen a number of times per second
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //improve rendering preformance
        

    }

    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start(); //calls run method
    }
    //implementing runnable lets you use run method
    //where game loop comes from
    public void run(){
        while(gameThread != null){

            System.out.println("The game loop is running");
            update();
            repaint(); //call paint method with repaint.

            //1. UPDATE : Change character position
            // 2. DRAW SCREEN WITH UPDATE INFO - affected by fps
        }

    }

    public void update(){

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

    }

    




}
