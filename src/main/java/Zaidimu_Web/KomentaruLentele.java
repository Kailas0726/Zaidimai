package Zaidimu_Web;

import java.math.BigInteger;
import java.time.LocalDateTime;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

//import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ColumnDefault;
//import org.hibernate.annotations.GenerationTime;

@Entity
public class KomentaruLentele {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String komentaras;
	
	@Column(name = "data")
	@ColumnDefault(value="CURRENT_TIMESTAMP")
	@Generated(GenerationTime.INSERT)
	private String data;
	
	private Integer id_zaidimo;
	private Long user_id;
	
	 @ManyToOne
	 @JoinColumn(name="id_zaidimo", referencedColumnName="id", insertable=false, updatable=false)
	 private ZaidimuLentele zaidimu_lentele;
	 
	 @ManyToOne
	 @JoinColumn(name="user_id", referencedColumnName="id", insertable=false, updatable=false)
	 private User user;
	
	public KomentaruLentele() {
		
		super();

	}
	
	public KomentaruLentele(String id_zaidimo, String komentaras) {
		
		super();
		this.id_zaidimo = Integer.parseInt(id_zaidimo);
		this.komentaras = komentaras;
		//this.user_id = Long.parseLong(user_id);
		
	}

	public User getUser() {
		
		return user;
		
	}

	public void setUser(User user) {
		
		this.user = user;
		
	}

	public ZaidimuLentele getZaidimu_lentele() {
		
		return zaidimu_lentele;
		
	}

	public void setZaidimu_lentele(ZaidimuLentele zaidimu_lentele) {
		
		this.zaidimu_lentele = zaidimu_lentele;
		
	}

	public Integer getId() {
		
		return id;
		
	}

	public void setId(Integer id) {
		
		this.id = id;
		
	}

	public String getKomentaras() {
		
		return komentaras;
		
	}

	public void setKomentaras(String komentaras) {
		
		this.komentaras = komentaras;
		
	}

	public String getData() {
		
		return data;
		
	}

	public void setData(String data) {
		
		this.data = data;
		
	}

	public Integer getId_zaidimo() {
		
		return id_zaidimo;
		
	}

	public void setId_zaidimo(Integer id_zaidimo) {
		
		this.id_zaidimo = id_zaidimo;
		
	}

	public Long getUser_id() {
		
		return user_id;
		
	}

	public void setUser_id(Long user_id) {
		
		this.user_id = user_id;
		
	}
	
	
	
}
