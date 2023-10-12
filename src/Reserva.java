import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reserva {
    private Hospede hospede;
    private Quarto quarto;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    
    public Reserva(Hospede hospede, Quarto quarto, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
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

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }
    
    public int calcularDuracaoEstadia() {
        return (int) ChronoUnit.DAYS.between(dataCheckOut, dataCheckIn);
    }

    public boolean VerificarDisponibilidade(){
        LocalDate dataAtual = LocalDate.now();
        return !dataAtual.isBefore(dataCheckIn) && !dataAtual.isAfter(dataCheckOut);
    }

    public float calculoDeCustoTotal(){
        return quarto.getPreco() *calcularDuracaoEstadia();
    }

    public boolean irParaQuarto(Quarto quarto){
        return this.quarto.equals(quarto);
    }

    public void modificarDataCheckIn(LocalDate novaDataCheckIn){
        this.dataCheckIn = novaDataCheckIn;
    }

    public void modificarDataCheckOut(LocalDate novaDataCheckOut){
        this.dataCheckOut = novaDataCheckOut;
    }

    public String toString() {
        return "Reserva{" +
            "hospede=" + hospede.getNome() +
            ", quarto=" + quarto.getNumero_do_quarto() +
            ", dataCheckIn=" + dataCheckIn +
            ", dataCheckOut=" + dataCheckOut +
            '}';
    }

}
