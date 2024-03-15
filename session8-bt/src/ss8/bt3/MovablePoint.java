package ss8.bt3;

public class MovablePoint extends Point {
    float xSpeed = 0.0f;
    float ySpeed = 0.0f;

    public MovablePoint() {
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed() {
        return new float [] {xSpeed,ySpeed};
    }
    public MovablePoint move() {
        this.setX(getX() + getxSpeed());
        this.setY(getY() + getySpeed());
        return this;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + getX() +
                ", y=" + getY() +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
