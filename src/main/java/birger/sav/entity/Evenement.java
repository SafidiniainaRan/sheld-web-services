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
@Table(name = "t_evenement_grp")
public class Evenement {

    @Id
    private int idevenement ;
    private String label ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateajout ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datedebut ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datefin ;
    private int estActive ;
    private String SSID ;

    public int getIdevenement() {
        return idevenement;
    }
    public void setIdevenement(int idevenement) {
        this.idevenement = idevenement;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public LocalDateTime getDateajout() {
        return dateajout;
    }
    public void setDateajout(LocalDateTime dateajout) {
        this.dateajout = dateajout;
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
