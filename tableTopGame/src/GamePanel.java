import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics2D;

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

    KeyHandler keyH = new KeyHandler();
    Thread gameThread; //Used to draw screen a number of times per second

    //Set players default position
    int playerX = 100;
    int playerY = 100;
    int playerSpeed = 4;
    
    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //improve rendering preformance
        this.addKeyListener(keyH);
        this.setFocusable(true);
        

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
        if(keyH.upPressed == true){

            //subtract y to go up since y values increase at go down
            playerY = playerY - playerSpeed;
        }
        else if(keyH.downPressed == true){
            playerY += playerSpeed;
        } //X increases to right
        else if(keyH.leftPressed == true){
            playerX -= playerSpeed;
        }
        else if(keyH.rightPressed == true){
            playerX += playerSpeed;
        }

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(Color.white);

        g2.fillRect(playerX,playerY, tileSize, tileSize);

        g2.dispose();

    }

    




}
