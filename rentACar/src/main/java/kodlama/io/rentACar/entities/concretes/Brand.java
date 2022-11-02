package kodlama.io.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*Lombook getter setter ve builder da kullanılır.*/
@Table(name = "brands") /*Tabloyu ekle ve kaydet*/
@Getter /*Lombook ekle Data = Getter + Setter */   
@Setter
@AllArgsConstructor    /*parametreli kullanım*/
@NoArgsConstructor   /*Parametresiz kullanım*/
@Entity
public class Brand { 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Primary Key idsi otomatik artan*/
	
	@Column(name = "id")  /*Tablonun kolonları ekleniyor*/
	private int id; //marka id'si
	
	@Column(name = "name")
	private String name; // marka adı
		
}
