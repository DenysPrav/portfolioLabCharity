package pl.coderslab.charity.category;

import org.springframework.stereotype.Controller;

@Controller
public class CategoryCollector {

       private CategoryRepository categoryRepository;

    public CategoryCollector(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
