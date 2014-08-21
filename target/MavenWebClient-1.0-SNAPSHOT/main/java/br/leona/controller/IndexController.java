/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.leona.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Jean Negrão
 */
@Resource
public class IndexController {  
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Leona_Station/ControllerServicos.wsdl")
  
    private Result result;
    
    public IndexController(Result result){
        this.result = result;        
    }    
    
    @Path("/")
    @SuppressWarnings("empty-statement")
    public void index(){   
        
        result                 
                .include("listService", GetListaServicos())
                .forwardTo("index.jsp");
        
    }    
         
    private static java.util.List<br.leona.station.controller.Servico> GetListaServicos() {
        
        br.leona.station.controller.ControllerServicos_Service service = new br.leona.station.controller.ControllerServicos_Service();
        br.leona.station.controller.ControllerServicos port = service.getControllerServicosPort();
        return port.getListaServicos();
            
    }

}

