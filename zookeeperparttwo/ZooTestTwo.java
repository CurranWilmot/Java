package com.curranwilmot.zookeeperparttwo;

public class ZooTestTwo {
	public static void main(String[] args) {
		GiantBat binky = new GiantBat();
		binky.attackTown(3);
		binky.displayEnergy();
		binky.eatHumans(2);
		binky.displayEnergy();
		binky.fly(2);
		binky.displayEnergy();
	}
}
