public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro("Livro 1","Autor 1", 2015, 2, true);
        Livro livro2 = new Livro("Livro 2","Autor 2", 2005, 4, false);
        Livro livro3 = new Livro("Livro 3","Autor 3", 2001, 2, true);
        Livro livro4 = new Livro("Livro 4","Autor 4", 2020, 1, true);
        Livro livro5 = new Livro("Livro 5","Autor 5", 2018, 3, false);
        Livro livro6 = new Livro("Livro 6","Autor 6", 2008, 1, true);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        System.out.println("Detalhes do Livro 1:");
        System.out.println(livro1.detalhesDoProduto());

        biblioteca.adicionarLivro(livro6);

        biblioteca.removerLivro(livro2);

        System.out.println("Detalhes do Livro 2:");
        System.out.println(livro2.detalhesDoProduto()); // Livro removido.

        biblioteca.adicionarLivro(livro6);

        biblioteca.atualizarDetalhesLivro(livro3, "Livro 3 (Edição Especial)", "Autor 3", 2015);

        System.out.println("Disponibilidade do Livro 1: " + biblioteca.verificarDisponibilidadeLivro(livro1));

        biblioteca.removerLivro(livro4);

        System.out.println("Disponibilidade do Livro 4: " + biblioteca.verificarDisponibilidadeLivro(livro4)); // Livvro Removido.

        biblioteca.atualizarDetalhesLivro(livro3, "Livro 3", "Autor 3", 2015);
        livro3.setDisponibilidade(false);

        System.out.println("Detalhes do Livro 3:");
        System.out.println(livro3.detalhesDoProduto());
        System.out.println("Disponibilidade do Livro 3: " + biblioteca.verificarDisponibilidadeLivro(livro3));
    }
}