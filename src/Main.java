public class Main {
    static final int TAMANHO = 5;

    public static void main(String[] args) {
        Fila minhaFila = new Fila();
        criaFila(minhaFila);

        enQueue(minhaFila, 1);
        System.out.println("Valor 1 adicionado à fila!\n");
        enQueue(minhaFila, 2);
        System.out.println("Valor 2 adicionado à fila!\n");
        enQueue(minhaFila, 3);
        System.out.println("Valor 3 adicionado à fila!\n");
        enQueue(minhaFila, 4);
        System.out.println("Valor 4 adicionado à fila!\n");
        enQueue(minhaFila, 5);
        System.out.println("Valor 5 adicionado à fila!\n\n");

        System.out.println("Tentativa de adicionar o valor 6 à fila!\n");
        enQueue(minhaFila, 6); // erro fila cheia

        System.out.println("Valor " + deQueue(minhaFila) + " removido da fila!\n");
        System.out.println("Valor " + deQueue(minhaFila) + " removido da fila!\n\n");

        enQueue(minhaFila, 7);
        System.out.println("Valor 7 adicionado à fila!\n");
        enQueue(minhaFila, 8);
        System.out.println("Valor 8 adicionado à fila!\n\n");

        System.out.println("Valor " + deQueue(minhaFila) + " removido da fila!\n");
        System.out.println("Valor " + deQueue(minhaFila) + " removido da fila!\n");
        System.out.println("Valor " + deQueue(minhaFila) + " removido da fila!\n");
        System.out.println("Valor " + deQueue(minhaFila) + " removido da fila!\n");
        System.out.println("Valor " + deQueue(minhaFila) + " removido da fila!\n\n");

        System.out.println("Tentativa de remover valor da fila!");
        System.out.println(deQueue(minhaFila)); // erro fila vazia
    }

    static void enQueue(Fila f, int dado) {
        if ((f.inicio == f.fim + 1) || (f.inicio == 0 && f.fim == TAMANHO - 1)) {
            System.out.println("\nErro: fila cheia\n\n\n");
        } else {
            if (f.inicio == -1) f.inicio = 0;
            f.fim = (f.fim + 1) % TAMANHO;
            f.dados[f.fim] = dado;
        }
    }

    static void criaFila(Fila f) {
        f.inicio = -1;
        f.fim = -1;
    }

    static int deQueue(Fila f) {
        int dado;
        if (f.inicio == -1) {
            System.out.println("\nErro: fila vazia\n\n");
            return 0;
        } else {
            dado = f.dados[f.inicio];
            if (f.inicio == f.fim) {
                f.inicio = f.fim = -1;
            } else {
                f.inicio = (f.inicio + 1) % TAMANHO;
            }
        }
        return dado;
    }

    static void imprimeDados(Fila f) {
        System.out.println("\n[");
        for (int cont = 0; cont < TAMANHO; cont++) {
            System.out.println(f.dados[cont]);
        }
        System.out.println("]");
    }
}
