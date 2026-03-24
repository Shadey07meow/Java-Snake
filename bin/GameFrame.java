import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;

public class GameFrame extends JFrame()
{
    public GameFrame(int xSize, int ySize)
    {
        setSize(xSize, ySize);
        setTitle("Snake Game");
        setDefaultClsoeOperation(JFrame.CLOSE_ON_EXIT);
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);

        add(mainPanel);

    }
    
}