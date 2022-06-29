package Zaidimu_Web;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ZaidimuLentele {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	private String zaidimo_pavadinimas;
	private String logo_failas;
	
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="id_zaidimo", referencedColumnName="id", insertable=false, updatable=false)    
    private List<KomentaruLentele> komentaru_lentele;
	
	public ZaidimuLentele() {
		
		super();

	}
	
	public ZaidimuLentele(String zaidimo_pavadinimas) {
		
		super();
		this.zaidimo_pavadinimas = zaidimo_pavadinimas;
		
	}

	public List<KomentaruLentele> getKomentaru_lentele() {
		return komentaru_lentele;
	}

	public void setKomentaru_lentele(List<KomentaruLentele> komentaru_lentele) {
		this.komentaru_lentele = komentaru_lentele;
	}

	public Integer getId() {
		
		return id;
		
	}

	public void setId(Integer id) {
		
		this.id = id;
		
	}

	public String getZaidimo_pavadinimas() {
		
		return zaidimo_pavadinimas;
		
	}

	public void setZaidimo_pavadinimas(String zaidimo_pavadinimas) {
		
		this.zaidimo_pavadinimas = zaidimo_pavadinimas;
		
	}

	public String getLogo_failas() {
		
		return logo_failas;
		
	}

	public void setLogo_failas(String logo_failas) {
		
		this.logo_failas = logo_failas;
		
	}	
	
}
