public class Ponto{
	private double x, y;
	
	public void setX(double x){
		this.x = x;
	}
	
	public double getX(){
		return this.x;
	}
	
	public void setY(double y){
		this.y = y;
	}
	
	public double getY(){
		return this.y;
	}
	
	public double distancia(double p1x, double p1y, double p2x, double p2y){
		double dx=p1x-p2x;	
		double dy=p1y-p2y;
		return Math.sqrt(dx*dx+dy*dy);
	}
	
	public Ponto(){
		System.out.println("Construtor1 " + this);
	}
	
	public Ponto(double x, double y){
		System.out.println("Construtor2 " + this);
		this.x=x;
		this.y=y;
	}
	
	public static void main(String[] args){	
		System.out.println("Junior");
		
		Ponto p1 = new Ponto();
		p1.setX(2);
		p1.setY(3);

		Ponto p2 = new Ponto();
		p1.setX(3);
		p1.setY(2);
		
		System.out.println(p1.distancia(p1.getX(), p1.getY(), p2.getX(), p2.getY()));
		
		Reta r1=new Reta();		
		r1.setP1(p1);
		r1.setP2(p2);
			
		p1.setX(0);
		p1.setY(0);
		
		p2.setY(1);
		p2.setX(1);
		
		System.out.println("1 Ponto=> x: "+r1.getP1().getX() +" - y: "+ r1.getP1().getY());
		System.out.println("2 Ponto=> x: "+r1.getP2().getX() +" - y: "+ r1.getP2().getY());
		
		p1.setX(2);
		p1.setY(3);
		p2.setX(3);
		p2.setY(4); 

		System.out.println("Area: " + r1.Area(p1.getX(), p1.getY(), p2.getX(), p2.getY()));
	}
}
