package ATV1;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        // Adicionando pedidos
        fila.enqueue("Café");
        fila.enqueue("Cappuccino");
        fila.enqueue("Latte");

        fila.printQueue();

        // Cancelar pedido
        String cancelado = fila.dequeue();
        if (cancelado != null) {
            pilha.push(cancelado);
            System.out.println("Pedido cancelado: " + cancelado);
        }

        fila.printQueue();

        // Restaurar pedido
        String restaurado = pilha.pop();
        if (restaurado != null) {
            fila.enqueue(restaurado);
            System.out.println("Pedido restaurado: " + restaurado);
        }

        // Exibir tudo
        fila.printQueue();
        pilha.printStack();
    }
}
