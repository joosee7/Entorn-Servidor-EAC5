package cat.xtec.ioc.domain;

import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDateTime;

public class Dentista {
    private String codi;
    private Double pacientAcumulat;
    private Double preuPeces;
    private Boolean pacientActual;
    private LocalDateTime datePacient;

    public Dentista(String codi) {
        this.codi = codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getCodi() {
        return codi;
    }

    public void setPacientAcumulat(Double pacientAcumulat) {
        this.pacientAcumulat = pacientAcumulat;
    }

    public Double getPacientAcumulat() {
        return pacientAcumulat;
    }

    public void setPreuPeces(Double preuPeces) {
        this.preuPeces = preuPeces;
    }

    public Double getPreuPeces() {
        return preuPeces;
    }

    public void setPacientActual(Boolean pacientActual) {
        this.pacientActual = pacientActual;
    }

    public Boolean getPacientActual() {
        return pacientActual;
    }
    public void setDatePacient(LocalDateTime datePacient) {
        this.datePacient = datePacient;
    }

    @XmlJavaTypeAdapter(LocalDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    public LocalDateTime getDatePacient() {
        return datePacient;
    }
}
