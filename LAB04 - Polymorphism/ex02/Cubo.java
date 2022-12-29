public class Cubo extends FormaTridimensional{
	private double lado;
	
	@Override
	public double obterArea(){
		return 6 * Math.pow(lado,2);
	}
	
	@Override
	public double obterVolume(){
		return Math.pow(lado,3);
	}
}
