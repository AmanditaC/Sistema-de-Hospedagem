import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

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

    public Reserva(Quarto quarto2, Hospede hospede2) {
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

    public void criaReserva(ArrayList<Quarto> listaQuartos, ArrayList<Hospede> listaHospedes,
    ArrayList<Reserva> listaReservas) {

        Quarto ChamarQuarto = new Quarto(false, null, 0, 0);
        Hospede chamarHospede = new Hospede(null, 0, null, 0, null);
        // Chame os métodos para cadastrar quarto e realizar hospedagem
        ChamarQuarto.CadastrandoQuarto(listaQuartos);
        chamarHospede.realizarHospedagem(listaHospedes);
    
        // Associe o quarto e o hóspede à reserva
        Quarto quarto = listaQuartos.get(listaQuartos.size() - 1); // Pega o quarto cadastrado
        Hospede hospede = listaHospedes.get(listaHospedes.size() - 1); // Pega o hóspede cadastrado
    
        Reserva reserva = new Reserva(quarto, hospede);
    
        // Adicione a reserva à lista de reservas
        listaReservas.add(reserva);
    
        System.out.println("Reserva criada com sucesso!\n");
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
