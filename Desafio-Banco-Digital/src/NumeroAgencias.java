public enum NumeroAgencias {
    AGENCIA_1 (15),
    AGENCIA_2 (20),
    AGENCIA_3 (25),
    AGENCIA_4 (35);

    private final int agencia;

    NumeroAgencias(int agencia) {
        this.agencia = agencia;
    }

    public int getAgencia() {
        return agencia;
    }
}
