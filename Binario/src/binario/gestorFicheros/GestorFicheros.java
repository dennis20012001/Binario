package binario.gestorFicheros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import binario.poo.Binario;

public class GestorFicheros {
	
	private static final String NOMBRE_FICHERO = "Resultados.dat";
	private static final String RUTA_FICHERO = ".\\ticketStorage\\";

	private void escribirFichero(ArrayList<Binario> mensaje) {

		FileWriter fileWriter = null;
		PrintWriter printWriter = null;

		try {
			fileWriter = new FileWriter(RUTA_FICHERO + NOMBRE_FICHERO);
			printWriter = new PrintWriter(fileWriter);

//			for (int i = 0; i < mensaje.size(); i++) {
//
//				String datos = "-----------------------" + "\n" + "FECHA: " + mensaje.get(i).getFecha() + "-"
//						+ mensaje.get(i).getMes() + "-" + mensaje.get(i).getDia() + "\n" + "HORA: "
//						+ mensaje.get(i).getHora() + ":" + mensaje.get(i).getMinuto() + "\n" + "PARA: "
//						+ mensaje.get(i).getPara() + "\n" + "DE: " + mensaje.get(i).getDe() + "\n" + "ASUNTO: "
//						+ mensaje.get(i).getAsunto() + "\n" + "CONTENIDO: " + mensaje.get(i).getContenido() + "\n"
//						+ "-----------------------";
//
//				printWriter.println(datos);
//			}

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
					"IOException - Error de escritura en el fichero " + RUTA_FICHERO + NOMBRE_FICHERO);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,
					"Exception - Error de escritura en el fichero " + RUTA_FICHERO + NOMBRE_FICHERO);
		} finally {
			printWriter.close();
			try {
				fileWriter.close();
			} catch (IOException e) {
			}
		}
	}
}
