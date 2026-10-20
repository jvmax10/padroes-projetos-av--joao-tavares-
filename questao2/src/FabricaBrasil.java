public class FabricaBrasil implements FabricaArtefatosPais {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalBrasil();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoPix();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteCpf();
    }
}
