class Trapezio{
	private double base_maior;
	private double base_menor;
	private double altura;

	public void SetBa(double a){
		this.base_maior=a;
	}

	public double GetBa(){
		return this.base_maior;
	}

	public void SetBb(double b){
		this.base_menor=b;
	}

	public double GetBb(){
		return this.base_menor;
	}

	public void SetH(double h){
		this.altura=h;
	}

	public double GetH(){
		return this.altura;
	}
	
	public double CalcularArea(){
		return((base_maior+base_menor)*altura*0.5);
	}
	
	public double CalcularPerimetro(){   //Trapezio Isosceles
		return(base_maior+base_menor+2*(Math.sqrt(altura*altura+(base_maior-base_menor)*(base_maior-base_menor)*0.4)));
	}
}
