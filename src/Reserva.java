public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    
    public Reserva(Hospede hospede, Quarto quarto) {
        this.hospede = hospede;
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    
}
