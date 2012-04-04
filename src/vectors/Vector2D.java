package vectors;

public class Vector2D extends Point implements Scale, Normalize{

	public Vector2D(float x,float y){
		this.x = x;
		this.y = y;
	}
	
	public Vector2D(Vector2D v){
		this.x = v.x;
		this.y = v.y;
	}
	
	public double getNorm(){
		
		return Math.sqrt(x*x+y*y);
	}

	@Override
	public void scale(float scalar) {
		this.x*=scalar;
		this.y*=scalar;
	}

	@Override
	public void normalize() {
		double norm = getNorm();
		this.x/=norm;
		this.y/=norm;
	}
	
	

}
