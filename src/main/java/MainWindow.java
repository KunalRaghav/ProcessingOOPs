import processing.core.PApplet;

public class MainWindow extends PApplet implements CircleActions {

    public static final int WIDTH = 720;
    public static final int HEIGHT = 540;
    public static final int Diameter = 20;
    public Circle circleOne = new Circle(Diameter,1,0,HEIGHT/5f, this);
    public Circle circleTwo = new Circle(Diameter,2,0,HEIGHT/5f*2, this);
    public Circle circleThree = new Circle(Diameter,3,0,HEIGHT/5f*3, this);
    public Circle circleFour = new Circle(Diameter,4,0,HEIGHT/5f*4, this);

    public static void main(String[] args) {
        PApplet.main("MainWindow", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        circleOne.plotCircle();
        circleTwo.plotCircle();
        circleThree.plotCircle();
        circleFour.plotCircle();
    }


    @Override
    public void drawShape(Circle circle) {
        ellipse(circle.x, circle.y, circle.diameter, circle.diameter);
        circle.x += circle.speed;
    }
}
