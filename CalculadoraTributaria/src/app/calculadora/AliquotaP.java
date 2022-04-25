package app.calculadora;
public class AliquotaP {

	private float valorEfetivo;
	
	public AliquotaP(float valorEfetivo) {
		this.valorEfetivo = valorEfetivo;
	}
	public float getValorEfetivo() {
		return valorEfetivo;
	}
	public float settValorEfetivo() {
		return valorEfetivo;
	}
	
	public float calculoAliquota() {
		return new CalculoAliquota(this).computar();
	}
}