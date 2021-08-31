package edu.principal;

import javax.swing.JOptionPane;

import edu.cableado.IAtencionalcliente;
import edu.cableado.ICatalogo;
import edu.cableado.IDespacho;
import edu.cableado.IDomicilio;
import edu.cableado.IInventario;
import edu.cableado.IPago;
import edu.utilidades.Cargador;



public class FamilyPet {
	void moderar() {
		Class cls = null;

		final Cargador cf = new Cargador("C:\\Users\\Usuario\\Desktop\\Patrones\\PatronesPF\\familyPet\\front");
		//Atención al cliente
		cls = cf.getClase(IAtencionalcliente.class.getName());
		try {
			final IAtencionalcliente iac = (IAtencionalcliente) cls.newInstance();
			iac.brindarSoporteAsesoria();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Atencion al cliente...");
		}
		
		//Catalogo
		cls = cf.getClase(ICatalogo.class.getName());
		try {
			final ICatalogo ic = (ICatalogo) cls.newInstance();
			ic.publicarProductosServicios();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Catalogo...");
		}

		//Domicilio
		cls = cf.getClase(IDomicilio.class.getName());
		try {
			final IDomicilio idom = (IDomicilio) cls.newInstance();
			idom.despacharPedidos();
			idom.despacharServicio();
			idom.validarprocesoEntrega();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Domicilio...");
		}

		final Cargador cb = new Cargador("C:\\Users\\Usuario\\Desktop\\Patrones\\PatronesPF\\familyPet\\back");
		//Despacho
		cls = cb.getClase(IDespacho.class.getName());
		try {
			final IDespacho ides = (IDespacho) cls.newInstance();
			ides.gestionServicioPeluqueria();
			ides.gestionSalidaProductos();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Despacho...");
		}

		//Inventario
		cls = cb.getClase(IInventario.class.getName());
		try {
			final IInventario iinv = (IInventario) cls.newInstance();
			iinv.gestionarStock();
			iinv.gestionarDisponibilidadServicio();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Inventario...");
		}

		//Pago
		cls = cb.getClase(IPago.class.getName());
		try {
			final IPago ip = (IPago) cls.newInstance();
			ip.efectuarPago();
			ip.verificarMetodoPago();
		} catch (Exception exc) {
			JOptionPane.showMessageDialog(null, "no hay Pago...");
		}
	}

	public static void main(final String[] args) {
		new FamilyPet().moderar();
	}

}
