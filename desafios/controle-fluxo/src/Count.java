import java.util.Scanner;

public class Count {
    
public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Enter the first parameter");
		int parameterOne = terminal.nextInt();
		System.out.println("Enter the second parameter");
		int parameterTwo = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parameterOne, parameterTwo);

		} catch (InvalidParametersException exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("The second parameter must be greater than the first");
		}

        terminal.close();
	}

	static void contar(int parameterOne, int parameterTwo) throws InvalidParametersException {
        // validar se parameterOne é MAIOR que parameterTwo e lançar a exceção
        if (parameterOne > 0 && parameterTwo > 0) {
            throw new InvalidParametersException("Entered numbers cannot be negative");
		}
		if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("The second parameter must be greater than the first "+parameterTwo+" is not greater than "+parameterOne);
		}
        int counting = parameterTwo - parameterOne;
		
        // realizar o for para imprimir os números com base na variável counting
        
		for (int i = 0; i < counting; i++) {
			System.out.println(i + 1);
		}
	}
}