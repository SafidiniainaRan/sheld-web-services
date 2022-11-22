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
@Table(name = "t_messagerie")
@Entity
public class Messagerie {

    @Id
    private int idmessagerie ;
    private int idtypemessagerie ;
    private int idcategoriemessagerie ;
    private int processmessagerie ;
    private String contactsend ;
    private String contactreceive ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateheureenvoi ;
    private int importance ;
    private String contenu ;
    private int enreponsemessagerie ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datedebut ;
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime datefin ;
    private String estActive ;
    private String SSID ;

    public int getIdmessagerie() {
        return idmessagerie;
    }
    public void setIdmessagerie(int idmessagerie) {
        this.idmessagerie = idmessagerie;
    }
    public int getIdtypemessagerie() {
        return idtypemessagerie;
    }
    public void setIdtypemessagerie(int idtypemessagerie) {
        this.idtypemessagerie = idtypemessagerie;
    }
    public int getIdcategoriemessagerie() {
        return idcategoriemessagerie;
    }
    public void setIdcategoriemessagerie(int idcategoriemessagerie) {
        this.idcategoriemessagerie = idcategoriemessagerie;
    }
    public int getProcessmessagerie() {
        return processmessagerie;
    }
    public void setProcessmessagerie(int processmessagerie) {
        this.processmessagerie = processmessagerie;
    }
    public String getContactsend() {
        return contactsend;
    }
    public void setContactsend(String contactsend) {
        this.contactsend = contactsend;
    }
    public String getContactreceive() {
        return contactreceive;
    }
    public void setContactreceive(String contactreceive) {
        this.contactreceive = contactreceive;
    }
    public LocalDateTime getDateheureenvoi() {
        return dateheureenvoi;
    }
    public void setDateheureenvoi(LocalDateTime dateheureenvoi) {
        this.dateheureenvoi = dateheureenvoi;
    }
    public int getImportance() {
        return importance;
    }
    public void setImportance(int importance) {
        this.importance = importance;
    }
    public String getContenu() {
        return contenu;
    }
    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
    public int getEnreponsemessagerie() {
        return enreponsemessagerie;
    }
    public void setEnreponsemessagerie(int enreponsemessagerie) {
        this.enreponsemessagerie = enreponsemessagerie;
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
