package com.curranwilmot.zookeeperpartone;

public class Mammal {
	//member variables
	protected int energyLevel;
	
	//constructors
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//getter
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	//setter
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//Mammal methods
	public int displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}

}
