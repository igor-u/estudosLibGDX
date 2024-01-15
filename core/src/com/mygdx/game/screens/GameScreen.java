package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.SpiralGame;

public class GameScreen implements Screen {
	
	float x;
	float y;
	
	SpiralGame game;
	
	public GameScreen (SpiralGame game) {
		this.game = game;
	}
	
	public static final float SPEED = 120;

	@Override
	public void show() {

		game.img = new Texture("badlogic.jpg");
		
	}

	@Override
	public void render(float delta) {
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			y += SPEED * Gdx.graphics.getDeltaTime();
		}
		
		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			y -= SPEED * Gdx.graphics.getDeltaTime();
		}
		
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x += SPEED * Gdx.graphics.getDeltaTime();
		}
		
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			x -= SPEED * Gdx.graphics.getDeltaTime();
		}
		
		ScreenUtils.clear(1, 0, 0, 1);
		
		game.batch.begin();
		game.batch.draw(game.img, x, y);
		game.batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
