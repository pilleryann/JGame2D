package vectors;

import java.awt.Graphics;


public class Line2D implements Move, Scale, Rotate, Normalize{
	
	private Point anchor = null;
	private Vector2D director = null;
	private float scalar = 1;
	
	
	public Line2D(Point anchor, Vector2D director, float scalar){
		this.anchor = new Point(anchor);
		this.director = new Vector2D(director);
		this.scalar = scalar;
	}
	
	public Line2D(Point p1, Point p2){
		this.anchor = new Point(p1);
		this.director = new Vector2D(p2.x-p1.x,p2.y-p1.y);
	}
	
	public double getLenght(){
		return this.scalar;
	}


	@Override
	public void rotate(float radian) {
		this.director.x = (float) (this.director.x*Math.cos(radian)-this.director.y*Math.sin(radian));
		this.director.y = (float) (this.director.y*Math.cos(radian)+this.director.x*Math.sin(radian));
	}


	@Override
	public void scale(float scalar) {
		this.scalar = scalar;
	}


	@Override
	public void setLocation(Point p) {
		this.anchor.x = p.x;
		this.anchor.y = p.y;
	}


	@Override
	public void move(Vector2D v) {
		this.anchor.x += v.x;
		this.anchor.y += v.y;
	}

	@Override
	public void normalize() {
		this.scalar = 1;
	}

}
