/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author keonj9218
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create a robot
        RobotSE jimmy = new RobotSE(kw, 4, 0, Direction.EAST);
        //creating the walls
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        //creating things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        //moving jimmy
        jimmy.move();
        //picking up thing
        jimmy.pickThing();
        //going up the staircase
        jimmy.turnLeft();
        jimmy.move();
        jimmy.turnRight();
        //repeat
        jimmy.move();
        jimmy.pickThing();
        jimmy.turnLeft();
        jimmy.move();
        jimmy.turnRight();
        //repeat
        jimmy.move();
        jimmy.pickThing();
        jimmy.turnLeft();
        jimmy.move();
        jimmy.turnRight();
        //repeat
        jimmy.move();
        jimmy.pickThing();

        //move and drop things going down the staircase
        jimmy.move();
        jimmy.putThing();
        //climb down the staircase then put down thing
        jimmy.move();
        jimmy.turnRight();
        jimmy.move();
        jimmy.turnLeft();
        jimmy.putThing();
        //repeat
        jimmy.move();
        jimmy.turnRight();
        jimmy.move();
        jimmy.turnLeft();
        jimmy.putThing();
        //repeat
        jimmy.move();
        jimmy.turnRight();
        jimmy.move();
        jimmy.turnLeft();
        jimmy.putThing();
        //move jimmy
        jimmy.move();



    }
}
