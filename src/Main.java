public class Main {
    static final int MAX = 4; // Número máximo de elementos na fila

    // Cria uma fila vazia
    static int comeco = 0; // Início da fila
    static int tamanho = 0; // Tamanho da fila (número de elementos)
    static int queue[] = new int[MAX]; // Vetor da fila

    public static void main(String[] args) {
        inserir(1);
        inserir(10);
        inserir(100);
        inserir(1000);

        System.out.println("");

        remover();
        inserir(6);
        remover();
        inserir(60);
        remover();
        inserir(80);

        System.out.println("");

        // Mostra fila na tela
        for (int i = 0; i < MAX; i++) {
            System.out.println("fila[" + i + "] = " + queue[i]);
        }
    }

    static void inserir(int elemento) {
        // Checa se a fila está cheia
        if (tamanho == MAX) {
            System.out.println("\nfila cheia\n");
        } else {
            // Para tornar a fila circular
            queue[(comeco + tamanho) % MAX] = elemento;
            System.out.println("Valor " + elemento + " inserido no índice " + ((comeco + tamanho) % MAX) + " da fila");

            // Incrementa tamanho da fila (elemento foi inserido)
            tamanho++;
        }
    }

    static void remover() {
        // Checa se a fila está vazia
        if (tamanho == 0) {
            System.out.println("\nfila vazia\n");
        } else {
            // Apaga o primeiro elemento da fila deslocando o ponteiro do começo para o próximo elemento
            comeco = (comeco + 1) % MAX;

            // Decrementa o contador de tamanho (um valor foi removido)
            tamanho--;
        }
    }
}