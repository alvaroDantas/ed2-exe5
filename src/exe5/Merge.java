/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe5;

/**
 *
 * @author DLT1CA
 */
public class Merge{
    public void mergeAsc(int ns[], int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeAsc(ns, inicio, meio);
            mergeAsc(ns, meio + 1, fim);
            intercalaAsc(ns, inicio, fim, meio);
        }
    }
    public int[] intercalaAsc(int ns[], int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        int[] aux = new int[ns.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (ns[inicioVet1] <= ns[inicioVet2]) {
                aux[indiceVetorAux] = ns[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = ns[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = ns[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = ns[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            ns[i] = aux[i];
        }

        return aux;
    }
}
