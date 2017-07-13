package com.marco.cheeselvl;

import com.badlogic.gdx.Game;

public class CheeseGame extends Game {

	@Override
	public void create() {
		CheeseMenu cm = new CheeseMenu(this);
		setScreen(cm);
	}

		
}
