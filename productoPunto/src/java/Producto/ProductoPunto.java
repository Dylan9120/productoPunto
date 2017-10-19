package Producto;

/**
 *
 * @author Sergio Cañas
 */
public class ProductoPunto {
    
    public double Producto(double mg1, double mg2, double tetita){
        double resultado = 0;
        
        resultado = mg1 * mg2 * Math.cos(tetita);
        return resultado;
    }
}
