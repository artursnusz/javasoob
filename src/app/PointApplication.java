package app;

import controller.PointController;
import data.Point;

public class PointApplication {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        PointController pc = new PointController();


        System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
        System.out.println(p1);
        p1 = new Point(11, 20);
        System.out.println("Punkt: (" + p1.getX()+";"+p1.getY()+")");
        System.out.println(p1);
        pc.addX(p1);
        System.out.println(p1.getX());

    }
}