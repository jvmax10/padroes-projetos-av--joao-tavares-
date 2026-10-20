public class EmissorRodoviario extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double tarifa) {
        return new PassagemRodoviaria(nomePassageiro, tarifa);
    }
}
