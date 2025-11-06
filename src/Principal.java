public class Principal {
    public static void main(String[] args) {
        Jogo jogo = new Jogo(Dificuldade.MEDIUM);

        Jogavel p1 = new Jogavel("Cleiton", 100, jogo, 3);
        NaoJogavel p2 = new NaoJogavel("Natanael", 100, jogo, false);

        jogo.adicionarPersonagem(p1);
        jogo.adicionarPersonagem(p2);

        // TESTE 1
        p1.botaoA(p2); // golpe normal
        p1.botaoA(p2); // golpe normal
        p1.botaoB(p2); // golpe especial

        System.out.println("Vitalidade final de " + p2.getNome() + ": " + p2.getVitalidade());

        // TESTE 2
        p2.aplicarGolpeEspecial(p1); // golpe especial
        p2.aplicarGolpeNormal(p1);   // golpe normal

        System.out.println("Vitalidade final de " + p1.getNome() + ": " + p1.getVitalidade());
    }
}
