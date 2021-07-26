public class Circle {
    int diameter;
    int speed;
    float x;
    float y;
    CircleActions actions;


    public Circle(int diameter, int speed, float x, float y, CircleActions circleActions) {
        this.diameter = diameter;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.actions = circleActions;
    }


   public void plotCircle(){
        actions.drawShape(this);
   }

}
