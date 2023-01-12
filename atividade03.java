package servicos;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPinding;
import javax.jws.soap.SOAPinding.Style;

    @WebService
    @SOAPinding(style = Style.RPC)

public interface BancoServer {
    @WebMethod String pegarBoleto(String codigoBarras);
    @WebMethod String criarBoleto(float valor, String cpfCliente);
    @WebMethod boolean verificarPagamentos(String codigoBarras);
    @WebMethod boolean cancelarBoleto(String codigoBarras);
}

