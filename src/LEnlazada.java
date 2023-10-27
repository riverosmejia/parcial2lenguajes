class LEnlazada {
    private Nodo cabeza;
    private Nodo ultimo; // Agregamos un nodo "último" para mantener un seguimiento del último nodo en la lista

    public LEnlazada() {
        this.cabeza = null;
        this.ultimo = null;
    }

    public void agregarpaciente(Paciente paciente) {
        Nodo nuevoNodo = new Nodo(paciente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo; // Establecemos el último nodo
        } else {
            nuevoNodo.SetSiguiente(cabeza);
            cabeza = nuevoNodo;
        }
    }

    public void agregaralFinal(Paciente paciente) {
        Nodo nuevoNodo = new Nodo(paciente);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            ultimo = nuevoNodo; // Establecemos el último nodo
        } else {
            ultimo.SetSiguiente(nuevoNodo); // Agregamos el nuevo nodo al final
            ultimo = nuevoNodo; // Actualizamos el último nodo
        }
    }

    public Nodo getCabeza(){

        return cabeza;

    }


}
