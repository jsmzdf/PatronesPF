package edu.catalogo;

import javax.swing.JOptionPane;

import edu.cableado.ICatalogo;

public class catalogo implements ICatalogo{

	@Override
	public void publicarProductosServicios() {
		JOptionPane.showMessageDialog(null, "Publicar lista de productos y servicios");
	}
}

