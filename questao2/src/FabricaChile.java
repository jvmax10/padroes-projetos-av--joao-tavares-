public class FabricaChile implements FabricaArtefatosPais {
    @Override
    public DocumentoFiscal criarDocumentoFiscal() {
        return new DocumentoFiscalChile();
    }

    @Override
    public ProcessadorPagamento criarProcessadorPagamento() {
        return new PagamentoWebpay();
    }

    @Override
    public ComprovanteMatricula criarComprovanteMatricula() {
        return new ComprovanteRut();
    }
}
