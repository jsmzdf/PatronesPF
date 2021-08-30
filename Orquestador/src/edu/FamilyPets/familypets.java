package edu.FamilyPets;

import javax.swing.JOptionPane;

import edu.cableado.IAtencionalcliente;
import edu.cableado.ICatalogo;
import edu.cableado.IDespacho;
import edu.cableado.IDomicilio;
import edu.cableado.IInventario;
import edu.cableado.IPago;
import edu.utilidades.Cargador;

public class familypets {
	void moderar() {
		Class cls = null;

		final Cargador cb = new Cargador("back");
		try {

			cls = cb.getClase(IPago.class.getName());

			if (cls != null) {
				IPago ip = (IPago) cls.getDeclaredConstructor().newInstance();
				ip.efectuarPago();
				ip.verificarMetodoPago();
			}
			cls = cb.getClase(IDespacho.class.getName());
			if (cls != null) {
				IDespacho id = (IDespacho) cls.getDeclaredConstructor().newInstance();
				id.gestionServicioPeluqueria();
				id.gestionSalidaProductos();
			}
			cls = cb.getClase(IInventario.class.getName());
			if (cls != null) {
				IInventario ii = (IInventario) cls.getDeclaredConstructor().newInstance();
				ii.gestionarStock();
				ii.gestionarDisponibilidadServicio();
			}
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay BACK...");
		}
		final Cargador cf = new Cargador("front");
		cls = cf.getClase(ICatalogo.class.getName());
		try {
			if (cls != null) {
				ICatalogo ic = (ICatalogo) cls.getDeclaredConstructor().newInstance();
				ic.publicarProductosServicios();

			}
			cls = cf.getClase(IDomicilio.class.getName());
			if (cls != null) {
				IDomicilio ido = (IDomicilio) cls.getDeclaredConstructor().newInstance();
				ido.despacharPedidos();
				ido.despacharServicio();
				ido.validarprocesoEntrega();
			}
			cls = cf.getClase(IAtencionalcliente.class.getName());
			if (cls != null) {
				IAtencionalcliente iat = (IAtencionalcliente) cls.getDeclaredConstructor().newInstance();
				iat.brindarSoporteAsesoria();

			}
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay BACK");
		}
	}

	public static void main(final String[] args) {
		JOptionPane.showMessageDialog(null, "RATA ");
		new familypets().moderar();
	}

}
