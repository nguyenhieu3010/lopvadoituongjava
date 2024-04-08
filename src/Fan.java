public class Fan {
    final int SLOW = 1;// final khai báo hằng
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;//private rieng tư không đc khai báo
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5.0;
        this.color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.on) {
            return speed +" "+ color +" "+ radius + " fan in on";
        } else {
            return  color + " " +radius + " fan in off";
        }
    }
}

