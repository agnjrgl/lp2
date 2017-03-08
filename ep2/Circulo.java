class Circulo{
	private double raio;

	public void SetR(double r){
		this.raio=r;
	}

	public double GetR(){
		return this.raio;
	}

	public double CalcularPerimetro(){
		return (2*this.raio*3.141592);
	}
	
	public double CalcularArea(){
		return(3.141592*this.raio*this.raio);
	}
}
