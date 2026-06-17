public class Utilidades {

    // 1. Método que suma dos números enteros
    public static int sumar(int a, int b) {
        return a + b;//Devuelve la suma entre a y b
    }

    // 2. Método que verifica si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;//Devuelve que el numero entre dos debe dar 0
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        System.out.println("Suma: " + sumar(5, 3));//Aqui esta sumando 5 mas tres
        System.out.println("¿Es par? " + esPar(10));//Aqui si se divide entre dos y da cero es par
    }
}
