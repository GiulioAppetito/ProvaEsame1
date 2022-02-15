import com.example.provaesame1.CalculatorModel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDivisione {

    //edge case, ma caso pessimistico, perché ciò che viene testato è "scorretto"
    //ovvero non c'è la stessa interpretazione di quale dovrebbe essere il risultato da parte dei tester
    //magari hanno letto male le specifiche
    @Test
    public void testDivisionPerZero(){
        float a = 0;
        float b = 5;
        float expected = Float.NaN;
        float actual = CalculatorModel.divToTest(a, b);

        assertEquals(expected, actual);
    }

    //un edge case che pare vada bene, perchè tanto è sbagliato il controllo
    //quindi stavolta è una situazione optimistic, perchè in generale funziona(fortuna), l'edge case pure,
    //ma nessuno si accorge dell'errore
    @Test
    public void testDivisionPerZero2(){
        float a = 0;
        float b = 1;

        float actual = CalculatorModel.divToTest(a,b);
        float expected = Float.POSITIVE_INFINITY;

        assertEquals(expected, actual);
    }
    //optimistic
    @Test
    public void testDivisionGeneric(){
        float a = 5;
        float b = 5;

        float actual = CalculatorModel.divToTest(a, b);
        float expected = a/b;

        assertEquals(expected, actual);
    }


    //sempre pessimistic stavolta però sbaglio perchè faccio a/b e non b/a
    @Test
    public void testDivisionGeneric2(){
        float a = 3;
        float b = 7;

        float actual = CalculatorModel.divToTest(a, b);
        float expected = a/b;

        assertEquals(expected, actual);
    }

    //per impossible qualcosa co random -> hai una possibilità talmente bassa di farlo che è impossibile
    //oppure qualcosa mutuamente esclusivo che avviene senza controllo da parte di chi chiama il metodo

}