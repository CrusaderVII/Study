public class Main {
    public static void main(String[] args) {
        Pentagon pt1 = new Pentagon(5);
        pt1.draw();
        pt1.area();
        System.out.println("--------------");
        Hexagon hx1 = new Hexagon(5);
        hx1.draw();
        hx1.area();
        System.out.println("--------------");
        Circle cr1 = new Circle(5);
        cr1.area();
        cr1.draw();
        System.out.println("--------------");
        Oval ov1 = new Oval(5, 7);
        ov1.area();
        ov1.draw();
        Triangle defTr1 = new Triangle(2, 3, 4);
        defTr1.area();
        defTr1.draw();
        System.out.println("--------------");
        RegularTriangle regTr1 = new RegularTriangle(5);
        regTr1.area();
        regTr1.draw();
        System.out.println("--------------");
        RightTriangle rghTr1 = new RightTriangle(3, 4);
        rghTr1.area();
        rghTr1.draw();
        System.out.println("--------------");
        IsoscelesTriangle isTr1 = new IsoscelesTriangle(10, 5);
        isTr1.area();
        isTr1.draw();
    }
}