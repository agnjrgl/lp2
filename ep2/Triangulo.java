class Triangulo{                                //Retangulo
	private double cateto1;
	private double cateto2;

	public void setC1(double a){
		this.cateto1=a;
	}

	public double getC1(){
		return this.cateto1;
	}

	public void setC2(double b){
		this.cateto2=b;
	}

	public double getC2(){
		return this.cateto2;
	}

	public double calcularArea(){
		return(cateto1*cateto2*0.5);
	}
	
	public double calcularPerimetro(){
		return(cateto1+cateto2+(Math.sqrt(cateto1*cateto1+cateto2*cateto2)));
	}
}
