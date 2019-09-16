/*
 5. Faça um programa que cadastre 15 números inteiros, 
não permitindo números repetidos. Ordeneos e, em seguida, 
verifique se um número digitado pelo usuário está no vetor. Caso encontre,
verifique se está em uma posição par ou ímpar do vetor:
a) usando busca sequencial;
b) usando busca binária.

 */
package exe5;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public class Main {

    public static void main(String[] args) {
        Merge merge = new Merge();
        Scanner scanner = new Scanner(System.in);
        Linear l = new Linear();
        Binary b = new Binary();
        int ns[] = new int[5];
        String imparPar = "";

        ns = lerNumeros(ns);
        System.out.println(System.getProperty("line.separator"));
        merge.mergeAsc(ns, 0, ns.length - 1);
        
        System.out.println("Digite um número para a busca: ");
        int num = scanner.nextInt();

        if (l.find(ns, num)) {
            System.out.println(System.getProperty("line.separator"));
            System.out.println("Usando a busca linear");
            System.out.println("Com o vetor ordenado, o número foi encontrado...");
            System.out.println("Na posição: "+l.getPosicao() + ", " + ((l.getPosicao() % 2 == 0) ? "Par" : "Impar"));
        }
        
        if(b.find(ns, num)){
            System.out.println(System.getProperty("line.separator"));
            System.out.println("Usando a busca binária");
            System.out.println("Com o vetor ordenado, o número foi encontrado...");
            System.out.println("Na posição: "+b.getPosicao() + ", " + ((b.getPosicao() % 2 == 0) ? "Par" : "Impar"));
        }
    }

    private static int[] lerNumeros(int[] ns) {
        Linear l = new Linear();
        Scanner scanner = new Scanner(System.in);
        int aux[] = new int[ns.length];
        int i = 0;
        while (i < ns.length) {
            System.out.println((i + 1) + "º número: ");
            aux[i] = scanner.nextInt();
            if (l.find(ns, aux[i])) {
                System.out.println("Número repetido. Tente outra vez");
            } else {
                ns[i] = aux[i];
                i++;
            }
        }

        return ns;
    }
}
