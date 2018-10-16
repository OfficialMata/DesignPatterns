package at.mut.wintergame;

import org.newdawn.slick.Graphics;

public class HTLRectangle extends AbstractActor{
	private float x,y;
	private float width,height;
	
	
	public HTLRectangle(float x, float y, float width, float height) {
			super();
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}


	public void render(Graphics g){
		g.drawRect(this.x, this.y, this.width, this.height);
		
	}
	
}

