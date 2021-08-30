package edu.pago;

import javax.swing.JOptionPane;

import edu.cableado.IPago;

public class pago implements IPago{

	@Override
	public void efectuarPago() {
		JOptionPane.showMessageDialog(null, "se efectua pago");
	}
    @Override
    public void verificarMetodoPago() {
	JOptionPane.showMessageDialog(null, "metodo pago productos");
    }

}

