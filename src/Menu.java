import java.util.ArrayList;
import java.util.Scanner;

public class Menu{
    public static void main(String[] args) {
        ArrayList<Hospede> listaHospedes = new ArrayList<>();
        ArrayList<Quarto> listaQuartos = new ArrayList<>();
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Reserva acessarReserva = new Reserva(null, null);


        int opcao;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Cadastrar Hóspede");
            System.out.println("2. Cadastrar Quarto");
            System.out.println("3. Cadastrar Reserva");
            System.out.println("4. Listar Reservas");
            System.out.println("5. Excluir Reserva");
            System.out.println("6. Buscar Reserva");
            System.out.println("7. Editar Reserva");
            System.out.println("8. Listar Hóspedes");
            System.out.println("9. Sair");
            System.out.println("Escolha uma opção:");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    acessarReserva.criaReserva(listaQuartos, listaHospedes, listaReservas);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                case 9:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 9);

        scanner.close();
    }
}