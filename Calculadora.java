public class Calculadora {
    public static void main(String[] args) {
        // Valores predefinidos (puedes cambiarlos aquí)
        double num1 = 10.5;
        char operador = '*';
        double num2 = 3.2;
        double resultado = 0;
        switch (operador) {
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: División entre cero");
                } else {                //Añado estos comentarios para hacer commit and push. CURRA RODRÍGUEZ BERMÚDEZ
                    resultado = num1 / num2;
                }
                break;
            default:
                System.out.println("Operador inválido");
                return;
        }
        System.out.println("Resultado: " + resultado);
    }

    //modificación para PULL
}
