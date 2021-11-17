package com.qa.solid.interfaceseg;

import com.qa.solid.interfaceseg.interfaces.EggLayingCreature;
import com.qa.solid.interfaceseg.interfaces.ExtinctCreature;

public class Dodo extends Bird implements EggLayingCreature, ExtinctCreature {

	public Dodo(int initialEggCount) {
		this.setNumberOfEggs(initialEggCount);
	}

	@Override
	public void goExtinct() {
		this.setCurrentLocation("in a museum");
	}

	@Override
	public void layEggs() {
		this.setNumberOfEggs(getNumberOfEggs() + 1);
	}

}
