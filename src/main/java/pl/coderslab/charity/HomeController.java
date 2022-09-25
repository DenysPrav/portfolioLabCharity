package pl.coderslab.charity;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.donation.DonationService;
import pl.coderslab.charity.institution.InstitutionService;

@Controller
@RequiredArgsConstructor
public class HomeController {

    @Autowired
    private InstitutionService institutionService;
    private final DonationService donationService;

    @RequestMapping("/")
    public String homeAction(Model model) {
        model.addAttribute("institutions", institutionService.findAll());
        model.addAttribute("quantity", donationService.sumAllQuantities());
        model.addAttribute("countDonations", donationService.countAllDonations());


        return "index";
    }
}
