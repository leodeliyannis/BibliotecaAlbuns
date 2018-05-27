package br.upf.ccc.sd.BibliotecaAlbuns.dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import br.upf.ccc.sd.BibliotecaAlbuns.model.Album;

/**
 * @author Leonardo Deliyannis Constantin, Matheus Bianchi Godinho
 * Classe DAO (Data Access Object)
 */

public class AlbumDAO {
	/** Pseudo "banco de dados" utilizando hashmap **/
	private static Map<Long, Album> ALBUNS = new LinkedHashMap<>();
	private static Long counter;
	
	public AlbumDAO() {
		counter = 0L;
	}
	
	public ArrayList<Album> listaAlbuns(){
		return new ArrayList<>(ALBUNS.values());
	}
	
	public void insereAlbum(String titulo, String artista, String gravadora, int ano) {
		counter += 1L;
		ALBUNS.put(counter, new Album(counter, titulo, artista, gravadora, ano));
	}
	
}
