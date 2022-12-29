public class Quadrado extends FormaBidimensional{
	private double lado;
	
	@Override
	public double obterArea(){
		return Math.pow(lado,2);
	}
}		