package edu.inventario;

import javax.swing.JOptionPane;

import edu.cableado.IInventario;

public class inventario implements IInventario{

	@Override
	public void gestionarStock() {
		JOptionPane.showMessageDialog(null, "Servicio Peluqueria");
	}
    @Override
    public void gestionarDisponibilidadServicio() {
	JOptionPane.showMessageDialog(null, "Salida productos");
    }

}

