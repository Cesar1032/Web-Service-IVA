package co.edu.uniminuto.ejb.interfaz;

import javax.ejb.Local;

/**
 *
 * @author cgordilg
 */
@Local
public interface IivaInterface {

    /**
     *
     * @param valor
     * @return
     */
    public float calcularIva(double valor);    
}
