
public class BebidaDecorator implements Bebida {
	protected Bebida bebida;
	
	public BebidaDecorator(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public String obterDescricao() {
		return bebida.obterDescricao();
	}
	
	public double obterCusto() {
		return bebida.obterCusto();
	}
}
