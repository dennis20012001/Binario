package binario.poo;

import java.util.Date;
import java.util.Objects;

public class Binario {

	String equipoLocal = null;
	String equipoVisitante = null;
	int golesLocales = 0;
	int golesVisitantes = 0;
	String lugar = null;
	Date fecha = null;

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesLocales() {
		return golesLocales;
	}

	public void setGolesLocales(int golesLocales) {
		this.golesLocales = golesLocales;
	}

	public int getGolesVisitantes() {
		return golesVisitantes;
	}

	public void setGolesVisitantes(int golesVisitantes) {
		this.golesVisitantes = golesVisitantes;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Override
	public int hashCode() {
		return Objects.hash(equipoLocal, equipoVisitante, fecha, golesLocales, golesVisitantes, lugar);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Binario other = (Binario) obj;
		return Objects.equals(equipoLocal, other.equipoLocal) && Objects.equals(equipoVisitante, other.equipoVisitante)
				&& Objects.equals(fecha, other.fecha) && golesLocales == other.golesLocales
				&& golesVisitantes == other.golesVisitantes && Objects.equals(lugar, other.lugar);
	}

	@Override
	public String toString() {
		return "Binario [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante + ", golesLocales="
				+ golesLocales + ", golesVisitantes=" + golesVisitantes + ", lugar=" + lugar + ", fecha=" + fecha + "]";
	}
}
