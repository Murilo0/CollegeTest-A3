package JavaProjects;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class main{


    static int calcule(String x , String operator , String y){
        if (operator.equals("+")){
            int resultado = Integer.parseInt(x,2) + Integer.parseInt(y,2);
            return resultado;
        }
        if (operator.equals("-")){
            int resultado = Integer.parseInt(x,2) - Integer.parseInt(y,2);
            return resultado;
        }
        if (operator.equals("*")){
            int resultado = Integer.parseInt(x,2) * Integer.parseInt(y,2);
            return resultado;
        }
        if (operator.equals("/")){
            int resultado = Integer.parseInt(x,2) / Integer.parseInt(y,2);
            return resultado;
        }
        else{
            return 0;
        }
    }

    static String convertToBinaryString(int x){
        return Integer.toBinaryString(x);
    }

    public static void main(String[] args) {

        // Criaremos uma Array para armazenar os tipos de operações válidas;

        List<Character> validChars = Arrays.asList('*', '/', '+', '-');

        //Criando as variáveis que serão utilizadas ao longo do processo;

        String valor1= "0";
        String valor2= "0";
        String tipo_operacao = "Não definida";
        boolean numeroValido = true;
  
        ///

        System.out.println("Digite o primeiro valor:");
        try{
            Scanner inputScanner = new Scanner(System.in);
            while(true) {
                String input = inputScanner.nextLine().trim();
                for (int i = 0; i < input.length(); i++) {
                    Character caractere = input.charAt(i);
                    if (!Character.isDigit(caractere) && (i) !='0' || input.charAt(i) !='1') {
                        numeroValido = false;
                        break;
                    }
                    else{
                        numeroValido = true;
                        break;
                    }
                }
                if (numeroValido){
                    valor1 = input;
                    break;
                }
                else{
                    System.out.println("Tente com um número válido:");
                }
            }
        } catch (Exception e){
            System.out.println("Algo de errado aconteceu. Revise o código!");
        }


        System.out.println("Digite a operação (+, -, *, /): ");
        try{
            Scanner inputScanner = new Scanner(System.in);
            while (true) {
                String input = inputScanner.nextLine().trim();
                if (input.length() == 1 && validChars.contains(input.charAt(0))) {
                    tipo_operacao = input;
                    break; // entrada válida, saia do loop
                } else {
                    System.out.println("Tente novamente com um tipo de operação válido (*, /, +, -):");
                }
            }
        } catch (Exception e) {
            System.out.println("Algo de errado aconteceu. Revise o código né!");
        }

        System.out.println("Digite o segundo valor:");
        try{
            Scanner inputScanner = new Scanner(System.in);
            while(true) {
                String input = inputScanner.nextLine().trim();
                for (int i = 0; i < input.length(); i++) {
                    Character caractere = input.charAt(i);
                    if (!Character.isDigit(caractere) && (i) !='0' || input.charAt(i) !='1') {
                        numeroValido = false;
                        break;
                    }
                    else{
                        numeroValido = true;
                        break;
                    }
                }
                if (numeroValido){
                    valor2 = input;
                    break;
                }
                else{
                    System.out.println("Tente com um número válido:");
                }
            }
        } catch (Exception e){
            System.out.println("Algo de errado aconteceu. Revise o código!");
        }

        String mensagemFinal = """
            
                A operação solicitada foi: %s %s %s = %s

                """.formatted(valor1, tipo_operacao , valor2 , convertToBinaryString(calcule(valor1, tipo_operacao, valor2)));

        System.out.println(mensagemFinal);

    }
}