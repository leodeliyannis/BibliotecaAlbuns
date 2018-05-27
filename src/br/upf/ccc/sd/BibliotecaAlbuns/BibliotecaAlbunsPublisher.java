package br.upf.ccc.sd.BibliotecaAlbuns;

import javax.xml.ws.Endpoint;

import br.upf.ccc.sd.BibliotecaAlbuns.webservice.BibliotecaAlbunsServerImpl;

/**
 * @author Leonardo Deliyannis Constantin, Matheus Bianchi Godinho
 * Publisher:
 * Publica a implementação de um WebService 
 */

public class BibliotecaAlbunsPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:9876/biblioteca", new BibliotecaAlbunsServerImpl());
	}
}
