
package co.edu.uniminuto.ejb.facade;

import co.edu.uniminuto.ejb.interfaz.IivaInterface;
import javax.ejb.Stateless;

/**
 *
 * @author cgordilg
 */
@Stateless
public class IvaFacadeLocal implements IivaInterface
{
 
    /**
     * 
     * @param valor
     * @return 
     */
    @Override
    public float calcularIva(double valor)
    {
        return (float) (valor*0.19);
    }
}
