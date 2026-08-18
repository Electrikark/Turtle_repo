import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300); // constructor method call
    World world2 = new World();
    World world3 = new World(true);
    Turtle yertle = new Turtle(world);
    Turtle Naman = new Turtle(400,500,world2);
    Turtle pranil = new Turtle(world3);
    // // Add your code here
    // yertle.forward();
    // yertle.turnRight();
    // yertle.forward();

    // Naman.forward();
    // Naman.turnRight();
    // Naman.forward();
    // pranil.forward();
    // pranil.turnRight();
    // pranil.forward();
    // Naman.turnLeft();
    // Naman.turnToFace(yertle);
    yertle.setShellColor(Color.magenta);
    // pranil.getShellColor(naman);
    System.out.println(yertle.getDistance(0,0));
    Naman.polygon(50,50);
    // Naman.polygon(360, 05);
    Naman.circle(5);
    // Naman.circle(50);
    pranil.star(50);
    yertle.exp(100);
    // //world.setVisible(true);

    // World world2 = new World(true);
   
     
    // Turtle yertle2 = new Turtle(world2);
    // // Add your code here
    // yertle2.forward();
    // yertle2.turnRight();
    // yertle2.forward();

  
    //world.setVisible(true);
  }
}
