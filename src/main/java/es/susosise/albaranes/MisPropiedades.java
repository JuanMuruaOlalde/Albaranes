package es.susosise.albaranes;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mispropiedades")
public class MisPropiedades {

    private String googleMapsAPIkey;

    public String getGoogleMapsAPIkey() {
        return this.googleMapsAPIkey;
    }

    public void setGoogleMapsAPIkey(String googleMapsAPIkey) {
        this.googleMapsAPIkey = googleMapsAPIkey;
    }

}
