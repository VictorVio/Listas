import java.util.*;

public class Listas {
    public void arrays() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        boolean reprocess = true;
        while (reprocess) {

            Scanner codeInput = new Scanner(System.in);
            System.out.println("Digite o codigo do produto");

            int productCode = codeInput.nextInt();
            boolean found = false;

                for (int i = 0; i < array.length; i++) {
                    if (productCode == array[i]) {
                    found = true;
                    }
                }
            if (found) {
                System.out.println("Produto ENCONTRADO na lista");
            }else {
                System.out.println("Produto NÃO ENCONTRADO na lista");
            }

            System.out.println("Digite '1' para verificar outro produto");
            String continuing = codeInput.next();

            if (!Objects.equals(continuing, "1")){
                reprocess = false;
                System.out.println("Encerrando...");
            }
        }
    }


    public void arrays1() {
        int[] array = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        boolean reprocess = true;
        while (reprocess) {

            Scanner codeInput = new Scanner(System.in);
            System.out.println("Digite o codigo do produto");

            int productCode = codeInput.nextInt();
            boolean found = false;

            for (int product: array) {
                if (productCode == product) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Produto ENCONTRADO na lista");
            }else {
                System.out.println("Produto NÃO ENCONTRADO na lista");
            }

            System.out.println("Digite '1' para verificar outro produto");
            String continuing = codeInput.next();

            if (!Objects.equals(continuing, "1")){
                reprocess = false;
                System.out.println("Encerrando...");
            }
        }
    }


    public void lists() {
        boolean reprocess = true;
        while (reprocess) {

            Scanner codeInput = new Scanner(System.in);
            System.out.println("Digite o codigo do produto");

            if (Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
                    .contains(codeInput.nextInt())) {
                System.out.println("Produto ENCONTRADO na lista");
            }else {
                System.out.println("Produto NÃO ENCONTRADO na lista");
            }

            System.out.println("Digite '1' para verificar outro produto");

            if (!Objects.equals(codeInput.next(), "1")){
                reprocess = false;
                System.out.println("Encerrando...");
            }
        }
    }


    public void set() {
        boolean reprocess = true;
        Scanner codeInput = new Scanner(System.in);
        List<Integer>estoque = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        Set<Integer>compras = new HashSet<>();


        while (reprocess) {

            System.out.println("Digite o codigo do produto");
            Integer codigo = codeInput.nextInt();
            if (estoque.contains(codigo)) {
                compras.add(codigo);
                compras.add(codigo); // inutil
            }else {
                System.out.println("Produto NÃO ENCONTRADO na lista");
            }

            System.out.println("Digite '1' para verificar outro produto");

            if (!Objects.equals(codeInput.next(), "1")){
                reprocess = false;
                System.out.println("Encerrando...");
            }
        }
    }


    public void map() {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Coca-cola");
        map.put(2, "Coca-cola light");
        map.put(3, "Coca-cola zero");
        map.put(4, "Coca-cola sem gas");
        map.put(5, "Coca-cola boliviana");

        Scanner codeInput = new Scanner(System.in);

        System.out.println("Digite o codigo do produto");
        Integer codigo = codeInput.nextInt();
        if (map.containsKey(codigo)) {
            System.out.println("O produto é " + map.get(codigo));
        }
    }
}
