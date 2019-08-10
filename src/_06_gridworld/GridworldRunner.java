package _06_gridworld;
import java.awt.Color;

import info.gridworld.actor.Bug;
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
Location secondplace = new Location(3, 6);



}
}
