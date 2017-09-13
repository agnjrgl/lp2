class Retangulo{
	private double lado_maior;
	private double lado_menor;

	public void setLa(double a){
		this.lado_maior=a;
	}

	public double getLA(){
		return this.lado_maior;
	}

	public void setLb(double b){
		this.lado_menor=b;
	}

	public double getLb(){
		return this.lado_menor;
	}
	
	public double calcularPerimetro(){
		return(2*lado_maior+2*lado_menor);
	}
	
	public double calcularArea(){
		return (lado_maior*lado_menor);
	}
}
