package Zaidimu_Web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagrindinisController {
	
	@RequestMapping(path="/pagrindinis", method={ RequestMethod.GET, RequestMethod.POST })
    public String pagrindinis(
			 Model model) {

			
			return "pagrindinis";
			
			}
	
	@RequestMapping(path="/csgo", method={ RequestMethod.GET, RequestMethod.POST })
    public String csgo(
			 Model model) {

			
			return "csgo";
			
			}
	
	@RequestMapping(path="/gta", method={ RequestMethod.GET, RequestMethod.POST })
    public String gta(
			 Model model) {

			
			return "gta";
			
			}
	
	@RequestMapping(path="/fifa", method={ RequestMethod.GET, RequestMethod.POST })
    public String fifa(
			 Model model) {

			
			return "fifa";
			
			}
	
	@RequestMapping(path="/nba", method={ RequestMethod.GET, RequestMethod.POST })
    public String nba(
			 Model model) {

			
			return "nba";
			
			}
	
	@RequestMapping(path="/wot", method={ RequestMethod.GET, RequestMethod.POST })
    public String wot(
			 Model model) {

			
			return "wot";
			
			}
	
	@RequestMapping(path="/valorant", method={ RequestMethod.GET, RequestMethod.POST })
    public String valorant(
			 Model model) {

			
			return "valorant";
			
			}

	@RequestMapping(path="/lol", method={ RequestMethod.GET, RequestMethod.POST })
    public String lol(
			 Model model) {

			
			return "lol";
			
			}
	
	@RequestMapping(path="/minecraft", method={ RequestMethod.GET, RequestMethod.POST })
    public String minecraft(
			 Model model) {

			
			return "minecraft";
			
			}
	
	@RequestMapping(path="/sot", method={ RequestMethod.GET, RequestMethod.POST })
    public String sot(
			 Model model) {

			
			return "sot";
			
			}
	
	@RequestMapping(path="/rss6", method={ RequestMethod.GET, RequestMethod.POST })
    public String rss6(
			 Model model) {

			
			return "rss6";
			
			}
	
	@RequestMapping(path="/pubg", method={ RequestMethod.GET, RequestMethod.POST })
    public String pubg(
			 Model model) {

			
			return "pubg";
			
			}
	
	@RequestMapping(path="/dbd", method={ RequestMethod.GET, RequestMethod.POST })
    public String dbd(
			 Model model) {

			
			return "dbd";
			
			}
	
	@RequestMapping(path="/thread", method={ RequestMethod.GET, RequestMethod.POST })
    public String thread(
			 Model model) {

			
			return "thread";
			
			}
	
}
