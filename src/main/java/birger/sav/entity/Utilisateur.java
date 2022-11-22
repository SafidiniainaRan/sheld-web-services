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
public class Utilisateur {
  @Id
  int idutilisateur;
  String nom;
  String prenom;
  int idgenre;
  int idpays;
  LocalDateTime datedenaissance;
  String adresse;
  String mail;
  String contact;
  String pseudo;
  String motdepasse;
  LocalDateTime dateheureinscription;
  double longitudeinscription;
  double latitudeinscription;
  int idoperateur;
  String wifi;
  String bluetooth;
  String imei;
  String iccid;
  String meid;
  String modem;
  String seid;
  String modele;
  String serietelephone;
  LocalDateTime datedebut;
  LocalDateTime datefin;
  int estActive;
  String SSID;
  String codeabrege;
  String description;

  public int getIdutilisateur() {
    return this.idutilisateur;
  }

  public String getNom() {
    return this.nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public int getIdgenre() {
    return this.idgenre;
  }

  public int getIdpays() {
    return this.idpays;
  }

  public LocalDateTime getDatedenaissance() {
    return this.datedenaissance;
  }

  public String getAdresse() {
    return this.adresse;
  }

  public String getMail() {
    return this.mail;
  }

  public String getContact() {
    return this.contact;
  }

  public String getPseudo() {
    return this.pseudo;
  }

  public String getMotdepasse() {
    return this.motdepasse;
  }

  public LocalDateTime getDateheureinscription() {
    return this.dateheureinscription;
  }

  public double getLongitudeinscription() {
    return this.longitudeinscription;
  }

  public double getLatitudeinscription() {
    return this.latitudeinscription;
  }

  public int getIdoperateur() {
    return this.idoperateur;
  }

  public String getWifi() {
    return this.wifi;
  }

  public String getBluetooth() {
    return this.bluetooth;
  }

  public String getImei() {
    return this.imei;
  }

  public String getIccid() {
    return this.iccid;
  }

  public String getMeid() {
    return this.meid;
  }

  public String getModem() {
    return this.modem;
  }

  public String getSeid() {
    return this.seid;
  }

  public String getModele() {
    return this.modele;
  }

  public String getSerietelephone() {
    return this.serietelephone;
  }

  public LocalDateTime getDatedebut() {
    return this.datedebut;
  }

  public LocalDateTime getDatefin() {
    return this.datefin;
  }

  public int getEstActive() {
    return this.estActive;
  }

  public String getSSID() {
    return this.SSID;
  }

  public String getCodeabrege() {
    return this.codeabrege;
  }

  public String getDescription() {
    return this.description;
  }

  public void setIdutilisateur(int idutilisateur) {
    this.idutilisateur = idutilisateur;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public void setIdgenre(int idgenre) {
    this.idgenre = idgenre;
  }

  public void setIdpays(int idpays) {
    this.idpays = idpays;
  }

  public void setDatedenaissance(LocalDateTime datedenaissance) {
    this.datedenaissance = datedenaissance;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public void setPseudo(String pseudo) {
    this.pseudo = pseudo;
  }

  public void setMotdepasse(String motdepasse) {
    this.motdepasse = motdepasse;
  }

  public void setDateheureinscription(LocalDateTime dateheureinscription) {
    this.dateheureinscription = dateheureinscription;
  }

  public void setLongitudeinscription(double longitudeinscription) {
    this.longitudeinscription = longitudeinscription;
  }

  public void setLatitudeinscription(double latitudeinscription) {
    this.latitudeinscription = latitudeinscription;
  }

  public void setIdoperateur(int idoperateur) {
    this.idoperateur = idoperateur;
  }

  public void setWifi(String wifi) {
    this.wifi = wifi;
  }

  public void setBluetooth(String bluetooth) {
    this.bluetooth = bluetooth;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public void setIccid(String iccid) {
    this.iccid = iccid;
  }

  public void setMeid(String meid) {
    this.meid = meid;
  }

  public void setModem(String modem) {
    this.modem = modem;
  }

  public void setSeid(String seid) {
    this.seid = seid;
  }

  public void setModele(String modele) {
    this.modele = modele;
  }

  public void setSerietelephone(String serietelephone) {
    this.serietelephone = serietelephone;
  }

  public void setDatedebut(LocalDateTime datedebut) {
    this.datedebut = datedebut;
  }

  public void setDatefin(LocalDateTime datefin) {
    this.datefin = datefin;
  }

  public void setEstActive(int estActive) {
    this.estActive = estActive;
  }

  public void setSSID(String SSID) {
    this.SSID = SSID;
  }

  public void setCodeabrege(String codeabrege) {
    this.codeabrege = codeabrege;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Utilisateur() {
  }

  public Utilisateur(int idutilisateur, String nom, String prenom, int idgenre, int idpays,
      LocalDateTime datedenaissance, String adresse, String mail, String contact, String pseudo, String motdepasse,
      LocalDateTime dateheureinscription, double longitudeinscription, double latitudeinscription, int idoperateur,
      String wifi, String bluetooth, String imei, String iccid, String meid, String modem, String seid, String modele,
      String serietelephone, LocalDateTime datedebut, LocalDateTime datefin, int estActive, String SSID,
      String codeabrege, String description) {
    this.idutilisateur = idutilisateur;
    this.nom = nom;
    this.prenom = prenom;
    this.idgenre = idgenre;
    this.idpays = idpays;
    this.datedenaissance = datedenaissance;
    this.adresse = adresse;
    this.mail = mail;
    this.contact = contact;
    this.pseudo = pseudo;
    this.motdepasse = motdepasse;
    this.dateheureinscription = dateheureinscription;
    this.longitudeinscription = longitudeinscription;
    this.latitudeinscription = latitudeinscription;
    this.idoperateur = idoperateur;
    this.wifi = wifi;
    this.bluetooth = bluetooth;
    this.imei = imei;
    this.iccid = iccid;
    this.meid = meid;
    this.modem = modem;
    this.seid = seid;
    this.modele = modele;
    this.serietelephone = serietelephone;
    this.datedebut = datedebut;
    this.datefin = datefin;
    this.estActive = estActive;
    this.SSID = SSID;
    this.codeabrege = codeabrege;
    this.description = description;
  }
}