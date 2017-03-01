public class Reta{
	private Ponto p1, p2;
	
	public void setP1(Ponto p1){
		this.p1=p1;
	}

	public void setP2(Ponto p2){
		this.p2=p2;
	}
	
	public Ponto getP1(){
		return this.p1;
	}
	
	public Ponto getP2(){
		return this.p2;
	}
	
	public double Area(double p1x, double p1y, double p2x, double p2y){
		return ((p1y+p2y)*Math.abs(p1x-p2x)/2);
	}
}
