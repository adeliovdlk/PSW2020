package exerc_7_5;

public class Quadrilatero {
	private int Ax,Ay;
	private int Bx,By;
	private int Cx,Cy;
	private int Dx,Dy;
	public Quadrilatero(int ax, int ay, int bx, int by, int cx, int cy, int dx, int dy) {
		
		this.Ax = ax;
		this.Ay = ay;
		this.Bx = bx;
		this.By = by;
		this.Cx = cx;
		this.Cy = cy;
		this.Dx = dx;
		this.Dy = dy;
	}
	public int getAx() {
		return Ax;
	}
	public void setAx(int ax) {
		Ax = ax;
	}
	public int getAy() {
		return Ay;
	}
	public void setAy(int ay) {
		Ay = ay;
	}
	public int getBx() {
		return Bx;
	}
	public void setBx(int bx) {
		Bx = bx;
	}
	public int getBy() {
		return By;
	}
	public void setBy(int by) {
		By = by;
	}
	public int getCx() {
		return Cx;
	}
	public void setCx(int cx) {
		Cx = cx;
	}
	public int getCy() {
		return Cy;
	}
	public void setCy(int cy) {
		Cy = cy;
	}
	public int getDx() {
		return Dx;
	}
	public void setDx(int dx) {
		Dx = dx;
	}
	public int getDy() {
		return Dy;
	}
	public void setDy(int dy) {
		Dy = dy;
	}
	public String toString(){
		return String.format("(%d;%d)(%d;%d) (%d;%d)(%d;%d)",
				this.Ax,this.Ay, this.Bx,this.By, this.Cx,this.Cy,this.Dx,this.Dy);
		
	
	
	}	
}
