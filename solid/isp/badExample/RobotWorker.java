package org.example.solid.isp.badExample;

public class RobotWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Robot working...");
    }

    @Override
    public void eat() {
        // Robots don’t eat
        throw new UnsupportedOperationException("Robot does not eat");
    }
}
