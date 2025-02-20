package desafioUML;

public class App {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		
		// Testando funcionalidades de telefone
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testando funcionalidades de navegador
        iphone.exibirPagina("https://www.exemplo.com");
        iphone.adicionarAba();
        iphone.atualizarPagina();

        // Testando funcionalidades de reprodutor musical
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.tocar();
        iphone.pausar();

	}

}
