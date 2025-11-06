import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private Dificuldade dificuldade;
    private List<Personagem> listaPersonagens = new ArrayList<>();

    public Jogo(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Dificuldade getDificuldade() { return dificuldade; }

    public void adicionarPersonagem(Personagem p) {
        listaPersonagens.add(p);
    }

    public void removerPersonagem(Personagem p) {
        listaPersonagens.remove(p);
    }
}
