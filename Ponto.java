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
		p1.setX(0);
		p1.setY(0);
		Ponto p2 = new Ponto();
		p1.setX(1);
		p1.setY(1);
			
		double dx=p1.getX()-p2.getX();	
		double dy=p1.getY()-p2.getY();
		double distancia=Math.sqrt(Math.pow(dx, 2)+Math.pow(dy, 2));
		System.out.println(distancia);
	}
}
