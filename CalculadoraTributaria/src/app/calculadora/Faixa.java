package app.calculadora;

public class Faixa {

	private String nomeFaixa;
	private float valorRendimento;
	private float valorDeducao;
	private float valorFaixa;
	
	public Faixa(String nomeFaixa, float valorRendimento, float valorDeducao, float valorFaixa) {
		this.nomeFaixa = nomeFaixa;
		this.valorRendimento = valorRendimento;
		this.valorDeducao = valorDeducao;
		this.valorFaixa = valorFaixa;
	}
	
	//get
	public String getNomeFaixa() {
		return nomeFaixa;
	}
	public float getValorRendimento() {
		return valorRendimento;
	}
	public float getValorDeducao() {
		return valorDeducao;
	}
	public float getValorFaixa() {
		return valorFaixa;
	}
}
