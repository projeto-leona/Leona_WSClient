/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.leona.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.leona.station.controller.ControllerServicos;
import br.leona.station.controller.ControllerServicos_Service;
import java.util.ArrayList;
import java.util.List;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Jean Negrão
 */
@Resource
public class IndexController {  
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Leona_Station/ControllerServicos.wsdl")
    private ControllerServicos service;
   
    private Result result;
       
    public IndexController(Result result){
        this.result = result;       
        
    }    
    
    @Path("/")
    @SuppressWarnings("empty-statement")
    public void index(){    
        
        String antes;
        if(IsLigado()) antes = "Ligado";
        else antes = "Desligado";        
        
        List<br.leona.station.controller.Servico> listaServicos = new ArrayList<br.leona.station.controller.Servico>();
        listaServicos = GetListaServicos();
        
        SetLigaDesliga();
        
        String depois;
        if(IsLigado()) depois = "Ligado";
        else depois = "Desligado";      
        
        int direcao = Setdirecao("UP","10");
        
        result        
                .include("direcao", direcao)
                .include("antes", antes)
                .include("listService", listaServicos)
                .include("depois", depois)
                .forwardTo("index.jsp");
        
    }    
       
    public java.util.List<br.leona.station.controller.Servico> GetListaServicos() {
        try { 
            br.leona.station.controller.ControladorServicos port = service.getControladorServicosPort();
            System.out.println("Result = "+result);
            return port.getListaServicos();            
        } catch (Exception ex) {
            System.out.println("!! ERRO = "+ex);
             return null;
        }           
    }
    
    public boolean IsLigado() {
        try { // Call Web Service Operation
            br.leona.station.controller.ControladorServicos port = service.getControladorServicosPort();
            System.out.println("Result = "+result);
            return port.isLigado();
        } catch (Exception ex) {
             System.out.println("!! ERRO = Indeterminado, "+ex);
            return false;
        }
    }
    
    public void SetLigaDesliga() {
        try { // Call Web Service Operation
            br.leona.station.controller.ControladorServicos port = service.getControladorServicosPort();
            port.setLigaDesliga();
        } catch (Exception ex) {
            System.out.println("!! ERRO = "+ex);
        }
    }
    
    public int Setdirecao(String direcao, String graus) {
        try { // Call Web Service Operation
            br.leona.station.controller.ControladorServicos port = service.getControladorServicosPort();  
            return port.setDirecao(direcao, graus);
        } catch (Exception ex) {
             System.out.println("!! ERRO = "+ex);
             return 0;
        }
     }

}

