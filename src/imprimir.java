import javax.xml.transform.stax.StAXResult;

public class imprimir {

    public static void imprimirLista(Nodo cabeza) {
        Nodo actual = cabeza;
        while (actual != null) {
            //System.out.println("a\n");
            System.out.println("Nombre: " + actual.getPaciente().getName() + " -> Estado: " + actual.getPaciente().getStado());
            actual = actual.getSiguiente();
        }
    }

    public static void imprirDespacho(int opcion, String nombre, int iden){

        if(opcion==1){

            System.out.println("El paciente " + nombre + " con identificación " + iden + " fue operado, medicado y dado de alta");

        }

        else if(opcion==2){

            System.out.println("El paciente " + nombre + "con identificación " + iden + " fue medicado y dado de alta");

        }

        else if(opcion==3){

            System.out.println("El paciente " + nombre + "con identificación " + iden + " fue revisado y dado de alta");


        }

        else{

            System.out.println("jhonattan ten piedad :,)\n");

        }




    }

}
