public class EmissorAereo extends EmissorPassagem {
    @Override
    protected Passagem criarPassagem(String nomePassageiro, double tarifa) {
        return new PassagemAerea(nomePassageiro, tarifa);
    }
}
