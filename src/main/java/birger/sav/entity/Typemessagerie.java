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
@Table(name = "t_typemessagerie_grp")
@Entity
public class Typemessagerie {

    @Id
    private int idtypemessagerie ; 
    private String label ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datedebut ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datefin ;
    private String estActive ;
    private String SSID ;

    public int getIdtypemessagerie() {
        return idtypemessagerie;
    }
    public void setIdtypemessagerie(int idtypemessagerie) {
        this.idtypemessagerie = idtypemessagerie;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
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
    public String getEstActive() {
        return estActive;
    }
    public void setEstActive(String estActive) {
        this.estActive = estActive;
    }
    public String getSSID() {
        return SSID;
    }
    public void setSSID(String sSID) {
        SSID = sSID;
    }
    
}
