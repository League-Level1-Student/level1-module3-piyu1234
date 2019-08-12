package _06_gridworld;
import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;


public class GridworldRunner {
public static void main(String[] args) {
World hello = new World();
hello.show();
Bug insect = new Bug();
Location place = new Location(2, 4);
hello.add(place, insect);
Bug secondinsect = new Bug();
int x = new Random().nextInt(10);
int y = new Random().nextInt(10);
Location secondplace = new Location(x, y);
hello.add(secondplace, secondinsect);
insect.setColor(new Color(0, 217, 255));
insect.setDirection(90);
Flower hi = new Flower();
Flower secondhi = new Flower();
Location thirdplace = new Location(2,5);
Location fourthplace = new Location(2,3);
hello.add(thirdplace, hi);
hello.add(fourthplace, secondhi);
for (int i = 0; i <96;  i++) {
hello.add(hello.getRandomEmptyLocation(), new Flower());
	
}









}
}
