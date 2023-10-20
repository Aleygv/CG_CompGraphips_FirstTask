import java.awt.*;

public class PalmTree implements Drawable{
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public PalmTree (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Draw Palm Trees
        g2d.setColor(new Color(139, 69, 19));
        g2d.fillRect(x, y, width, height);
        g2d.setColor(Color.GREEN);
        g2d.fillOval(x - 30, y - 20, width + 60, height - 120);
    }
}
