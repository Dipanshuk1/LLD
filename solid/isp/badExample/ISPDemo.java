package org.example.solid.isp.badExample;


public class ISPDemo {

    public static void main(String[] args) {

        Worker robot = new RobotWorker();
        robot.work();
        robot.eat(); // Runtime problem
    }
}
