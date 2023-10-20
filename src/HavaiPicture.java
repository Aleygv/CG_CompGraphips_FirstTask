import java.awt.*;

public class HavaiPicture implements Drawable {
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public HavaiPicture(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    @Override
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        //Draw Sky
//        g2d.setColor(Color.cyan);
//        g2d.fillRect(0, 0, getWidth(), getHeight());

//        List<Drawable> objects;
//        objects.add(ocean)
        //Draw Ocean
//        Drawable ocean = new Ocean(0, getHeight() / 2 - 100, getWidth(), getHeight() - 100);
//        ocean.draw(g);

        //Draw Boat
//        g2d.setColor(Color.GRAY);
//        g2d.fillRect(500, getHeight() / 2 - 50, 100, 50);
//        g2d.setColor(Color.DARK_GRAY);
//        g2d.fillRect(550, getHeight() / 2 - 65, 10, 45);
//
//        g2d.setColor(Color.WHITE);
//        g2d.fillRect(560, getHeight() / 2 - 65, 10, 5);
//        g2d.setColor(Color.BLUE);
//        g2d.fillRect(560, getHeight() / 2 - 60, 10, 5);
//        g2d.setColor(Color.RED);
//        g2d.fillRect(560, getHeight() / 2 - 55, 10, 5);

        //Draw Sun
//        g2d.setColor(Color.yellow);
//        g2d.fillOval(getWidth() / 2 + 310, getHeight() / 2 - 280, 100, 100);

//        //Draw Beach
//        g2d.setColor(new Color(222, 184, 135));
//        g2d.fillRect(0, getHeight() / 2 + 100, getWidth(), getHeight() / 2);

        //Draw Palm Trees
//        g2d.setColor(new Color(139, 69, 19));
//        g2d.fillRect(100, getHeight() / 2 + 50, 20, 200);
//        g2d.setColor(Color.GREEN);
//        g2d.fillOval(70, getHeight() / 2 + 30, 80, 80);
//
//        g2d.setColor(new Color(139, 69, 19));
//        g2d.fillRect(250, getHeight() / 2 + 40, 20, 200);
//        g2d.setColor(Color.GREEN);
//        g2d.fillOval(220, getHeight() / 2 + 20, 80, 80);
//
//        g2d.setColor(new Color(139, 69, 19));
//        g2d.fillRect(550, getHeight() / 2 + 60, 20, 200);
//        g2d.setColor(Color.GREEN);
//        g2d.fillOval(520, getHeight() / 2 + 40, 80, 80);
    }
}
