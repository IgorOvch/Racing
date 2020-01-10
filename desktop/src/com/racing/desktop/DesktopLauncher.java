package com.racing.desktop;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.racing.Game;

public class DesktopLauncher
{
	public static void main (String[] arg)
	{
		//TODO Сделать фуллскрин
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 1024;
        config.height = 800;
        config.title = "Super-Mega Racing";
		new LwjglApplication(new Game(config.width,config.height), config);
	}
}
