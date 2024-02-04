package com.mygdx.game.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.ScreenUtils;
import com.mygdx.game.SpiralGame;

public class MainMenuScreen implements Screen {
	
	private static final int LOGO_WIDTH = 300;
	private static final int LOGO_Y = 500;
	private static final int LOGO_HEIGHT = 100;
	
	private static float startX;
	private static float exitX;
	private static final int START_Y = 300;
	private static final int EXIT_Y = 250;
	
	SpiralGame game;
	
	Texture spiralLogo;
	Texture startButtonActive;
	Texture startButtonInactive;
	Texture quitButtonActive;
	Texture quitButtonInactive;
	
	public MainMenuScreen(SpiralGame game) {
		this.game = game;
		spiralLogo = new Texture("spiral.png");
		startX = (SpiralGame.WIDTH - game.start.width)/2;
		exitX = (SpiralGame.WIDTH - game.exit.width)/2;
	}
	

	@Override
	public void show() {}

	@Override
	public void render(float delta) {
		ScreenUtils.clear(1, 0, 0, 1);
		Gdx.gl.glClearColor(135/255f, 206/255f, 235/255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		game.batch.draw(spiralLogo, (SpiralGame.WIDTH - LOGO_WIDTH)/2, LOGO_Y, LOGO_WIDTH, LOGO_HEIGHT);
		game.blackFont.draw(game.batch, "Start", startX, START_Y);
		game.blackFont.draw(game.batch, "Exit", exitX, EXIT_Y);
	
		if (Gdx.input.getX() < startX + game.start.width && Gdx.input.getX() > startX &&
				 SpiralGame.HEIGHT - Gdx.input.getY() < START_Y + game.start.height &&  SpiralGame.HEIGHT - Gdx.input.getY() > START_Y - 30) {
			game.whiteFont.draw(game.batch, "Start", startX, START_Y);
		}
		
		if (Gdx.input.getX() < exitX + game.exit.width && Gdx.input.getX() > exitX &&
				SpiralGame.HEIGHT - Gdx.input.getY() < EXIT_Y + game.exit.height && SpiralGame.HEIGHT - Gdx.input.getY() > EXIT_Y - 30) {
			game.whiteFont.draw(game.batch, "Exit", exitX, EXIT_Y);
		}

		game.batch.end();
	}

	@Override
	public void resize(int width, int height) {}

	@Override
	public void pause() {}

	@Override
	public void resume() {}

	@Override
	public void hide() {}

	@Override
	public void dispose() {}

}
