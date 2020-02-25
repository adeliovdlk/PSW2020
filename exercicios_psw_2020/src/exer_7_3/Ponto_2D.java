package exer_7_3;



public class Ponto_2D {
	private double x;
	private double y;
	
	public Ponto_2D() {
		this.x = 0.0;
		this.y = 0.0;
	}
	public Ponto_2D(double a, double b) {
		this.x = a;
		this.y = b;
	}
	@Override
	public Ponto_2D clone() {
		
		return new Ponto_2D(x,y);
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distancia(Ponto_2D p){
		 return Math.sqrt( (x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
	}
	@Override
	public String toString() {
		return String.format("Ponto: (%.2f, %.2f)", getX(), getY());
	}
	
}



