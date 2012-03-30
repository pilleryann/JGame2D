package vectors;

public class Point{
	
	protected float x,y;	
	
	public Point(){}
	
	public Point(float x,float y){
		this.x = x;
		this.y = y;
	}
	
	public Point(Point p){
		this.x = p.x;
		this.y = p.y;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}

    public boolean equals(Point p2){
    	return (Double.compare(this.x,p2.x)==0 && Double.compare(this.y,p2.y)==0);
    }

}
