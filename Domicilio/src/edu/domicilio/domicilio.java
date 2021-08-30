package edu.domicilio;

import javax.swing.JOptionPane;

import edu.cableado.IDomicilio;

public class domicilio implements IDomicilio{

	@Override
	public void despacharPedidos() {
		JOptionPane.showMessageDialog(null, "Servicio Peluqueria");
	}
    @Override
    public void despacharServicio() {
	JOptionPane.showMessageDialog(null, "Salida productos");
    }
    @Override
    public void validarprocesoEntrega() {
    JOptionPane.showMessageDialog(null, "Salida productos");
    }

}


