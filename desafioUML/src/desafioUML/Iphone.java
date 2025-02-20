package desafioUML;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Abrindo página na url: " + url);
		
	}

	@Override
	public void adicionarAba() {
		System.out.println("Aba adicionada");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada");
		
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Música " + musica + " selecionada");
		
	}

}
