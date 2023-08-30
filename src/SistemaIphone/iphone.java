package SistemaIphone;

import AppleMusic.ReprodutorMusicial;
import Navegador.NavegadorInternet;
import Telefone.AparelhoTelefonico;

public class iphone implements ReprodutorMusicial, NavegadorInternet, AparelhoTelefonico   {

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando som");	
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Musica pausada");
	}

	@Override
	public void SelecionarMusica() {
		// TODO Auto-generated method stub
		System.out.println("Musica selecionada com sucesso");
	}

	@Override
	public void exibirPagina() {
		// TODO Auto-generated method stub
		System.out.println("exibindo pagina");

	}

	@Override
	public void adicionaNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando uma nova aba");

	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("aguarde.... atualizando a pagina");

	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		System.out.println("ligando para o numero (XX) XXXX-XXXX");

	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("Atendendo chamada");

	}

	@Override
	public void IniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("aguarde um momento que o correio de voz será iniciado");

	}
		
}

