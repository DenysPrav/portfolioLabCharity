package pl.coderslab.charity.institution;

import org.springframework.stereotype.Controller;

@Controller
public class InstitutionCollector {

    private InstitutionRepository institutionRepository;

    public InstitutionCollector(InstitutionRepository institutionRepository) {
        this.institutionRepository = institutionRepository;
    }
}
