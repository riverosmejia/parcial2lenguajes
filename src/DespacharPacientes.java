class DespacharPacientes {
    public static void Despachar(LEnlazada lista, imprimir imp) {
        Nodo actual = lista.getCabeza();
        while (actual != null) {
            if (actual.getPaciente().getStado().equals("paciente crítico")) {
                imp.imprirDespacho(1,actual.getPaciente().getName(),actual.getPaciente().getIden());
            } else if (actual.getPaciente().getStado().equals("paciente urgente")) {
                imp.imprirDespacho(2,actual.getPaciente().getName(),actual.getPaciente().getIden());
            } else if (actual.getPaciente().getStado().equals("paciente no critico")) {
                imp.imprirDespacho(3,actual.getPaciente().getName(),actual.getPaciente().getIden());   
                   }
            actual = actual.getSiguiente();// Avanza al siguiente nodo en cada iteración
        }
    }
}