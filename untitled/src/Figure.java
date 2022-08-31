import static java.lang.Math.sqrt;
public class Figure {
    //Methods
    public void area () {}
    public void draw () {
        System.out.print("There are a picture of ");
    }

}


class Pentagon extends Figure {
    private int length;
    Pentagon (int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("pentagon");
    }

    @Override
    public void area() {
        System.out.println(((length/2)/Math.tan(Math.toRadians(36)))*(length/2)/2*10);
    }
}

class Hexagon extends Figure {
    private int length;
    Hexagon (int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("hexagon");
    }

    @Override
    public void area() {
        System.out.println((3*sqrt(3)*length*length)/2);
    }
}

class Circle extends Figure {
    private int radius1;
    Circle (int radius) {
        this.radius1 = radius;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("circle");
    }

    @Override
    public void area() {
        System.out.println(radius1*radius1*Math.PI);
    }
}

class Oval extends Figure {
    private int radius1;
    private int radius2;
    Oval (int radius1, int radius2) {
        this.radius1 = radius1;
        this.radius2 = radius2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("oval");
    }

    @Override
    public void area() {
        System.out.println(radius1*radius2*Math.PI);
    }
}
