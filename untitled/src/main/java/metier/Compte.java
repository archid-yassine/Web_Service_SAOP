package metier;

import jakarta.xml.bind.annotation.*;

import java.util.Date;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code ;
    private double solde;
    @XmlTransient
    private Date dateDeclaration;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public Compte() {
    }

    public Compte(int code, double solde, Date dateDeclaration) {
        this.code = code;
        this.solde = solde;
        this.dateDeclaration = dateDeclaration;
    }
}
