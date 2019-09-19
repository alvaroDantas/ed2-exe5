package exe5;

import java.util.ArrayList;

/**
 *
 * @author DLT1CA
 */
public class Binary {

    private boolean achou;
    private int posicao;
    private int inicio;
    private int fim;
    private int meio;
    private int tentativas;
    
    //<editor-fold desc="Getters and Setters">
    public boolean isAchou() {
        return achou;
    }

    public int getPosicao() {
        return posicao;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    public int getMeio() {
        return meio;
    }

    public int getTentativas() {
        return tentativas;
    }

   
    //</editor-fold>
    
    public boolean find(int[] ns, int numEscolhido) {
        posicao = 0;
        inicio = 0;
        fim = ns.length - 1;
        meio = 0;
        achou = false;

        while (inicio <= fim && !achou) {
            meio = (inicio + fim) / 2;
            if (numEscolhido == ns[meio]) {
                achou = true;
                posicao = meio;
            } else if (numEscolhido > ns[meio]) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
                tentativas++;
            }

        }
        return achou;
    }
}
