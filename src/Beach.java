import java.awt.*;

public class Beach implements Drawable{
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Beach (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Draw Beach
        g2d.setColor(new Color(222, 184, 135));
        g2d.fillRect(x, y, width, height);
    }
}
