package Zaidimu_Web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagrindinisController {
	
	@Autowired
	private ZaidimuLenteleRepository zaidimu_lentele_repository;
	
	@Autowired
	private KomentaruLenteleRepository komentaru_lentele_repository;
	
	@RequestMapping(path="/pagrindinis", method={ RequestMethod.GET, RequestMethod.POST })
    public String pagrindinis(@RequestParam(name="id", required=false, defaultValue="0") Integer id
    		,Model model) {
		
			model.addAttribute("zaidimai", zaidimu_lentele_repository.findAll());
		
			return "pagrindinis";
			
	}
	
	@RequestMapping(path="/zaidimas", method={ RequestMethod.GET, RequestMethod.POST })
    public String zaidimas(@RequestParam(name="i", required=true, defaultValue="0") String id
    		 , @RequestParam(name="komentaras", required=false, defaultValue="") String komentaras
    		 , @RequestParam(name="prideti", required=false, defaultValue="neprideti") String prideti
			 , Model model) {
		
		Optional<ZaidimuLentele> zaidimu_lentele1 = zaidimu_lentele_repository.findById(Integer.parseInt(id));
		ZaidimuLentele zaidimu_lentele = null;
		if(!zaidimu_lentele1.isEmpty()) {
			
			zaidimu_lentele = zaidimu_lentele1.get();
			
		}
		
		if(prideti.equals("prideti")) {
			
			KomentaruLentele komentaru_lentele = new KomentaruLentele(id, komentaras);
			komentaru_lentele_repository.save(komentaru_lentele);
			return "redirect:zaidimas?i=" + id;
			
		}
		

		
		model.addAttribute("zaidimas", zaidimu_lentele);
		model.addAttribute("komentarai", komentaru_lentele_repository.findAll());
		return "zaidimas";
			
	}
	
	
}
