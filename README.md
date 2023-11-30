# CollegeTest-A3
Exercício faculdade, reformulação de código em prol de buscar falhas e corrigi-las.

Vídeo do youtube com a explicação: https://www.youtube.com/watch?v=B1Ihh6AjAro

O código original dado a mim foi esse:

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro valor binário: ");
    String valor1 = scanner.nextLine();
    System.out.print("Digite a operação (+, -, *, /): ");
    String operacao = scanner.nextLine();
    System.out.print("Digite o segundo valor binário: ");
    String valor2 = scanner.nextLine();

    int resultado = 0;

    if (operacao.equals("+")) {
        resultado = Integer.parseInt(valor1, 2) + Integer.parseInt(valor2, 2);
    } else if (operacao.equals("-")) {
        resultado = Integer.parseInt(valor1, 2) - Integer.parseInt(valor2, 2);
    } else if (operacao.equals("*")) {
        resultado = Integer.parseInt(valor1, 2) * Integer.parseInt(valor2, 2);
    } else if (operacao.equals("/")) {
        resultado = Integer.parseInt(valor1, 2) / Integer.parseInt(valor2, 2);
    } else {
        System.out.println("Operação inválida.");
        return;
    }

    System.out.println("Resultado binário: " + Integer.toBinaryString(resultado));
