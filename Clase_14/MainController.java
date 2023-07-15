package atl.course.trivia;

import atl.course.trivia.entities.Category;
import atl.course.trivia.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    CategoryRepository categoryRepository;


    @GetMapping("/search-category/{id}")
    public Category getSearch(@PathVariable Long id){

        Category search = categoryRepository.findById(id);

        return search;


    };
    @GetMapping("/category/{id}")
    public Category getCategory(@PathVariable String id){



        List<Category> resultado = new ArrayList<>();

        Category ejemplo = categoryRepository.findById(1L);
        resultado.add(ejemplo);
        return ejemplo;

    }

}
