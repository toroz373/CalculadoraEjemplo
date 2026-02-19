
package proyectocalculadora;
/**
 * Clase ProyectoCalculadora
 *
 * Esta clase implementa una calculadora básica con dos operandos y un resultado.
 * Permite realizar operaciones de suma, resta, multiplicación y división.
 *
 * @author David
 * @version 1.0
 * @since 2026
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/">Java Documentation</a>
 */
public class ProyectoCalculadora {

    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor de la clase CalculadoraEjemplo.
     *
     * @param operando1 Primer número para operar.
     * @param operando2 Segundo número para operar.
     */
    public ProyectoCalculadora(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de los operandos.
     *
     * @return El resultado de la suma.
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de los operandos.
     *
     * @return El resultado de la resta.
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de los operandos.
     *
     * @return El resultado de la multiplicación.
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de los operandos.
     *
     * @return El resultado de la división.
     * @throws ArithmeticException Si el divisor es cero.
     */
    public double dividir() {
        if (operando2 == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }
        resultado = operando1 / operando2;
        return resultado;
    }

    /**
     * Devuelve el último resultado calculado.
     *
     * @return Último resultado almacenado.
     */
    public double getResultado() {
        return resultado;
    }
}
