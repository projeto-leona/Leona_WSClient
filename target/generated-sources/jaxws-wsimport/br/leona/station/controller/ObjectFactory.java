
package br.leona.station.controller;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.leona.station.controller package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetDirecao_QNAME = new QName("http://controller.station.leona.br/", "SetDirecao");
    private final static QName _SetLigaDesliga_QNAME = new QName("http://controller.station.leona.br/", "SetLigaDesliga");
    private final static QName _IsLigado_QNAME = new QName("http://controller.station.leona.br/", "isLigado");
    private final static QName _SetListaServicos_QNAME = new QName("http://controller.station.leona.br/", "SetListaServicos");
    private final static QName _IsLigadoResponse_QNAME = new QName("http://controller.station.leona.br/", "isLigadoResponse");
    private final static QName _SetLigaDesligaResponse_QNAME = new QName("http://controller.station.leona.br/", "SetLigaDesligaResponse");
    private final static QName _GetListaServicosResponse_QNAME = new QName("http://controller.station.leona.br/", "GetListaServicosResponse");
    private final static QName _GetListaServicos_QNAME = new QName("http://controller.station.leona.br/", "GetListaServicos");
    private final static QName _SetDirecaoResponse_QNAME = new QName("http://controller.station.leona.br/", "SetDirecaoResponse");
    private final static QName _SetListaServicosResponse_QNAME = new QName("http://controller.station.leona.br/", "SetListaServicosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.leona.station.controller
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsLigadoResponse }
     * 
     */
    public IsLigadoResponse createIsLigadoResponse() {
        return new IsLigadoResponse();
    }

    /**
     * Create an instance of {@link SetListaServicos }
     * 
     */
    public SetListaServicos createSetListaServicos() {
        return new SetListaServicos();
    }

    /**
     * Create an instance of {@link SetLigaDesligaResponse }
     * 
     */
    public SetLigaDesligaResponse createSetLigaDesligaResponse() {
        return new SetLigaDesligaResponse();
    }

    /**
     * Create an instance of {@link IsLigado }
     * 
     */
    public IsLigado createIsLigado() {
        return new IsLigado();
    }

    /**
     * Create an instance of {@link SetLigaDesliga }
     * 
     */
    public SetLigaDesliga createSetLigaDesliga() {
        return new SetLigaDesliga();
    }

    /**
     * Create an instance of {@link SetDirecao }
     * 
     */
    public SetDirecao createSetDirecao() {
        return new SetDirecao();
    }

    /**
     * Create an instance of {@link SetListaServicosResponse }
     * 
     */
    public SetListaServicosResponse createSetListaServicosResponse() {
        return new SetListaServicosResponse();
    }

    /**
     * Create an instance of {@link SetDirecaoResponse }
     * 
     */
    public SetDirecaoResponse createSetDirecaoResponse() {
        return new SetDirecaoResponse();
    }

    /**
     * Create an instance of {@link GetListaServicosResponse }
     * 
     */
    public GetListaServicosResponse createGetListaServicosResponse() {
        return new GetListaServicosResponse();
    }

    /**
     * Create an instance of {@link GetListaServicos }
     * 
     */
    public GetListaServicos createGetListaServicos() {
        return new GetListaServicos();
    }

    /**
     * Create an instance of {@link Servico }
     * 
     */
    public Servico createServico() {
        return new Servico();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDirecao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "SetDirecao")
    public JAXBElement<SetDirecao> createSetDirecao(SetDirecao value) {
        return new JAXBElement<SetDirecao>(_SetDirecao_QNAME, SetDirecao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLigaDesliga }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "SetLigaDesliga")
    public JAXBElement<SetLigaDesliga> createSetLigaDesliga(SetLigaDesliga value) {
        return new JAXBElement<SetLigaDesliga>(_SetLigaDesliga_QNAME, SetLigaDesliga.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLigado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "isLigado")
    public JAXBElement<IsLigado> createIsLigado(IsLigado value) {
        return new JAXBElement<IsLigado>(_IsLigado_QNAME, IsLigado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetListaServicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "SetListaServicos")
    public JAXBElement<SetListaServicos> createSetListaServicos(SetListaServicos value) {
        return new JAXBElement<SetListaServicos>(_SetListaServicos_QNAME, SetListaServicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsLigadoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "isLigadoResponse")
    public JAXBElement<IsLigadoResponse> createIsLigadoResponse(IsLigadoResponse value) {
        return new JAXBElement<IsLigadoResponse>(_IsLigadoResponse_QNAME, IsLigadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLigaDesligaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "SetLigaDesligaResponse")
    public JAXBElement<SetLigaDesligaResponse> createSetLigaDesligaResponse(SetLigaDesligaResponse value) {
        return new JAXBElement<SetLigaDesligaResponse>(_SetLigaDesligaResponse_QNAME, SetLigaDesligaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaServicosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "GetListaServicosResponse")
    public JAXBElement<GetListaServicosResponse> createGetListaServicosResponse(GetListaServicosResponse value) {
        return new JAXBElement<GetListaServicosResponse>(_GetListaServicosResponse_QNAME, GetListaServicosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListaServicos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "GetListaServicos")
    public JAXBElement<GetListaServicos> createGetListaServicos(GetListaServicos value) {
        return new JAXBElement<GetListaServicos>(_GetListaServicos_QNAME, GetListaServicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDirecaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "SetDirecaoResponse")
    public JAXBElement<SetDirecaoResponse> createSetDirecaoResponse(SetDirecaoResponse value) {
        return new JAXBElement<SetDirecaoResponse>(_SetDirecaoResponse_QNAME, SetDirecaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetListaServicosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://controller.station.leona.br/", name = "SetListaServicosResponse")
    public JAXBElement<SetListaServicosResponse> createSetListaServicosResponse(SetListaServicosResponse value) {
        return new JAXBElement<SetListaServicosResponse>(_SetListaServicosResponse_QNAME, SetListaServicosResponse.class, null, value);
    }

}
