class DespacharPacientes {
    public static void Despachar(LEnlazada lista) {
        Nodo actual = lista.cabeza;
        while (actual != null) {
            if (actual.paciente.estado.equals("paciente crítico")) {
                System.out.println("El paciente " + actual.paciente.nombre + " con identificación " + actual.paciente.identificacion + " fue operado, medicado y dado de alta");
            } else if (actual.paciente.estado.equals("paciente urgente")) {
                System.out.println("El paciente " + actual.paciente.nombre + " con identificación " + actual.paciente.identificacion + " fue medicado y dado de alta");
            } else if (actual.paciente.estado.equals("paciente no critico")) {
                System.out.println("El paciente " + actual.paciente.nombre + " con identificación " + actual.paciente.identificacion + " fue revisado y dado de alta");
            }
            actual = actual.siguiente; // Avanza al siguiente nodo en cada iteración
        }
    }
}