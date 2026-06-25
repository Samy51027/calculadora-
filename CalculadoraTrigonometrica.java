import java.util.Scanner;

public class CalculadoraTrigonometrica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- CALCULADORA TRIGONOMÉTRICA (CE 1101) ---");
        System.out.print("Ingrese el valor del angulo alfa: ");
        double alfa = scanner.nextDouble();
        
        System.out.println("\n--- RESULTADOS ---");
        
        // Convertimos el ángulo a radianes ya que Math.sin/cos/tan lo requieren
        double radianes = Math.toRadians(alfa);
        
        System.out.println("sin(" + alfa + ") = " + Math.sin(radianes));
        System.out.println("cos(" + alfa + ") = " + Math.cos(radianes));
        System.out.println("tan(" + alfa + ") = " + Math.tan(radianes));
        
        scanner.close();
    }
}
