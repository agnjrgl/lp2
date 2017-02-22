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
	
	public static void main(String[] args){	
		System.out.println("Junior");
		
		Ponto p1 = new Ponto();
		p1.setX(10.0);
		p1.setY(20.0);
		
		Ponto p2 = new Ponto();
		p2.setY(30.0);
		p2.setX(15.0);
		
		System.out.println(p1.getX() + " - " + p1.getY());		
		System.out.println(p2.getX() + " - " + p2.getY());		
		System.out.println();
		
		Ponto p3=p1;
		
		System.out.println(p1.getX() + " - " + p1.getY());		
		System.out.println(p2.getX() + " - " + p2.getY());	
		System.out.println(p3.getX() + " - " + p3.getY());		
	}
}
