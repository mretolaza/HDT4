
/**
 * @author María Mercedes Retolaza Reyna, 16339 
 * Interfaz que implementa los metodos de la calculadora, esta es la misma que se utilizó
 * en el programa anterior (Calculadora Infix Primera Entrega) Debido a que no necesita ningun 
 * cambio porque sigue utilizando los mismos parametros. 
 *
 */
public interface iCalculadora {

	/**
	 * @param n
	 * @param v
	 * @return
	 */
	public double operar (String n, iStack v);

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double suma(double a, double b);

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double resta(double a, double b);

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public double multiplicacion(double a, double b);

	public double division(double a, double b);

}