import java.awt.*;

public class Boat implements Drawable {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    public Boat (int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Draw Boat
        g2d.setColor(Color.GRAY);
        g2d.fillRect(x, y, width, height);
        g2d.setColor(Color.DARK_GRAY);
        g2d.fillRect(x + 50, y - 15, width - 90, height - 5);

        g2d.setColor(Color.WHITE);
        g2d.fillRect(x + 60, y - 15, width - 90, height - 45);
        g2d.setColor(Color.BLUE);
        g2d.fillRect(x + 60, y - 10, width - 90, height - 45);
        g2d.setColor(Color.RED);
        g2d.fillRect(x + 60, y - 5, width - 90, height - 45);
    }
}
