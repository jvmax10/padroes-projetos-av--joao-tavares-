public class EmissorFerroviario extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double tarifa) {
        return new PassagemFerroviaria(nomePassageiro, tarifa);
    }
}
