import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(300,300); // constructor method call
    World world2 = new World();
    World world3 = new World(true);
    World world4 = new World(true);

    Turtle yertle = new Turtle(world);
    Turtle Naman = new Turtle(400,500,world2);
    Turtle pranil = new Turtle(world3);
    Turtle ashrith = new Turtle(world4);
    yertle.setName("ytertle");
    Naman.setName("Naman");
    pranil.setName("pranil");
    ashrith.setName("ashrith");
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
    Naman.setShellColor(Color.BLACK);
    ashrith.setShellColor(Color.pink);
    pranil.setShellColor(Color.blue);
    // pranil.getShellColor(naman);
    // System.out.println(yertle.getDistance(0,0));
    // Naman.polygon(50,50);
    // Naman.polygon(360, 05);
    yertle.penUp();
    Naman.penUp();
    pranil.penUp();
    ashrith.penUp();

    yertle.moveTo(200,300);
    Naman.moveTo(50, 50);
    pranil.moveTo(105,100);
    ashrith.moveTo(100,230);
    yertle.penDown();
    Naman.penDown();
    pranil.penDown();
    ashrith.penDown();
    Naman.circle(5);
    // Naman.circle(50);
    pranil.star(50);
    yertle.exp(100);
    yertle.moveTo(200,300);
    ashrith.polygon(3,50);
    System.out.println(Naman.getName() +" " + Naman.getShellColor() + "circle" + " " + Naman.getDistance(0,0));
    System.out.println(yertle.getName() +" " + yertle.getShellColor() + "circle" + " " + yertle.getDistance(0,0));
    System.out.println(pranil.getName() +" " + pranil.getShellColor() + "circle" + " " + pranil.getDistance(0,0));
    System.out.println(ashrith.getName() +" " + ashrith.getShellColor() + "circle" + " " + ashrith.getDistance(0,0));
    // System.println();
    // System.println();
    // System.println();

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
