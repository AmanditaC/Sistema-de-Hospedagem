import java.util.ArrayList;
import java.util.Scanner;


    public class Hospede {
        private String nome;
        private int duracaoDeEstadia;
        private String documento;
        private int numeroDoHospede;
        private ArrayList<Hospede> hospedes;


        public Hospede(String nome, int duracaoDeEstadia, String documento, int numeroDoHospede) {
            this.nome = nome;
            this.duracaoDeEstadia = duracaoDeEstadia;
            this.documento = documento;
            this.numeroDoHospede = numeroDoHospede;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getDuracaoDeEstadia() {
            return duracaoDeEstadia;
        }

        public void setDuracaoDeEstadia(int duracaoDeEstadia) {
            this.duracaoDeEstadia = duracaoDeEstadia;
        }

        public String getDocumento() {
            return documento;
        }

        public void setDocumento(String documento) {
            this.documento = documento;
        }

        public int getNumeroDoHospede() {
            return numeroDoHospede;
        }

        public void setNumeroDoHospede(int numeroDoHospede) {
            this.numeroDoHospede = numeroDoHospede;
        }

    

        public void inserirHospede(Hospede hospede) {
            hospedes.add(hospede);
        }

        public Hospede excluirReservaH(int numeroInformado) {
            hospedes.removeIf(h -> h.getNumeroDoHospede() == numeroInformado);
            return this;
        }

        public static void realizarHospedagem(ArrayList<Hospede> listaHospedes) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Informe o nome:");
            String nome = scanner.nextLine();
            System.out.println("Informe a duracao da estadia:");
            int duracao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente
            System.out.println("Informe o documento:");
            String documento = scanner.nextLine();
            System.out.println("Informe o numero do hospede:");
            int numero = scanner.nextInt();
    
            Hospede novaReserva = new Hospede(nome, duracao, documento, numero);
            listaHospedes.add(novaReserva);
    
            System.out.println("Hospedagem realizada com sucesso!\n");
    
        }

        public static void listarReservaH(ArrayList<Hospede> listaHospedes) {
            if (!listaHospedes.isEmpty()) {
                System.out.println("Detalhes das reservas:");
                for (Hospede hospede : listaHospedes) {
                    System.out.println("Nome: " + hospede.getNome());
                    System.out.println("Tempo de duracao: " + hospede.getDuracaoDeEstadia());
                    System.out.println("Documento: " + hospede.getDocumento());
                    System.out.println("Numero do hospede: " + hospede.getNumeroDoHospede());
                    System.out.println("------------------------");
                }
            } else {
                System.out.println("Não há reservas cadastradas.");
            }
        }

        public static void buscarReservaH(int numeroInformado, ArrayList<Hospede> listaHospedes) {
            boolean encontrou = false;
    
            for (Hospede hospede : listaHospedes) {
                if (hospede.getNumeroDoHospede() == numeroInformado) {
                    encontrou = true;
                    System.out.println("Detalhes da reserva:");
                    System.out.println("Nome: " + hospede.getNome());
                    System.out.println("Tempo de duracao: " + hospede.getDuracaoDeEstadia());
                    System.out.println("Documento: " + hospede.getDocumento());
                    System.out.println("Numero do hospede: " + hospede.getNumeroDoHospede());
                    System.out.println("------------------------");
                }
            }
    
            if (!encontrou) {
                System.out.println("Não foi encontrada nenhuma reserva com o número informado.");
            }
        }

        public static void editarReservaH(ArrayList<Hospede> listaHospedes, int numeroInformado) {
            boolean encontrado = false;
            Scanner scanner = new Scanner(System.in);
    
            for (Hospede hospede : listaHospedes) {
                if (hospede.getNumeroDoHospede() == numeroInformado) {
                    encontrado = true;
                    System.out.println("Informe o novo nome:");
                    hospede.setNome(scanner.nextLine());
                    System.out.println("Novo tempo de duracao:");
                    hospede.setDuracaoDeEstadia(scanner.nextInt());
                    scanner.nextLine(); // Consumir a quebra de linha pendente
                    System.out.println("Novo documento:");
                    hospede.setDocumento(scanner.nextLine());
                    System.out.println("Reserva editada com sucesso!!");
                }
            }
    
            if (!encontrado) {
                System.out.println("Não foi possível localizar a reserva!!");
            }
        }

        public int quantidadeDeHospedes() {
            return hospedes.size();
        }
    }

    