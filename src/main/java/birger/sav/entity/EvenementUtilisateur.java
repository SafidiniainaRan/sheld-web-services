package birger.sav.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_evenementutilisateur")
public class EvenementUtilisateur {
    
    @Id
    private int idevenementutilisateur ;
    private int idevenement ;
    private int idutilisateur ;
    private float longitudelocalisation ;
    private float latitudelocalisation ;
    private String lieuevenement ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datedebut ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datefin ;
    private int estActive ;
    private String SSID ;

    public int getIdevenementutilisateur() {
        return idevenementutilisateur;
    }
    public void setIdevenementutilisateur(int idevenementutilisateur) {
        this.idevenementutilisateur = idevenementutilisateur;
    }
    public int getIdevenement() {
        return idevenement;
    }
    public void setIdevenement(int idevenement) {
        this.idevenement = idevenement;
    }
    public int getIdutilisateur() {
        return idutilisateur;
    }
    public void setIdutilisateur(int idutilisateur) {
        this.idutilisateur = idutilisateur;
    }
    public float getLongitudelocalisation() {
        return longitudelocalisation;
    }
    public void setLongitudelocalisation(float longitudelocalisation) {
        this.longitudelocalisation = longitudelocalisation;
    }
    public float getLatitudelocalisation() {
        return latitudelocalisation;
    }
    public void setLatitudelocalisation(float latitudelocalisation) {
        this.latitudelocalisation = latitudelocalisation;
    }
    public String getLieuevenement() {
        return lieuevenement;
    }
    public void setLieuevenement(String lieuevenement) {
        this.lieuevenement = lieuevenement;
    }
    public LocalDateTime getDatedebut() {
        return datedebut;
    }
    public void setDatedebut(LocalDateTime datedebut) {
        this.datedebut = datedebut;
    }
    public LocalDateTime getDatefin() {
        return datefin;
    }
    public void setDatefin(LocalDateTime datefin) {
        this.datefin = datefin;
    }
    public int getEstActive() {
        return estActive;
    }
    public void setEstActive(int estActive) {
        this.estActive = estActive;
    }
    public String getSSID() {
        return SSID;
    }
    public void setSSID(String sSID) {
        SSID = sSID;
    }

}
