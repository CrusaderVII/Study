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
        System.out.println(((length/2)/Math.tan(36))*(length/2)/2*10);
    }
}

