public class Elecciones {
    public Candidato[] candidatos;

    public Elecciones(Candidato[] listaCandidatos) {
        candidatos = listaCandidatos;
    }

    public void vaciarUrnas() {
        for (Candidato c : candidatos) {
            c.resetearVotos();
        }
    }

    public int totalVotos() {
        int total = 0;
        for (Candidato c : candidatos) {
            total += c.calcularTotalVotos();
        }
        return total;
    }

    public void porcentajeVotos() {
        int total = totalVotos();
        for (Candidato c : candidatos) {
            double porcentaje = total > 0 ? (c.calcularTotalVotos() * 100.0 / total) : 0;
            System.out.println(c.nombre + ": " + porcentaje + "%");
        }
    }

    public void promedioCostoCampaña() {
        int totalCosto = 0;
        for (Candidato c : candidatos) {
            totalCosto += c.calcularCostoCampaña();
        }
        double promedio = totalCosto / (double) candidatos.length;
        System.out.println("Costo promedio de campaña: $" + promedio);
    }
}
