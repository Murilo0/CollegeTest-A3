# CollegeTest-A3

Exercício da faculdade, reformulação de código em prol de buscar falhas e corrigi-las, o código ao final deve ser capaz de executar sem falhas operações matemáticas com valores binários.

Para acessar o código totalmente reformulado acesse a pasta JavaProjects -> A3-2Dezembro2023.java

Vídeo do youtube com a explicação do motivo das mudanças no código: 

https://www.youtube.com/watch?v=B1Ihh6AjAro

O código original era esse:

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
