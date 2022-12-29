public class Triangulo extends FormaBidimensional{
	private double base;
	private double altura;
	
	@Override
	public double obterArea(){
		return (base * altura)/2;
	}
}