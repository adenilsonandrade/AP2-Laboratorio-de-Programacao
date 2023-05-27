class Livro extends Produto {
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;
    private int numeroEdicao;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    // Método sobrecarregado para definir o título do livro
    public void setTitulo(String titulo) {
        this.setTitulo(titulo, 0); // Chama o outro método setTitulo() com número de edição zero
    }

    // Método sobrecarregado para definir o título do livro com número de edição
    public void setTitulo(String titulo, int numeroEdicao) {
        super.setTitulo(titulo);
        this.numeroEdicao = numeroEdicao;
    }

    public Livro(String titulo, String autor, int anoPublicacao, int numeroEdicao, boolean disponibilidade) {
        super.setTitulo(titulo);
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroEdicao = numeroEdicao;
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String detalhesDoProduto() {
        String detalhes = "Livro: " + getTitulo() + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao
                + "\nDisponibilidade: " + (disponibilidade ? "Disponível" : "Indisponível");

        if (numeroEdicao > 0) {
            detalhes += "\nNúmero de Edição: " + numeroEdicao;
        }
        return detalhes;
    }
}