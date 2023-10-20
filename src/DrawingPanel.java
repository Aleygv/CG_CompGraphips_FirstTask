import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DrawingPanel extends JFrame {

    private int BACKGROUND_WIDTH;
    private int BACKGROUND_HEIGHT ;
    List<Drawable> picture = new ArrayList<>();

    public int getBACKGROUND_WIDTH() {
        return BACKGROUND_WIDTH;
    }

    public int getBACKGROUND_HEIGHT() {
        return BACKGROUND_HEIGHT;
    }

    public DrawingPanel(int BACKGROUND_WIDTH, int BACKGROUND_HEIGHT) {
        this.BACKGROUND_HEIGHT = BACKGROUND_HEIGHT;
        this.BACKGROUND_WIDTH = BACKGROUND_WIDTH;
        setTitle(" Drawing panel ");
        setSize(BACKGROUND_WIDTH, BACKGROUND_HEIGHT);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void addObj(Drawable obj)
    {
        picture.add(obj);
    }

    @Override
    public void paint(Graphics g) {
        for (Drawable object : picture) {
            object.draw(g);
        }
    }
}
