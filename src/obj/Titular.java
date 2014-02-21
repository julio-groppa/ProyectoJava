package obj;

import java.awt.Image;

import javax.naming.BinaryRefAddr;

@SuppressWarnings("serial")
public class Titular extends Persona{

	private int nro_afiliado;
	private String lugar_de_trabajo;
	private Image foto;

	public Titular() {
		super();
	}

	public Titular(int nro_afiliado, String lugar_de_trabajo, Image foto) {
		super();
		this.foto = foto;
		this.lugar_de_trabajo = lugar_de_trabajo;
		this.nro_afiliado = nro_afiliado;
	}

	public int getNro_afiliado() {
		return nro_afiliado;
	}

	public void setNro_afiliado(int nro_afiliado) {
		this.nro_afiliado = nro_afiliado;
	}

	public String getLugar_de_trabajo() {
		return lugar_de_trabajo;
	}

	public void setLugar_de_trabajo(String lugar_de_trabajo) {
		this.lugar_de_trabajo = lugar_de_trabajo;
	}

	public Image getFoto() {
		return foto;
	}

	public void setFoto(Image foto) {
		this.foto = foto;
	}

}
