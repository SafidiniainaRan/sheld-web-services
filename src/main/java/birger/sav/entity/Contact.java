package birger.sav.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_contact")
public class Contact { 
  @Id
  int idcontact;
  int idtypecontact;
  String numero;
  LocalDateTime datedebut;
  LocalDateTime datefin;
  int estVert;
  int estActive;
  String SSID;
  String codeabrege;
  String description;
  double longitude;
  double latitude;
  String nomContact;

    public int getIdcontact(){
     return this.idcontact;
    }

    public int getIdtypecontact(){
     return this.idtypecontact;
    }

    public String getNumero(){
     return this.numero;
    }

    public LocalDateTime getDatedebut(){
     return this.datedebut;
    }

    public LocalDateTime getDatefin(){
     return this.datefin;
    }

    public int getEstVert(){
     return this.estVert;
    }

    public int getEstActive(){
     return this.estActive;
    }

    public String getSSID(){
     return this.SSID;
    }

    public String getCodeabrege(){
     return this.codeabrege;
    }

    public String getDescription(){
     return this.description;
    }

    public double getLongitude(){
     return this.longitude;
    }

    public double getLatitude(){
     return this.latitude;
    }

    public String getNomContact(){
     return this.nomContact;
    }

    public void setIdcontact( int idcontact ){
      this.idcontact = idcontact;
    }

    public void setIdtypecontact( int idtypecontact ){
      this.idtypecontact = idtypecontact;
    }

    public void setNumero( String numero ){
      this.numero = numero;
    }

    public void setDatedebut( LocalDateTime datedebut ){
      this.datedebut = datedebut;
    }

    public void setDatefin( LocalDateTime datefin ){
      this.datefin = datefin;
    }

    public void setEstVert( int estVert ){
      this.estVert = estVert;
    }

    public void setEstActive( int estActive ){
      this.estActive = estActive;
    }

    public void setSSID( String SSID ){
      this.SSID = SSID;
    }

    public void setCodeabrege( String codeabrege ){
      this.codeabrege = codeabrege;
    }

    public void setDescription( String description ){
      this.description = description;
    }

    public void setLongitude( double longitude ){
      this.longitude = longitude;
    }

    public void setLatitude( double latitude ){
      this.latitude = latitude;
    }

    public void setNomContact( String nomContact ){
      this.nomContact = nomContact;
    }

}