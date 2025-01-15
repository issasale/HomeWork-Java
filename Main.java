import codewars.api.Robot;
import codewars.impl.cmd.RobotWithWorldCreation;
import static codewars.api.Rotation.*;

public class Main {
    public static void main(String[] args) {
        Robot robot = new RobotWithWorldCreation("C://Users/Eissa/OneDrive/Desktop/maps/map6.rmc");
        robot.setSpeed(9);
        while (!robot.hasObstacle()) {
            robot.move(1);
        }
        robot.rotate(LEFT);
        while (robot.totalItemsCount() > robot.collectedItemsCount()) {
            robot.rotate(RIGHT);
            while (robot.hasObstacle()) {
                robot.rotate(LEFT);
            }
            robot.rotate(LEFT);
            if (!robot.hasObstacle()) {
                int k = 0;
                while (!robot.hasObstacle()) {
                    robot.move(1);
                    
                    k++;
                }
                robot.rotate(RIGHT);
                robot.rotate(RIGHT);
                robot.move(k);
                robot.rotate(LEFT);
            } else {
                robot.rotate(RIGHT);
            }
            robot.move(1);
        }

        robot.finish();
    }
}
