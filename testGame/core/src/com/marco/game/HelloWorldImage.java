package com.marco.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class HelloWorldImage extends ApplicationAdapter {
	
	private SpriteBatch batch;
	private Texture texture;
	
	@Override
	public void create () {

		FileHandle worldFile = Gdx.files.internal("world.png");
		texture = new Texture(worldFile);
		batch = new SpriteBatch();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(texture, 192, 122);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		texture.dispose();
	}
}
