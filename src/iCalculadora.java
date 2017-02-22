
/**
 * @author María Mercedes Retolaza Reyna, 16339 
 * Interfaz que implementa los metodos de la calculadora, esta es la misma que se utilizó
 * en el programa anterior (Calculadora Infix Primera Entrega) Debido a que no necesita ningun 
 * cambio porque sigue utilizando los mismos parametros. 
 *
 */
public interface iCalculadora {

	/**Metodo que opera, recibe un parametro de la interfaz de iStack 
	 * @param n
	 * @param v
	 * @return
	 * Recibe un parametro tipo string que se encarga de operar los valores y un parametro tipo 
	 * stack que se encarga de realizar las diferentes operaciones del stack /llevar a cabo sus 
	 * metodos) 
	 */
	public double operar (String n, iStack v);

	/**Metodo que realza la suma de dos valores dentro de la operacion infix
	 * @param a
	 * @param b
	 * @return
	 */
	public double suma(double a, double b);

	/**Metodo que realiza la resta de dos valores dentro de la operacion 
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