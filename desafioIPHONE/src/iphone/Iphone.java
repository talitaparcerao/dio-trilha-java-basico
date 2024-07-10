package iphone;
public class Iphone extends Telefone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{
    public static void main(String[] args) throws Exception {

        Iphone iphone = new Iphone();
        iphone.atender();
        iphone.ligar("92339999");

        iphone.exibirPagina("https://8080");

        iphone.selecionarMusica("Este cara sou eu");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo telefone");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Discando Correio de Voz");
        
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para "+ numero);
        
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
        
    }

    @Override
    public void selecionarMusica(String Musica) {
        System.out.println("Selecionando música " + Musica);
        
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
        
    }
    
    @Override
    public void verificarConexao() {
        System.out.println("Verificando conexão");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página " + url);
        
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
        
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
        
    }
 }
