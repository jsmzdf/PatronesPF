package edu.despacho;

import javax.swing.JOptionPane;

import edu.cableado.IDespacho;

public class despacho implements IDespacho {

	@Override
	public void gestionServicioPeluqueria() {
		JOptionPane.showMessageDialog(null, "Servicio Peluqueria");
	}

	@Override
	public void gestionSalidaProductos() {
		JOptionPane.showMessageDialog(null, "Salida productos");
	}

}
