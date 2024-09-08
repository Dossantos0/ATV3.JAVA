import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pedido 1: Números de 1 a 50 com While:");
        int i = 1;
        while (i <= 50) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nPedido 2: Números de 1 a 50 com For:");
        for (int j = 1; j <= 50; j++) {
            System.out.println(j);
        }

        System.out.println("\nPedido 3: Números pares de 1 a 50 com For:");
        for (int k = 2; k <= 50; k += 2) {
            System.out.println(k);
        }

        System.out.println("\nPedido 4: Números ímpares de 1 a 50 com While:");
        int l = 1;
        while (l <= 50) {
            if (l % 2 != 0) {
                System.out.println(l);
            }
            l++;
        }

        System.out.println("\nPedido 5: Números maiores que 3 no array:");
        int[] numeros = {1, 4, 6, 3, 5, 7, 2, 8, 10, 9};
        for (int m = 0; m < numeros.length; m++) {
            if (numeros[m] > 3) {
                System.out.println(numeros[m]);
            }
        }

        System.out.println("\nPedido 6: Manipulação de ArrayList:");
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Talles");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        nomes.add("Pedro");

        nomes.remove(1);

        System.out.println("Após remover o segundo nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        nomes.remove(2);

        System.out.println("\nApós remover o terceiro nome:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        if (nomes.get(0).equals("Talles")) {
            System.out.println("\nO primeiro nome é Talles.");
        } else {
            System.out.println("\nO primeiro nome não é Talles.");
        }
    }
}