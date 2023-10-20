import java.awt.*;

public class Ocean implements Drawable {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final Color oceanBlue = new Color(30, 144, 255);

    Ocean(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Draw Ocean
        g2d.setColor(oceanBlue);
        g2d.fillRect(x, y, width, height);
    }
}
