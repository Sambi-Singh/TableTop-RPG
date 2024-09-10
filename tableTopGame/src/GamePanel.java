import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;

//screen for the game
public class GamePanel extends JPanel{
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

    public GamePanel(){
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //improve rendering preformance
        

    }
    //left off at around the 6 min mark on ryi snow video part 1

    




}
