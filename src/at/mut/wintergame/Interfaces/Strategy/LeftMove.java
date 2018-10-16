package at.mut.wintergame.Interfaces.Strategy;

import at.mut.wintergame.Interfaces.MoveStrategy;

public class LeftMove implements MoveStrategy{
	private float x,y;

	public LeftMove(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	
	public void update(){
		this.x--;
	}
	
	
}
