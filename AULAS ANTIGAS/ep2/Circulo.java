class Circulo{
	private double raio;

	public void setR(double r){
		this.raio=r;
	}

	public double getR(){
		return this.raio;
	}

	public double calcularPerimetro(){
		return (2*this.raio*3.141592);
	}
	
	public double calcularArea(){
		return(3.141592*this.raio*this.raio);
	}
}
