import javax.swing.*;


public class Main extends JFrame {
    public static void main(String[] args) {
        DrawingPanel dr = new DrawingPanel(800, 600);

        Sky sky = new Sky(0, 0, dr.getBACKGROUND_WIDTH(), dr.getBACKGROUND_HEIGHT());
        Ocean ocean = new Ocean(0, dr.getBACKGROUND_HEIGHT() / 2 - 100, dr.getBACKGROUND_WIDTH(), dr.getBACKGROUND_HEIGHT() - 100);
        Boat boat = new Boat(500, 300, 100, 50);
        Sun sun = new Sun(dr.getBACKGROUND_WIDTH() / 2 + 310, dr.getBACKGROUND_HEIGHT() / 2 - 280, 100, 100);
        Beach beach = new Beach(0, dr.getBACKGROUND_HEIGHT() / 2 + 100, dr.getBACKGROUND_WIDTH(), dr.getBACKGROUND_HEIGHT() / 2);
        PalmTree palmTree1 = new PalmTree(100, 350, 20, 200);
        PalmTree palmTree2 = new PalmTree(100, dr.getBACKGROUND_HEIGHT() / 2 + 50, 20, 200);
        PalmTree palmTree3 = new PalmTree(550, dr.getBACKGROUND_HEIGHT() / 2 + 60, 20, 200);
        dr.addObj(sky);
        dr.addObj(ocean);
        dr.addObj(boat);
        dr.addObj(sun);
        dr.addObj(beach);
        dr.addObj(palmTree1);
        dr.addObj(palmTree2);
        dr.addObj(palmTree3);
    }
}
