public class Main {
    public static void main(String[] args) {
        EmissorPassagem emissorAereo = new EmissorAereo();
        EmissorPassagem emissorRodoviario = new EmissorRodoviario();
        EmissorPassagem emissorFerroviario = new EmissorFerroviario();

        emissorAereo.emitirPassagem("joao", 850.00);
        emissorRodoviario.emitirPassagem("chico", 120.00);
        emissorFerroviario.emitirPassagem("tomas", 500.00);
    }
}
