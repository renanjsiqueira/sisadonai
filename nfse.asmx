<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://notacarioca.rio.gov.br/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://notacarioca.rio.gov.br/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://notacarioca.rio.gov.br/">
      <s:element name="ConsultarNfseRequest">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="outputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfsePorRpsRequest">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarNfsePorRpsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="outputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarLoteRpsRequest">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarLoteRpsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="outputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarSituacaoLoteRpsRequest">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ConsultarSituacaoLoteRpsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="outputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteRpsRequest">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="RecepcionarLoteRpsResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="outputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelarNfseRequest">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CancelarNfseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="outputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GerarNfseRequest">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="inputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="GerarNfseResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="outputXML" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="ConsultarNfseSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarNfseRequest" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfseSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarNfseResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfsePorRpsSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarNfsePorRpsRequest" />
  </wsdl:message>
  <wsdl:message name="ConsultarNfsePorRpsSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarNfsePorRpsResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarLoteRpsSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarLoteRpsRequest" />
  </wsdl:message>
  <wsdl:message name="ConsultarLoteRpsSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarLoteRpsResponse" />
  </wsdl:message>
  <wsdl:message name="ConsultarSituacaoLoteRpsSoapIn">
    <wsdl:part name="parameters" element="tns:ConsultarSituacaoLoteRpsRequest" />
  </wsdl:message>
  <wsdl:message name="ConsultarSituacaoLoteRpsSoapOut">
    <wsdl:part name="parameters" element="tns:ConsultarSituacaoLoteRpsResponse" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteRpsSoapIn">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteRpsRequest" />
  </wsdl:message>
  <wsdl:message name="RecepcionarLoteRpsSoapOut">
    <wsdl:part name="parameters" element="tns:RecepcionarLoteRpsResponse" />
  </wsdl:message>
  <wsdl:message name="CancelarNfseSoapIn">
    <wsdl:part name="parameters" element="tns:CancelarNfseRequest" />
  </wsdl:message>
  <wsdl:message name="CancelarNfseSoapOut">
    <wsdl:part name="parameters" element="tns:CancelarNfseResponse" />
  </wsdl:message>
  <wsdl:message name="GerarNfseSoapIn">
    <wsdl:part name="parameters" element="tns:GerarNfseRequest" />
  </wsdl:message>
  <wsdl:message name="GerarNfseSoapOut">
    <wsdl:part name="parameters" element="tns:GerarNfseResponse" />
  </wsdl:message>
  <wsdl:portType name="NfseSoap">
    <wsdl:operation name="ConsultarNfse">
      <wsdl:input message="tns:ConsultarNfseSoapIn" />
      <wsdl:output message="tns:ConsultarNfseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfsePorRps">
      <wsdl:input message="tns:ConsultarNfsePorRpsSoapIn" />
      <wsdl:output message="tns:ConsultarNfsePorRpsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteRps">
      <wsdl:input message="tns:ConsultarLoteRpsSoapIn" />
      <wsdl:output message="tns:ConsultarLoteRpsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ConsultarSituacaoLoteRps">
      <wsdl:input message="tns:ConsultarSituacaoLoteRpsSoapIn" />
      <wsdl:output message="tns:ConsultarSituacaoLoteRpsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteRps">
      <wsdl:input message="tns:RecepcionarLoteRpsSoapIn" />
      <wsdl:output message="tns:RecepcionarLoteRpsSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CancelarNfse">
      <wsdl:input message="tns:CancelarNfseSoapIn" />
      <wsdl:output message="tns:CancelarNfseSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="GerarNfse">
      <wsdl:input message="tns:GerarNfseSoapIn" />
      <wsdl:output message="tns:GerarNfseSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="NfseSoap" type="tns:NfseSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="ConsultarNfse">
      <soap:operation soapAction="http://notacarioca.rio.gov.br/ConsultarNfse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarNfsePorRps">
      <soap:operation soapAction="http://notacarioca.rio.gov.br/ConsultarNfsePorRps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarLoteRps">
      <soap:operation soapAction="http://notacarioca.rio.gov.br/ConsultarLoteRps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ConsultarSituacaoLoteRps">
      <soap:operation soapAction="http://notacarioca.rio.gov.br/ConsultarSituacaoLoteRps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="RecepcionarLoteRps">
      <soap:operation soapAction="http://notacarioca.rio.gov.br/RecepcionarLoteRps" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CancelarNfse">
      <soap:operation soapAction="http://notacarioca.rio.gov.br/CancelarNfse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="GerarNfse">
      <soap:operation soapAction="http://notacarioca.rio.gov.br/GerarNfse" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="Nfse">
    <wsdl:port name="NfseSoap" binding="tns:NfseSoap">
      <soap:address location="https://homologacao.notacarioca.rio.gov.br/WSNacional/nfse.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>