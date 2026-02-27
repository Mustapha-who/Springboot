package tn.esprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Services.ISponsorService;
import tn.esprit.entities.Sponsor;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/sponsor")
public class SponsorController {

    ISponsorService sponsorService;

    @PostMapping("/add-sponsor")
    public Sponsor ajouterSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.ajouterSponsor(sponsor);
    }

    @PostMapping("/add-sponsors")
    public List<Sponsor> ajouterSponsors(@RequestBody List<Sponsor> sponsors) {
        return sponsorService.ajouterSponsors(sponsors);
    }

    @PutMapping("/update-sponsor")
    public Sponsor modifierSponsor(@RequestBody Sponsor sponsor) {
        return sponsorService.modifierSponsor(sponsor);
    }

    @DeleteMapping("/remove-sponsor/{sponsor-id}")
    public void supprimerSponsor(@PathVariable("sponsor-id") Long idSponsor) {
        sponsorService.supprimerSponsor(idSponsor);
    }

    @GetMapping("/retrieve-all-sponsors")
    public List<Sponsor> listSponsors() {
        return sponsorService.listSponsors();
    }

    @GetMapping("/retrieve-sponsor/{sponsor-id}")
    public Sponsor recupererSponsor(@PathVariable("sponsor-id") Long idSponsor) {
        return sponsorService.recupererSponsor(idSponsor);
    }

    @PutMapping("/archive-sponsor/{sponsor-id}")
    public Boolean archiverSponsor(@PathVariable("sponsor-id") Long idSponsor) {
        return sponsorService.archiverSponsor(idSponsor);
    }
}