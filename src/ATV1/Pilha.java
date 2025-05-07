package ATV1;

public class Pilha {
    No topo;

    public void push(String elemento) {
        No novo = new No(elemento);
        novo.proximo = topo;
        topo = novo;
    }

    public String pop() {
        if (topo == null) return null;
        String elemento = topo.elemento;
        topo = topo.proximo;
        return elemento;
    }

    public void printStack() {
        No atual = topo;
        while (atual != null) {
            System.out.println("- " + atual.elemento);
            atual = atual.proximo;
        }
    }
}
