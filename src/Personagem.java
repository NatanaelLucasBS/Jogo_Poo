public abstract class Personagem {
    protected String nome;
    protected int vitalidade;
    protected Jogo jogo;

    public Personagem(String nome, int vitalidade, Jogo jogo) {
        this.nome = nome;
        this.vitalidade = Math.max(0, Math.min(vitalidade, 100));
        this.jogo = jogo;
    }

    public String getNome() { return nome; }
    public int getVitalidade() { return vitalidade; }
    public void setVitalidade(int vitalidade) {
        this.vitalidade = Math.max(0, Math.min(vitalidade, 100));
    }

    public Jogo getJogo() { return jogo; }

    
    public void aplicarGolpeNormal(Personagem adversario) {
        adversario.setVitalidade(adversario.getVitalidade() - 10);
    }

    
    public abstract void aplicarGolpeEspecial(Personagem adversario);
}
