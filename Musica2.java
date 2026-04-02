public class Musica2 implements Comparable<Musica2> {
    private String titulo;
    private int avaliacao;

    public Musica2(String titulo){
        this.titulo = titulo;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    public int getAvaliacao() {
        return avaliacao; 
}

    public String getTitulo() {
        return titulo;
    }
    //(ONE, 0)
    @Override
    public String toString() {
        return String.format("(%s, %d)", titulo, avaliacao);
        //return "(" + titulo + ", " + avaliacao + ")"; <--concatenação

    }
    @Override
    public int compareTo(Musica2 outra) {
        return this.titulo.compareToIgnoreCase(outra.titulo);
    }
}   


