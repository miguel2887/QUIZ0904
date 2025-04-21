public class Candidato extends Persona {
    public int votosInternet;
    public int votosRadio;
    public int votosTV;

    public Candidato(String nombreCandidato) {
        super(nombreCandidato);
        votosInternet = 0;
        votosRadio = 0;
        votosTV = 0;
    }

    public void votar(String medio) {
        switch (medio.toLowerCase()) {
            case "internet":
                votosInternet++;
                break;
            case "radio":
                votosRadio++;
                break;
            case "tv":
                votosTV++;
                break;
            default:
                System.out.println("Medio inválido.");
        }
    }

    public int calcularTotalVotos() {
        return votosInternet + votosRadio + votosTV;
    }

    public int calcularCostoCampaña() {
        return (votosInternet * 700000) + (votosRadio * 200000) + (votosTV * 600000);
    }

    public void resetearVotos() {
        votosInternet = 0;
        votosRadio = 0;
        votosTV = 0;
    }
}

