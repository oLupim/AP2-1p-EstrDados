package ATV1;

public class Fila {
    No inicio, fim;

    public void enqueue(String valor) {
        No novo = new No(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
    }

    public String dequeue() {
        if (inicio == null) return null;
        String valor = inicio.elemento;
        inicio = inicio.proximo;
        if (inicio == null) fim = null;
        return valor;
    }

    public void printQueue() {
        No atual = inicio;
        System.out.println("\nFila de pedidos:");
        while (atual != null) {
            System.out.println("- " + atual.elemento);
            atual = atual.proximo;
        }
    }


    public void atenderPedido() {
        String atendido = dequeue();
        if (atendido == null) {
            System.out.println("\nNenhum pedido pendente para atender.");
        } else {
            System.out.println("Pedido atendido:");
            System.out.println(atendido);
        }
    }

}

