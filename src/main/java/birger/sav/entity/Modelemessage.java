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
@Table(name = "t_modelemessage_grp")
public class Modelemessage {
    
    @Id
    private int idmodelemessage ;
    private String contenu ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datedebut ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datefin ;
    private String estActive ;
    private String SSID ;

    public int getIdmodelemessage() {
        return idmodelemessage;
    }
    public void setIdmodelemessage(int idmodelemessage) {
        this.idmodelemessage = idmodelemessage;
    }
    public String getContenu() {
        return contenu;
    }
    public void setContenu(String contenu) {
        this.contenu = contenu;
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
