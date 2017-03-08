class Retangulo{
	private double lado_maior;
	private double lado_menor;

	public void SetLa(double a){
		this.lado_maior=a;
	}

	public double GetLA(){
		return this.lado_maior;
	}

	public void SetLb(double b){
		this.lado_menor=b;
	}

	public double GetLb(){
		return this.lado_menor;
	}
	
	public double CalcularPerimetro(){
		return(2*lado_maior+2*lado_menor);
	}
	
	public double CalcularArea(){
		return (lado_maior*lado_menor);
	}
}
