package JavaProjects;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class main{

    static int calcule(int x , String operator , int y){
        int tempX = getDecimalNumber(x);
        int tempY = getDecimalNumber(y);

        if (operator.equals("+")){
            int resultado = tempX + tempY;
            return resultado;
        }
        if (operator.equals("-")){
            int resultado = tempX - tempY;
            return resultado;
        }
        if (operator.equals("*")){
            int resultado = tempX * tempY;
            return resultado;
        }
        if (operator.equals("/")){
            int resultado = tempX / tempY;
            return resultado;
        }
        else{
            return 0;
        }
    }

    public static boolean isInt(String v) {
        try {
            Integer.parseInt(v);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    
    public static int getDecimalNumber(int x){
        int tempBinaryNumber = x;
        int decimalNumber = 0;
        int power = 0;
        while(tempBinaryNumber > 0){
            //taking the rightmost digit from binaryNumber
            int temp = tempBinaryNumber%10;
            //now multiplying the digit and adding it to decimalNumber variable
            decimalNumber += (temp*Math.pow(2, power));
            //removing the rightmost digit from binaryNumber variable
            tempBinaryNumber = tempBinaryNumber / 10;
            //incrementing the power variable by 1 to be used as power for 2
            power++;
        }
        return decimalNumber;
    }

    public static boolean isBinary(String x){
        int converted = Integer.parseInt(x);
        if (converted == 0 || converted == 1 || converted < 0) {
            return false;
        }
        while (converted != 0) {
            if (converted % 10 > 1) {
                return false;
            }
            converted = converted / 10;
        }
        return true;
    }

    public static int StringToInt(String x){
        int converted = Integer.parseInt(x);
        return converted;
    }

    public static boolean validNumber(String x){
        return true;
    }

    static String convertToBinaryString(int x){
        return Integer.toBinaryString(x);
    }

    public static void main(String[] args) {

        // Criaremos uma Array para armazenar os tipos de operações válidas;

        List<Character> validChars = Arrays.asList('*', '/', '+', '-');

        //Criando as variáveis que serão utilizadas ao longo do processo;

        int valor1= 0;
        int valor2= 0;
        String tipo_operacao = "Não definida";
        boolean numeroValido = true;

        ///

        System.out.println("Digite o primeiro valor:");
        try{
            Scanner inputScanner = new Scanner(System.in);
            while(true) {
                String input = inputScanner.nextLine().trim();
                for (int i = 0; i < input.length();) {
                    Character caractere = input.charAt(i);
                    if (!isInt(input) || input.length() > 10 || !Character.isDigit(caractere) || (!isBinary(input))){
                        numeroValido = false;
                        break;
                    }
                    else{
                        numeroValido = true;
                        break;
                    }
                }
                if (numeroValido){
                    valor1 = StringToInt(input);
                    break;
                }
                else{
                    System.out.println("Número grande demais ou inválido, tente com um número válido:");
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
                for (int i = 0; i < input.length();) {
                    Character caractere = input.charAt(i);
                    if (isInt(input) ||input.length() > 10 || !Character.isDigit(caractere) || (!isBinary(input))){
                        numeroValido = false;
                        break;
                    }
                    else{
                        numeroValido = true;
                        break;
                    }
                }
                if (numeroValido){
                    valor2 = StringToInt(input);
                    break;
                }
                else{
                    System.out.println("Número grande demais ou inválido, tente com um número válido:");
                }
            }
        } catch (Exception e){
            System.out.println("Algo de errado aconteceu. Revise o código!");
        }

        String mensagemFinal = """
            
                A operação solicitada foi: %d %s %d = %s

                """.formatted(valor1, tipo_operacao , valor2 , convertToBinaryString(calcule(valor1, tipo_operacao, valor2)));

        System.out.println(mensagemFinal);

    }
}