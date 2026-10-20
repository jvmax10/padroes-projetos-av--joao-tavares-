public class Main {
    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new FabricaBrasil());
        matriculaBrasil.imprimirRelatorio();

        Matricula matriculaChile = new Matricula(new FabricaChile());
        matriculaChile.imprimirRelatorio();
    }
}
