package com.curranwilmot.zookeeperpartone;

public class Gorilla extends Mammal {
	
	public void throwSomething(int something) {
		for(int i = 0; i < something; i++) {
		this.energyLevel -= 5;
		System.out.println("This gorilla threw something");
		}
	}
	
	public void eatBananas(int bananas) {
		for(int i = 0; i < bananas; i++) {
		this.energyLevel += 10;
		System.out.println("This gorilla is full and satisfied");
		}
	}
	
	public void climbTree(int tree) {
		for(int i = 0; i < tree; i++) {
		this.energyLevel -= 10;
		System.out.println("This gorilla has climbed a tree");
		}
	}

}
