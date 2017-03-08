class Quadrado{
	private double lado;

	public void SetL(double l){
		this.lado=l;
	}

	public double GetL(){
		return this.lado;
	}
	
	public double CalcularPerimetro(){
		return (4*this.lado);
	}
	
	public double CalcularArea(){
		return (this.lado*this.lado);
	}
}
