public class Circulo extends FormaBidimensional{
	private double raio;
	
	@Override
	public double obterArea(){
		return Math.PI * Math.pow(raio,2);

	}
}