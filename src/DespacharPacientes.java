class DespacharPacientes {
    public static void Despachar(LEnlazada lista, imprimir imp) {
        Nodo actual = lista.cabeza;
        while (actual != null) {
            if (actual.paciente.estado.equals("paciente crítico")) {
                imp.imprirDespacho(1,actual.paciente.nombre,actual.paciente.identificacion);
            } else if (actual.paciente.estado.equals("paciente urgente")) {
                imp.imprirDespacho(2,actual.paciente.nombre,actual.paciente.identificacion);
            } else if (actual.paciente.estado.equals("paciente no critico")) {
                imp.imprirDespacho(3,actual.paciente.nombre,actual.paciente.identificacion);   
                   }
            actual = actual.siguiente; // Avanza al siguiente nodo en cada iteración
        }
    }
}