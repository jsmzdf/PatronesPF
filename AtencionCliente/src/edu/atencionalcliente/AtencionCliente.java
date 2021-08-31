package edu.atencionalcliente;

import javax.swing.JOptionPane;

import edu.cableado.IAtencionalcliente;

public class AtencionCliente implements IAtencionalcliente {

	@Override
	public void brindarSoporteAsesoria() {
		JOptionPane.showMessageDialog(null, "Brindar soporte y asesoria");
	}
}
