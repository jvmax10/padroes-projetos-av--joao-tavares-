public class Matricula {
    private final DocumentoFiscal documentoFiscal;
    private final ProcessadorPagamento processadorPagamento;
    private final ComprovanteMatricula comprovanteMatricula;

    public Matricula(FabricaArtefatosPais fabrica) {
        if (fabrica == null) {
            throw new IllegalArgumentException("é necessario a utilizaçao de fabrica ,obrigatoriamente.");
        }
        this.documentoFiscal = fabrica.criarDocumentoFiscal();
        this.processadorPagamento = fabrica.criarProcessadorPagamento();
        this.comprovanteMatricula = fabrica.criarComprovanteMatricula();
    }

    public void imprimirRelatorio() {
        System.out.println("Relatorio da matricula do curso");
        System.out.println(documentoFiscal.descricao());
        System.out.println(processadorPagamento.descricao());
        System.out.println(comprovanteMatricula.descricao());
        System.out.println();
    }
}
