import java.util.Comparator;

public class CriterioAvaliaçãoComparator implements Comparator <Musica2>{
    @Override
    public int compare(Musica2 m1, Musica2 m2){
        if(m1.getAvaliacao() > m2.getAvaliacao()){
            return -1;
        }
        if (m1.getAvaliacao() < m2.getAvaliacao()){
            return 1;
        }
        return m1.getTitulo().compareTo(m2.getTitulo());
    }
}
