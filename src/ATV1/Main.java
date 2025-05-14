package ATV1;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        // Adicionar Novo Pedido
        fila.enqueue("Café");
        fila.enqueue("Cappuccino");
        fila.enqueue("Latte");

        fila.printQueue();

        // Cancelar pedido
        String cancelado = fila.dequeue();
        if (cancelado != null) {
            pilha.push(cancelado);
            System.out.println("\nPedido cancelado: " + cancelado);
        }

        fila.printQueue();
        pilha.printStack();

        // Restaurar pedido
        String restaurado = pilha.pop();
        if (restaurado != null) {
            fila.enqueue(restaurado);
            System.out.println("\nPedido restaurado: " + restaurado);
        }

        // Exibir tudo
        fila.printQueue();
        pilha.printStack();

        fila.atenderPedido();
        fila.printQueue();
    }
}
