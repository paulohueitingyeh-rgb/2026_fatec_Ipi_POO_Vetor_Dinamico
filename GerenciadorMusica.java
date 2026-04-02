import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class GerenciadorMusica {
    public static void main(String[] args) {
        //tipo base e um tipo paramétrico
        //generics java 5+
        List <Musica2> musicas = new ArrayList<>();
        Musica2 m = new Musica2("a");
    
        int opcao;
        String menu = "0-Sair\n1-Cadastrar musica\n2-Avaliar musica\n3-Ver a lista de musica(alfabetica)\n4-Lista de musica(por nota)";
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:{
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var musica = new Musica2(titulo);
                    musicas.add(musica);
                    break;
                }
                case 2:{
                    var titulo = JOptionPane.showInputDialog("Titulo?");
                    var avaliacao = Integer.parseInt(JOptionPane.showInputDialog("nota?"));
                    for (int i = 0; i < musicas.size(); i++){
                        if (musicas.get(i).getTitulo().equals(titulo)){
                            musicas.get(i).setAvaliacao(avaliacao);
                            JOptionPane.showMessageDialog(null, "Musica avaliada");
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    //exibir a lista ordenada pelo titulo 
                    //para tal, sera necessario implementar
                    //uma interface chamada comparable na classe musica 
                    Collections.sort(musicas);
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                }
                case 4:{
                    //ordenar por avaliação
                    //detalhe: não usar compareto
                    Collections.sort(musicas, new CriterioAvaliaçãoComparator());
                    //musicas.sort(Comparator.comparingInt(Musica2::getAvaliacao)
                    //   .thenComparing(Musica2::getTitulo));
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                }
            }
        }
        while(opcao != 0);

    }
}
