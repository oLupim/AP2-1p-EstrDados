package ATV2;

public class ListaDuplamenteLigada<T> {
    private No<T> inicio;
    private No<T> fim;

    public ListaDuplamenteLigada() {
        this.inicio = null;
        this.fim = null;
    }


    public void adicionar(T dado) {
        No<T> novoNo = new No<>(dado);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }


    public void adicionarPrimeiro(T dado) {
        No<T> novoNo = new No<>(dado);
        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {

            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }


    public void removerPrimeiro() {
        if (inicio == null) return;
        System.out.println("Removido: " + inicio.elemento);
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }

    public void removerUltimo() {
        if (fim == null) return;
        System.out.println("Removido: " + fim.elemento);
        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
    }

    public void buscarPorId(String id) {
        No<T> atual = inicio;
        while (atual != null) {
            if (atual.elemento.toString().startsWith(id + " -")) {
                System.out.println("Livro encontrado: " + atual.elemento);
                return;
            }
            atual = atual.proximo;
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    public void imprimirLista() {
        No<T> atual = inicio;
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirReverso() {
        No<T> atual = fim;
        while (atual != null) {
            System.out.print(atual.elemento + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }


}
