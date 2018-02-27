
package co.edu.uniminuto.ws.soap;

import co.edu.uniminuto.ejb.facade.IvaFacadeLocal;
import co.edu.uniminuto.ejb.interfaz.IivaInterface;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author cgordilg
 */
@WebService(serviceName="consumoIva")
public class WsIva {
    @EJB
    private IivaInterface ivaFacade;
    
    @WebMethod(action="calcularIva")
    public float consumirIva(@WebParam(name="valorProducto")double valor)
            throws Exception
    {
        ivaFacade=new IvaFacadeLocal();
        return ivaFacade.calcularIva(valor);
    }
    
}
