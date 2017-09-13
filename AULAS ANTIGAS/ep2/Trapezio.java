class Trapezio{
	private double base_maior;
	private double base_menor;
	private double altura;

	public void setBa(double a){
		this.base_maior=a;
	}

	public double getBa(){
		return this.base_maior;
	}

	public void setBb(double b){
		this.base_menor=b;
	}

	public double getBb(){
		return this.base_menor;
	}

	public void setH(double h){
		this.altura=h;
	}

	public double getH(){
		return this.altura;
	}
	
	public double calcularArea(){
		return((base_maior+base_menor)*altura*0.5);
	}
	
	public double calcularPerimetro(){   //Trapezio Isosceles
		return(base_maior+base_menor+2*(Math.sqrt(altura*altura+(base_maior-base_menor)*(base_maior-base_menor)*0.4)));
	}
}
