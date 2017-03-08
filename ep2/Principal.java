class Principal{
	public static void main(String[] args){	
		FigurasGeometricas quadrado1=new Quadrado();
		quadrado1.SetL(3);
		System.out.println("Area: " + quadrado1.CalcularArea() + " e Perimetro: " + quadrado1.CalcularPerimetro());
	}
}
