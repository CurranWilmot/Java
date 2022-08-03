package com.curranwilmot.zookeeperparttwo;
import com.curranwilmot.zookeeperpartone.Mammal;

public class GiantBat extends Mammal{
	
	//constructors
	public GiantBat() {
		this.energyLevel = 300;
	}
	
	public GiantBat(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//GiantBat methods
	public void fly(int flights) {
		for(int i = 0; i < flights; i++) {
			this.energyLevel -= 50;
			System.out.println("OH GOD IT'S FLYING!!! RUN!!!");
			}
	}
	
	public void eatHumans(int humans) {
		for(int i = 0; i < humans; i++) {
		this.energyLevel += 25;
		System.out.println("HELP!!! IT'S GOT MY AUAGHAGHH!...");
		}
	}
	
	public void attackTown(int towns) {
		for(int i = 0; i < towns; i++) {
		this.energyLevel -= 100;
		System.out.println("IT'S DESTROYING THE VILLAGE!!! USE THE BAT SIGNAL!!!");
		}
	}
	
}
