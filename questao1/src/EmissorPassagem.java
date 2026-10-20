public abstract class EmissorPassagem {
    protected abstract Passagem criarPassagem(String nomePassageiro, double tarifa);

    public final void emitirPassagem(String nomePassageiro, double tarifa) {
        Passagem passagem = criarPassagem(nomePassageiro, tarifa);
        passagem.calcularTaxaEmbarque();
        passagem.imprimirResumo();
    }
}
