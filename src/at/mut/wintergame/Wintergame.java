package at.mut.wintergame;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import at.mut.wintergame.Wintergame;


public class Wintergame extends BasicGame {

	private HTLCircle HTLCircle;
	private HTLRectangle HTLRectangle;

	
	public Wintergame(String Wintergame) {
		super(Wintergame);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public void render(GameContainer gc, Graphics g) throws SlickException {
		HTLCircle.render(g);
		HTLRectangle.render(g);
		
	}

	@Override
	public void init(GameContainer gc) throws SlickException {
		// TODO Auto-generated method stub
		this.HTLCircle = new HTLCircle(200,200,50, 50);
		this.HTLRectangle = new HTLRectangle(100,100,100,100);
		
		
		gc.setTargetFrameRate(60);
	}

	@Override
	public void update(GameContainer gc, int arg1) throws SlickException {
		// TODO Auto-generated method stub
		
		
	
		
	}
	
	

	public static void main(String[] argv) {
		try {
			AppGameContainer container = new AppGameContainer(new Wintergame("Wintergame"));
			container.setDisplayMode(800, 800, false);
			container.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
	}


}
