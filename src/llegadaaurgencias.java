public class llegadaaurgencias {
    public static void Funcionamiento(){
        LEnlazada listaPacientes = new LEnlazada();

        imprimir imp = new imprimir();

        // Agrega pacientes a la lista enlazada
        Paciente thomas = new Paciente(13436, 15, "Thomas");
        Paciente juan = new Paciente(12837, 5, "Juan");
        Paciente pedro = new Paciente(12345, 10, "Pedro");
        Paciente maria = new Paciente(57453, 10, "Maria");
        Paciente jose = new Paciente(89785, 6, "Jose");

        listaPacientes.agregaralFinal(thomas);
        listaPacientes.agregaralFinal(juan);
        listaPacientes.agregaralFinal(pedro);
        listaPacientes.agregaralFinal(maria);
        listaPacientes.agregaralFinal(jose);

        // Imprime a los pacientes uno por uno
        System.out.println("\nLista de pacientes:\n");
        imp.imprimirLista(listaPacientes.getCabeza());

        // Clasifica a los pacientes según su estado
        for (Nodo nodo = listaPacientes.getCabeza(); nodo != null; nodo = nodo.getSiguiente()) {
            Clasf_Pacientes.clasificarpaciente(nodo.getPaciente());
        }

        // Imprime a los pacientes en el orden correcto según su estado
        System.out.println("\nLista de pacientes según su estado:\n");
        DespacharPacientes.Despachar(listaPacientes, imp);
    }
}


