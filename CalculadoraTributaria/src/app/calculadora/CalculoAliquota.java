package app.calculadora;

class CalculoAliquota {
    //EXTRACAO DE CONSTANTES  DO METODO OBJETO REFERENTE A AliquotaP
    public static final float FAIXA1 = 1903.98f;
    public static final float FAIXA2 = 922.67f;
    public static final float FAIXA3 = 924.40f;
    public static final float FAIXA4 = 913.63f;
    public static final float ALIQ1 = 0.075f;
    public static final float ALIQ2 = 0.15f;
    public static final float ALIQ3 = 0.225f;
    public static final float ALIQ4 = 0.275f;

    private AliquotaP _aliquotaP;
    private float soma = 0f;
    private float base = 0f;

    public CalculoAliquota(AliquotaP aliquotaP) {
        this._aliquotaP = aliquotaP;
    }


    public float computar() {
        if (this.base > FAIXA1) {
            this.base -= FAIXA1;
            this.soma += ((Math.min(this.base, FAIXA2) * ALIQ1));
            if (this.base > FAIXA2) {
                this.base -= FAIXA2;
                this.soma += ((Math.min(this.base, FAIXA3) * ALIQ2));
                if (this.base > FAIXA3) {
                    this.base -= FAIXA3;
                    this.soma += ((Math.min(this.base, FAIXA4) * ALIQ3));
                    if (this.base > FAIXA4) {
                        this.base -= FAIXA4;
                        this.soma += ((this.base * ALIQ4));
                    }
                }
            }
        }
        return soma;
    }
}