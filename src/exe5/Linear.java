package exe5;

import java.util.ArrayList;

/**
 *
 * @author DLT1CA
 */
public class Linear {

    private boolean achou;
    private int tentativas;
    private int posicao;

    public boolean isAchou() {
        return achou;
    }

    public int getTentativas() {
        return tentativas;
    }

    public int getPosicao() {
        return posicao;
    }

    public boolean find(int[] ns, int numEscolhido) {
        int i = 0;
        achou = false;
        tentativas = 0;
        int n = ns.length;

        while (i < n) {
            if (ns[i] == numEscolhido) {
                achou = true;
                posicao = i;
            } else {
                tentativas++;
            }
            i++;
        }
        return  achou;
    }

    public Linear() {
        posicao = 0;
    }
    
}
