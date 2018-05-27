package br.upf.ccc.sd.BibliotecaAlbuns.webservice;

import java.util.List;

import javax.jws.WebService;
import javax.jws.WebMethod;

import br.upf.ccc.sd.BibliotecaAlbuns.model.Album;

/**
 * @author Leonardo Deliyannis Constantin, Matheus Bianchi Godinho
 * SEI - Service Endpoint Interface
 */

@WebService
public interface BibliotecaAlbunsServer {
	
	/** Métodos do WebService **/
	@WebMethod
	public List<Album> retornaAlbuns();
	public void insereAlbum(String titulo, String artista, String gravadora, int ano);
}
