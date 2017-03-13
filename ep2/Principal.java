class Principal{
	public static void main(String[] args){	
		Quadrado quadrado1=new Quadrado();
		quadrado1.setL(3);
		System.out.println("Area: " + quadrado1.calcularArea() + " e Perimetro: " + quadrado1.calcularPerimetro());
	}
}
