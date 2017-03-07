class Trapezio{
	private double base_maior;
	private double base_menor;
	private double altura;
	
	public double CalcularArea(double b1, double b2, double h){
		return((b1+b2)*h*0.5);
	}
	
	public double CalcularPerimetro(double b1, double b2, double h){   //Trapezio Isosceles
		return(b1+b2+2*(Math.sqrt(h*h+(b1-b2)*(b1-b2)*0.4)));
	}
}
