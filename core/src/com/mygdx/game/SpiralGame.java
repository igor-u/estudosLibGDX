package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.mygdx.game.screens.MainMenuScreen;

public class SpiralGame extends Game {
	
	public static final int WIDTH = 720;
	public static final int HEIGHT = 720;
	public GlyphLayout start;
	public GlyphLayout exit;
	
	public SpriteBatch batch;
	public BitmapFont blackFont;
	public BitmapFont whiteFont;
	FreeTypeFontGenerator generator;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		generator = new FreeTypeFontGenerator(Gdx.files.internal("pcsenior.ttf"));
		FreeTypeFontParameter parameter = new FreeTypeFontParameter();
		parameter.size = 24;
		blackFont = generator.generateFont(parameter);
		blackFont.setColor(Color.BLACK);
		whiteFont = generator.generateFont(parameter);
		whiteFont.setColor(Color.WHITE);
		start = new GlyphLayout(blackFont, "Start");
		exit = new GlyphLayout(blackFont, "Exit");
		this.setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		generator.dispose();
		batch.dispose();
		blackFont.dispose();
		whiteFont.dispose();
		//img.dispose();
	}
}
