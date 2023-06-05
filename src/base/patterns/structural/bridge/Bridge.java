package base.patterns.structural.bridge;

public class Bridge {

    public static void main(String[] args) {

        new Circle(4, 8, 12, new LargeCircleDrawer()).draw();
        new Circle(40, 52, 86, new SmallCircleDrawer()).draw();
    }
}