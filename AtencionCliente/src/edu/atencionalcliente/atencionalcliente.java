package edu.atencionalcliente;

import javax.swing.JOptionPane;

import edu.cableado.IAtencionalcliente;

public class atencionalcliente implements IAtencionalcliente {

	@Override
	public void brindarSoporteAsesoria() {
		JOptionPane.showMessageDialog(null, "Brindar soporte y asesoria");
	}
}
