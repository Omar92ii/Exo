package composants;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import outils.ListeUtilisateurDTO;
import outils.UtilisateurDTO;

@ManagedBean(name = "bean", eager = true)
@ApplicationScoped
public class ComposantsJSF {

	private List<UtilisateurDTO> util = null;

	public ComposantsJSF() {
		super();

	}

	@PostConstruct
	public void init() {

		Client client = ClientBuilder.newClient();
		WebTarget cible = client.target(UriBuilder.fromPath("http://tomcatauthentificateur:8080/listeur"));
		WebTarget ciblefinale = cible.path("listedto");
		ListeUtilisateurDTO dtoliste = ciblefinale.request(MediaType.APPLICATION_XML).get(ListeUtilisateurDTO.class);
		util = new ArrayList<>(dtoliste.getListedto());
	}

	public List<UtilisateurDTO> getUtil() {
		return util;
	}

	public void setUtil(List<UtilisateurDTO> util) {
		this.util = util;
	}
	
	

}
