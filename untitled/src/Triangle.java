import static java.lang.Math.sqrt;
public class Triangle extends Figure{
    private int length1;
    private int length2;
    private int length3;

    @Override
    public void draw() {
        super.draw();
        System.out.print("triangle ");
    }

    @Override
    public void area() {
        int halfPerimeter = length1+length2+length3;
        System.out.println(halfPerimeter*sqrt((halfPerimeter-length1)*(halfPerimeter-length2)*(halfPerimeter-length3)));
    }
}

class RegularTriangle extends Triangle {
    private int length;
    RegularTriangle (int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("(regular)");
    }

    @Override
    public void area() {
        System.out.println((length*length*sqrt(3))/4);
    }
}

class RightTriangle extends Triangle {
    private int leg1;
    private int leg2;
    RightTriangle(int l1, int l2) {
        this.leg1 = l1;
        this.leg2 = l2;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("(right)");
    }

    @Override
    public void area() {
        System.out.println((double) leg1*leg2/2);
    }
}

class  IsoscelesTriangle extends Triangle {
    private int length1;
    private int length2;
    IsoscelesTriangle (int length1, int length2) {
        this.length1 = length1;
        this.length2 = length2;
    }
    @Override
    public void draw() {
        super.draw();
        System.out.println("(isosceles)");
    }

    @Override
    public void area() {
        System.out.println(sqrt(length1*length1-((length2*length2)/4)));
    }
}