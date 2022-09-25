package pl.coderslab.charity.donation;

import org.springframework.stereotype.Controller;

@Controller
public class DonationCollector {

    private DonationRepository donationRepository;

    public DonationCollector(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }
}
