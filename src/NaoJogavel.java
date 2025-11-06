public class NaoJogavel extends Personagem {
    private boolean aliado;

    public NaoJogavel(String nome, int vitalidade, Jogo jogo, boolean aliado) {
        super(nome, vitalidade, jogo);
        this.aliado = aliado;
    }

    public boolean isAliado() { return aliado; }
    public void setAliado(boolean aliado) { this.aliado = aliado; }

    @Override
    public void aplicarGolpeEspecial(Personagem adversario) {
        int dano = switch (jogo.getDificuldade()) {
            case EASY -> 20;
            case MEDIUM -> 30;
            case HARD -> 40;
        };
        adversario.setVitalidade(adversario.getVitalidade() - dano);
    }
}