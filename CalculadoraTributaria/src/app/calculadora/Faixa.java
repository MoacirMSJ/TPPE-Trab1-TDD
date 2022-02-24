package app.calculadora;

public class Faixa {

	private String nomeFaixa;
	private float valorRendimento;
	private float valorDeducao;
	private float valorFaixa;
	
	public Faixa() {
		
	}
	public Faixa(String nomeFaixa, float valorRendimento, float valorDeducao, float valorFaixa) {
		this.nomeFaixa = nomeFaixa;
		this.valorRendimento = valorRendimento;
		this.valorDeducao = valorDeducao;
		this.valorFaixa = valorFaixa;
	}
	
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
	public void setNomeFaixa(String nomeFaixa) {
		this.nomeFaixa = nomeFaixa;
	}

	public void setValorRendimento(float valorRendimento) {
		this.valorRendimento = valorRendimento;
	}

	public void setValorDeducao(float valorDeducao) {
		this.valorDeducao = valorDeducao;
	}

	public void setValorFaixa(float valorFaixa) {
		this.valorFaixa = valorFaixa;
	}
	
}
