package exer_7_3;



public class Linha {
	private Ponto_2D a;
	private Ponto_2D b;
	
	public Linha() {
		a = new Ponto_2D();
		b = new Ponto_2D();
	}
	
	public Linha(Ponto_2D a, Ponto_2D b) {
		this.a = new Ponto_2D(a.getX(), a.getY());
		this.b = new Ponto_2D(b.getX(), b.getY());
	}

	public Ponto_2D getA() {
		return new Ponto_2D(a.getX(), a.getY());
	}

	public void setA(Ponto_2D a) {
		this.a = new Ponto_2D(a.getX(), a.getY());
	}

	public Ponto_2D getB() {
		return new Ponto_2D(b.getX(), b.getY());
	}

	public void setB(Ponto_2D b) {
		this.b = new Ponto_2D(b.getX(), b.getY());
	}
	
	public Ponto_2D centro() {
		return new Ponto_2D((a.getX()+b.getX())/2,
				(a.getY()+b.getY())/2);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Linha outro = (Linha) obj;
		if (a == null) {
			if (outro.a != null)
				return false;
		} else if (!a.equals(outro.a))
			return false;
		if (b == null) {
			if (outro.b != null)
				return false;
		} else if (!b.equals(outro.b))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("[%s; %s]@%x", a, b, System.identityHashCode(this));
		//return "[" + a + "; " + b + "]";
	}
	
	



}
