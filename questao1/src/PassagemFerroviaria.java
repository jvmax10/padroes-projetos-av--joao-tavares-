import java.util.List;

public class PassagemFerroviaria extends Passagem {
    public PassagemFerroviaria(String nomePassageiro, double tarifa) {
        super(nomePassageiro, tarifa);
    }

    @Override
    public String getModal() {
        return "Ferroviário";
    }

    @Override
    protected double getPercentualTaxa() {
        return 0.05;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Comprovante de reserva");
    }
}
