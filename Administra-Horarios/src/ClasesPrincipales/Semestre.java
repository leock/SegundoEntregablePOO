package ClasesPrincipales;

import java.io.*;
import java.util.*;

public class Semestre {

	private int numero;
	private LinkedList<Asignatura> asignaturas;

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public LinkedList<Asignatura> getAsignaturas() {
            return asignaturas;
        }

        public void setAsignaturas(LinkedList<Asignatura> asignaturas) {
            this.asignaturas = asignaturas;
        }

	public Semestre(int n) {
		this.numero = n;
                this.asignaturas = new LinkedList();
	}

}