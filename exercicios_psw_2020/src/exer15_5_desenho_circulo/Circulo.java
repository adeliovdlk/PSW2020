package exer15_5_desenho_circulo;

public class Circulo {
		private int originX, originY;
		private int radiusX, radiusY;
		private int radius;
		
		public int getRadius() {
			return radius;
		}


		public void setRadius(int radius) {
			this.radius = radius;
		}


		public int getOriginX() {
			return originX;
		}
		
		
		public void setOriginX(int originX) {
			this.originX = originX;
		}
		
		public int getOriginY() {
			return originY;
		}
		
		public void setOriginY(int originY) {
			this.originY = originY;
		}
		
		public int getRadiusX() {
			return radiusX;
		}
		
		public void setRadiusX(int radiusX) {
			this.radiusX = radiusX;
		}
		
		public int getRadiusY() {
			return radiusY;
		}
		
		public void setRadiusY(int radiusY) {
			this.radiusY = radiusY;
		}
		
		public void calcRadius() {
			int x = Math.abs(originX - radiusX);
			int y = Math.abs(originY - radiusY);
			
			radius = (int) Math.abs(Math.sqrt((x*x) + (y*y)));
		}
		
		Circulo(){
			this.originX = 0;
			this.originY = 0;
			this.radiusX = 0;
			this.radiusY = 0;
		}
		

}
