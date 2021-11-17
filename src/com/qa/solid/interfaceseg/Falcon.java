package com.qa.solid.interfaceseg;

import com.qa.solid.interfaceseg.interfaces.EggLayingCreature;
import com.qa.solid.interfaceseg.interfaces.FlyingCreature;

public class Falcon extends Bird implements FlyingCreature, EggLayingCreature {

	public Falcon(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);
	}

	@Override
	public void fly() {
		this.setCurrentLocation("soaring above the clouds");
	}

}
