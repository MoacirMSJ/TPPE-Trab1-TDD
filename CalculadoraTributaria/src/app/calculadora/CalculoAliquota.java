package app.calculadora;

class CalculoAliquota {
    private AliquotaP _aliquotaP;
    private float soma = 0f;
    private float base = 0f;

    public CalculoAliquota(AliquotaP aliquotaP) {
        this._aliquotaP = aliquotaP;
    }


    public float computar() {
        if (this.base > 1903.98f) {
            this.base -= 1903.98f;
            this.soma += ((Math.min(this.base, 922.67f) * 0.075f));
            if (this.base > 922.67f) {
                this.base -= 922.67f;
                this.soma += ((Math.min(this.base, 924.40f) * 0.15f));
                if (this.base > 924.40f) {
                    this.base -= 924.40f;
                    this.soma += ((Math.min(this.base, 913.63f) * 0.225f));
                    if (this.base > 913.63f) {
                        this.base -= 913.63f;
                        this.soma += ((this.base * 0.275f));
                    }
                }
            }
        }
        return soma;
    }
}