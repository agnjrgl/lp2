class Triangulo{     //Retangulo
	private double cateto1;
	private double cateto2;

	public double CalcularArea(double b, double c){
		return(c*b*0.5);
	}
	
	public double CalcularPerimetro(double b, double c){
		return(b+c+(Math.sqrt(b*b+c*c)));
	}
}
