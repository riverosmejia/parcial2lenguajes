class Nodo {
    private Paciente paciente;
    private Nodo siguiente;

    public Nodo(Paciente paciente){
        this.paciente=paciente;
        this.siguiente=null;
    }

    public Paciente getPaciente(){

        return paciente;

    }

    public Nodo getSiguiente(){

        return siguiente;

    }

    public void SetSiguiente(Nodo sig1){

        this.siguiente=sig1;

    }

}