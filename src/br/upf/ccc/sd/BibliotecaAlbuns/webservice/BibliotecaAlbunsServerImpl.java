package br.upf.ccc.sd.BibliotecaAlbuns.webservice;

import java.util.List;

import javax.jws.WebService;

import br.upf.ccc.sd.BibliotecaAlbuns.dao.AlbumDAO;
import br.upf.ccc.sd.BibliotecaAlbuns.model.Album;

/**
 * @author Leonardo Deliyannis Constantin, Matheus Bianchi Godinho
 * SIB - Service Implementation Bean
 */

@WebService(endpointInterface = "br.upf.ccc.sd.BibliotecaAlbuns.webservice.BibliotecaAlbunsServer")
public class BibliotecaAlbunsServerImpl implements BibliotecaAlbunsServer {
	
	private AlbumDAO albumDAO = new AlbumDAO();
	
	@Override
	public List<Album> retornaAlbuns() {
		return albumDAO.listaAlbuns();
	}
	
	@Override
	public void insereAlbum(String titulo, String artista, String gravadora, int ano) {
		albumDAO.insereAlbum(titulo, artista, gravadora, ano);
	}
	
}
