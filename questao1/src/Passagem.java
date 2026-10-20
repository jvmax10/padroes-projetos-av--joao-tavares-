import java.util.List;
public abstract class Passagem {
    private final String nomePassageiro;
    private final double tarifa;
    private double taxaEmbarque;

    protected Passagem(String nomePassageiro, double tarifa) {
        if (nomePassageiro == null || nomePassageiro.isBlank()) {
            throw new IllegalArgumentException("o nome foi deixando em branco .O nome do passageiro é obrigatório .");
        }
        if (tarifa < 0) {
            throw new IllegalArgumentException("valores negativos de tarifa nao sao aceitaveis.");
        }
        this.nomePassageiro = nomePassageiro;
        this.tarifa = tarifa;
    }

    public abstract String getModal();

    protected abstract double getPercentualTaxa();

    public abstract List<String> getDocumentosExigidos();

    public final double calcularTaxaEmbarque() {
        taxaEmbarque = tarifa * getPercentualTaxa();
        return taxaEmbarque;
    }

    public final void imprimirResumo() {
        System.out.printf(
            "Modal: %s%nPassageiro: %s%nTarifa: R$ %.2f%nTaxa de embarque: R$ %.2f%nDocumentos exigidos: %s%n%n",
            getModal(),
            nomePassageiro,
            tarifa,
            taxaEmbarque,
            String.join(", ", getDocumentosExigidos())
        );
    }

    public final String getNomePassageiro() {
        return nomePassageiro;
    }

    public final double getTarifa() {
        return tarifa;
    }

    public final double getTaxaEmbarque() {
        return taxaEmbarque;
    }
}
