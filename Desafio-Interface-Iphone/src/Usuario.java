public class Usuario {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        System.out.println("Utilizando o Tocador de música do Iphone");
        meuIphone.tocar();
        meuIphone.selecionarMusica();
        meuIphone.pausar();

        System.out.println("\nUtilizando o telefone do Iphone");
        meuIphone.ligar();
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\nUtilizando o navegador do Iphone");
        meuIphone.exibirPagina();
        meuIphone.atualizarPagina();
        meuIphone.adicionarNovaAba();



    }
}
