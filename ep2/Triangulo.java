class Triangulo{                                //Retangulo
	private double cateto1;
	private double cateto2;

	public void SetC1(double a){
		this.cateto1=a;
	}

	public double GetC1(){
		return this.cateto1;
	}

	public void SetC2(double b){
		this.cateto2=b;
	}

	public double GetC2(){
		return this.cateto2;
	}

	public double CalcularArea(){
		return(cateto1*cateto2*0.5);
	}
	
	public double CalcularPerimetro(){
		return(cateto1+cateto2+(Math.sqrt(cateto1*cateto1+cateto2*cateto2)));
	}
}
