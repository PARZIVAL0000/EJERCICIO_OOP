package HPI;


/*
 Crea una clase Persona con las siguientes variables:

La edad

El nombre

El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */


public class ejercicio {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 50;
        cliente.nombre = "Gerald";
        cliente.telefono = "0984849847";
        cliente.credito = 50;

        System.out.println("INFORMACION CLIENTE");
        System.out.println("\n[*] Nombre: " + cliente.nombre);
        System.out.println("[*] Edad: " + cliente.edad);
        System.out.println("[*] Telefono: " + cliente.telefono);
        System.out.println("[*] Credito: " + cliente.credito);


        Trabajador trabajador = new Trabajador();
        trabajador.edad = 45;
        trabajador.nombre = "Tom";
        trabajador.telefono = "0494894389";
        trabajador.salario = 120.000;


        System.out.println("\nINFORMACION TRABAJADOR");
        System.out.println("\n[*] Nombre: " + trabajador.nombre);
        System.out.println("[*] Edad: " + trabajador.edad);
        System.out.println("[*] Telefono: " + trabajador.telefono);
        System.out.println("[*] Salario: " + trabajador.salario);
    }   
}

class Persona{
    public int edad;
    public String nombre;
    public String telefono;
}

class Cliente extends Persona{
    public int credito;
}


class Trabajador extends Persona{
    public double salario;
}


