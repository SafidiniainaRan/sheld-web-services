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
@Table(name = "T_typecontact_grp")
public class Typecontact { 
  @Id
  int idtypecontact;
  String label;
  LocalDateTime datedebut;
  LocalDateTime datefin;
  int estActive;
  String SSID;
  String codeabrege;
  String description;

    public int getIdtypecontact(){
     return this.idtypecontact;
    }

    public String getLabel(){
     return this.label;
    }

    public LocalDateTime getDatedebut(){
     return this.datedebut;
    }

    public LocalDateTime getDatefin(){
     return this.datefin;
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

    public void setIdtypecontact( int idtypecontact ){
      this.idtypecontact = idtypecontact;
    }

    public void setLabel( String label ){
      this.label = label;
    }

    public void setDatedebut( LocalDateTime datedebut ){
      this.datedebut = datedebut;
    }

    public void setDatefin( LocalDateTime datefin ){
      this.datefin = datefin;
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
}