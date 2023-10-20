import java.awt.*;

public class Sun implements Drawable{
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Sun (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Draw Sun
        g2d.setColor(Color.yellow);
        g2d.fillOval(x, y, width, height);
    }


}
