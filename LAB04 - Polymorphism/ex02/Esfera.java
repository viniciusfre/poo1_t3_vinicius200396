public class Esfera extends FormaTridimensional{
	private double raio;
	
	@Override
	public double obterArea(){
		return 4*(Math.PI)*Math.pow(raio,2);
	}
	
	@Override
	public double obterVolume(){
		return 4/3 * Math.PI * Math.pow(raio,3);
	}
}
