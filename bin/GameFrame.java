import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

public class GameFrame extends JFrame
{
    public GameFrame(int xSize, int ySize)
    {
        setSize(xSize, ySize);
        setTitle("Snake Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);

        add(mainPanel);

    }
    
}