package com.marco.game.desktop;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.marco.cheese1.CheesePlease1;
import com.marco.cheese2.CheesePlease2;
import com.marco.cheese3.CheesePlease3;
import com.marco.cheese4.CheesePlease4;
import com.marco.cheese5.CheesePlease5;
import com.marco.cheeselvl.CheeseGame;
import com.marco.game.HelloWorldImage;

public class DesktopLauncher {
	public static void main (String[] arg) {
		
		/*
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new HelloWorldImage(), config);
		*/
		
		/*
		CheesePlease1 myProgram = new CheesePlease1();
		LwjglApplication launcher = new LwjglApplication (myProgram);
		*/
		
		/*
		CheesePlease2 myProgram = new CheesePlease2();
		LwjglApplication launcher = new LwjglApplication (myProgram);
		*/
		
		/*
        CheesePlease3 myProgram = new CheesePlease3();
        LwjglApplication launcher = new LwjglApplication( myProgram );
        */
		
		/*
        CheesePlease4 myProgram = new CheesePlease4();
        LwjglApplication launcher = new LwjglApplication( myProgram );
        */
		
		/*
        CheesePlease5 myProgram = new CheesePlease5();
        LwjglApplication launcher = new LwjglApplication( myProgram );
        */
		
        
        CheeseGame myProgram = new CheeseGame();
        LwjglApplication launcher = new LwjglApplication( myProgram );
	}
}
