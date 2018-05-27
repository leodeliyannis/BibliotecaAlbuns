package br.upf.ccc.sd.BibliotecaAlbuns.model;

/**
 * @author Leonardo Deliyannis Constantin, Matheus Bianchi Godinho
 */

public class Album {
	
	private Long codigo;
	private String titulo;
	private String artista;
	private String gravadora;
	private int ano;
	
	/** Construtor vazio é requisito da JAX-B (Java Architecture for XML Binding) **/
	public Album() {
		
	}
	
	public Album(Long codigo, String titulo, String artista, String gravadora, int ano) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.artista = artista;
		this.gravadora = gravadora;
		this.ano = ano;
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public String getGravadora() {
		return gravadora;
	}
	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Album other = (Album) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
}
