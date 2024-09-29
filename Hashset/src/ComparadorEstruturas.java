import java.util.ArrayList;
import java.util.HashSet;

public class ComparadorEstruturas {

    public static void main(String[] args) {

        ArrayList<Double> listaNumeros = new ArrayList<>();
        HashSet<Double> conjuntoNumeros = new HashSet<>();

        long inicioAdicaoLista, fimAdicaoLista, inicioAdicaoConjunto, fimAdicaoConjunto;
        long inicioProcuraLista, fimProcuraLista, inicioProcuraConjunto, fimProcuraConjunto;

        inicioAdicaoLista = System.currentTimeMillis();
        for (double i = 0.0; i < 30000; i++) {
            listaNumeros.add(i);
        }
        fimAdicaoLista = System.currentTimeMillis();

        inicioProcuraLista = System.currentTimeMillis();
        for (double elemento : listaNumeros) {
        }
        fimProcuraLista = System.currentTimeMillis();

        inicioAdicaoConjunto = System.currentTimeMillis();
        for (double i = 0.0; i < 30000; i++) {
            conjuntoNumeros.add(i);
        }
        fimAdicaoConjunto = System.currentTimeMillis();

        inicioProcuraConjunto = System.currentTimeMillis();
        for (double elemento : conjuntoNumeros) {

        }
        fimProcuraConjunto = System.currentTimeMillis();

        System.out.println();
        System.out.println("Operação              Tempo de Procura    Tempo de Adição    Diferença");
        System.out.println("HashSet      " + (fimProcuraConjunto - inicioProcuraConjunto) + " ms       HashSet         "
                + (fimAdicaoConjunto - inicioAdicaoConjunto) + " ms            "
                + ((fimProcuraConjunto - inicioProcuraConjunto) - (fimAdicaoConjunto - inicioAdicaoConjunto)) + " ms");
        System.out.println("ArrayList    " + (fimProcuraLista - inicioProcuraLista) + " ms       ArrayList      "
                + (fimAdicaoLista - inicioAdicaoLista) + " ms            "
                + ((fimProcuraLista - inicioProcuraLista) - (fimAdicaoLista - inicioAdicaoLista)) + " ms");
    }
}
