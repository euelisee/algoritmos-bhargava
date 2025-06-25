package cap1_busca_binaria;

public class BuscaBinaria {

    public static int buscaBinaria(int[] array, int chave) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (array[meio] == chave) {
                return meio; // Chave encontrada
            }

            if (array[meio] < chave) {
                inicio = meio + 1; // Vai para metade direita
            } else {
                fim = meio - 1; // Vai para metade esquerda
            }
        }

        return -1; // Chave não encontrada
    }

    public static void main(String[] args) {
        System.out.println("\n\n\n *** Busca Binária - Resultado *** \n ");

        int[] numeros = {1, 3, 5, 7, 9, 11};
        int procurar = 9;

        int resultado = buscaBinaria(numeros, procurar);

        if (resultado != -1) {
            System.out.println("Número " + procurar + " encontrado na posição: " + resultado);
        } else {
            System.out.println("Número não encontrado.");
        }
    }
}
