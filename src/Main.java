import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Candidato c1 = new Candidato("Laura");
        Candidato c2 = new Candidato("Carlos");
        Candidato c3 = new Candidato("Elena");

        Candidato[] lista = {c1, c2, c3};
        Elecciones elecciones = new Elecciones(lista);

        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Votar");
            System.out.println("2. Ver porcentaje de votos");
            System.out.println("3. Ver costo promedio de campaña");
            System.out.println("4. Vaciar urnas");
            System.out.println("5. Ver total de votos");
            System.out.println("6. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Candidatos:");
                    for (int i = 0; i < lista.length; i++) {
                        System.out.println((i + 1) + ". " + lista[i].nombre);
                    }
                    System.out.print("Seleccione candidato: ");
                    int candidatoSeleccionado = sc.nextInt() - 1;

                    System.out.print("Medio (internet/radio/tv): ");
                    String medio = sc.next();
                    lista[candidatoSeleccionado].votar(medio);
                    break;

                case 2:
                    elecciones.porcentajeVotos();
                    break;

                case 3:
                    elecciones.promedioCostoCampaña();
                    break;

                case 4:
                    elecciones.vaciarUrnas();
                    System.out.println("Urnas vaciadas.");
                    break;

                case 5:
                    System.out.println("Total votos: " + elecciones.totalVotos());
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
