class Quadrado{
	private double lado;

	public void setL(double l){
		this.lado=l;
	}

	public double getL(){
		return this.lado;
	}
	
	public double calcularPerimetro(){
		return (4*this.lado);
	}
	
	public double calcularArea(){
		return (this.lado*this.lado);
	}
}
