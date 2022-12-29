public class Tetraedro extends FormaTridimensional{
	private double lado;
	private double altura;
	private double areaBase;
	
	
	@Override
	public double obterArea(){
		return 6 * Math.pow(lado,2);
	}
	
	@Override
	public double obterVolume(){
		return altura*1/3*areaBase;
	}
}