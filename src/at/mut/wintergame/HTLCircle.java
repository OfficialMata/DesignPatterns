package at.mut.wintergame;

import org.newdawn.slick.Graphics;

	public class HTLCircle extends AbstractActor {
	
		private float x,y,radius;
		private float speed;
		
		
		
	public HTLCircle(float x, float y, float radius, float speed) {
			super();
			this.x = x;
			this.y = y;
			this.radius = radius;
			this.speed = speed;
		}
	
	public void render(Graphics g){
		g.drawOval(this.x, this.y,radius*2, radius*2);
		
	}
	
}
	