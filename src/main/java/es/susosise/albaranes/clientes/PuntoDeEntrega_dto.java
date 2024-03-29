package es.susosise.albaranes.clientes;

public class PuntoDeEntrega_dto {
    private String aliasIdentificativo;
    private String poblacion;
    private String zonaOpoligono;
    private String calle;
    private String portal;
    private String pisoYmano;
    private String telefonoDeContacto;
    private Double latitud;
    private Double longitud;

    public PuntoDeEntrega_dto(PuntoDeEntrega unPunto) {
        this.aliasIdentificativo = unPunto.getAliasIdentificativo();
        this.poblacion = unPunto.getPoblacion().toString();
        this.zonaOpoligono = unPunto.getZonaOpoligono();
        this.calle = unPunto.getCalle();
        this.portal = unPunto.getPortal();
        this.pisoYmano = unPunto.getPisoYmano();
        this.telefonoDeContacto = unPunto.getTelefonoDeContacto();
        this.latitud = unPunto.getLatitud();
        this.longitud = unPunto.getLongitud();
    }

    public String getAliasIdentificativo() {
        return aliasIdentificativo;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getZonaOpoligono() {
        return zonaOpoligono;
    }

    public String getCalle() {
        return calle;
    }

    public String getPortal() {
        return portal;
    }

    public String getPisoYmano() {
        return pisoYmano;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public Double getLatitud() {
        return latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

}
