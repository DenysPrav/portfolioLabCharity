package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DonationService {

    private final DonationRepository donationRepository;

    public long sumAllQuantities() {
        return donationRepository.findAll().stream()
                .map(Donation::getQuantity)
                .collect(Collectors.summarizingInt(Integer::intValue))
                .getSum();
    }

    public long countAllDonations() {

        return donationRepository.count();
    }
}