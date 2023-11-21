package JavaProjects;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class main{
    public static void main(String[] args) {

        // Criaremos uma Array para armazenar os tipos de operações válidas;

        List<Character> validChars = Arrays.asList('*', '/', '+', '-');

        //Criando as variáveis que serão utilizadas ao longo do processo;

        int valor1= 1;
        int valor2= 1;
        int resultadoSoma = valor1 + valor2;
        int resultadoSub = valor1 - valor2;
        int resultadoMult = valor1 * valor2;
        int resultadoDiv = valor1 / valor2;
        String tipo_operacao = "Não definida";
        boolean numeroValido = true;
            

        ///
        
        System.out.println("Digite o primeiro valor:");
        try(Scanner inputScanner = new Scanner(System.in)){
            while(true) {
                String input = inputScanner.nextLine().trim();
                for (int i = 0; i < input.length(); i++) {
                    Character caractere = input.charAt(i);
                    if (Character.isDigit(caractere) == false) {
                        numeroValido = false;
                        break;
                    }
                    else{
                        numeroValido = true;
                        break;
                    }
                }
                if (numeroValido == true){
                    valor1 = Integer.parseInt(input);
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
        try (Scanner inputScanner = new Scanner(System.in)) {
			while (true) {
				// o "nextLine" ao invés do "next" é pra pegar o input mesmo que o usuário só tecle enter sem digitar nada
				// o "trim" é uma função pra remover espaços vazios
				String input = inputScanner.nextLine().trim();

				// verifica se tem apenas um caracter primeiro. Se não tiver, nem chamará o "contains"
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
        

        /*try {
            System.out.println("Digite o segundo valor binário: ");
            valor2 = inputScanner.nextInt();
        } catch (Exception e) {
            System.out.println("Por favor, digite um número.");
        }*/
        
    }
}