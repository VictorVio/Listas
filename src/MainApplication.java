import java.util.Objects;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        try{
            Scanner scan = new Scanner(System.in);

            String sSystem, sOption;

            boolean bSistema = true;
            while (bSistema){

                System.out.println("O que deseja abrir?");
                System.out.println("1 - Array, 2 - Array2, 3 - Listas, 4 - Set, 5 - Map." );

                sOption = scan.next();
                Listas listacao = new Listas();

                switch(sOption) {

                    case "1":
                        System.out.println("Abrindo arrays...\n");
                        listacao.arrays();
                        break;
                    case "2":
                        System.out.println("Abrindo arrays1...\n");
                        listacao.arrays1();
                        break;
                    case "3":
                        System.out.println("Abrindo generico.Listas...\n");
                        listacao.lists();
                        break;
                    case "4":
                        System.out.println("Abrindo set...\n");
                        listacao.set();
                        break;
                    case "5":
                        System.out.println("Abrindo o mapa...\n");
                        listacao.map();
                        break;
                }

                System.out.println("Deseja selecionar outro sistema?");

                sSystem = scan.next();
                bSistema = Objects.equals(sSystem, "sim");
            }

            System.out.println("Encerrando sistema!");

            scan.close();
        } catch (ArithmeticException e){
            System.out.println("Erro" + e.getMessage());
        } catch (NullPointerException e){
            System.out.println("Há algo nulo " + e.getMessage());
        }

    }
}
