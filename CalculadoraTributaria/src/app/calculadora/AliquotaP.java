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
		float soma =0f;
		float base = 0f;
		
		if (base > 1903.98f){
            base -= 1903.98f;
            soma += ((Math.min(base, 922.67f) * 0.075f)); 
            if(base > 922.67f) {
                base -= 922.67f;
                soma +=((Math.min(base, 924.40f) * 0.15f)); 
                if (base > 924.40f) {
                    base -= 924.40f;
                    soma +=((Math.min(base, 913.63f) * 0.225f));
                    if(base > 913.63f) {
                        base -= 913.63f;
                        soma += (( base * 0.275f));
                    }
                }
            }
		}
		return soma;
	}
}