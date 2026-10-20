/**
 * Abstract Factory (GoF): cria uma família de artefatos compatíveis de um país.
 */
public interface FabricaArtefatosPais {
    DocumentoFiscal criarDocumentoFiscal();
    ProcessadorPagamento criarProcessadorPagamento();
    ComprovanteMatricula criarComprovanteMatricula();
}
