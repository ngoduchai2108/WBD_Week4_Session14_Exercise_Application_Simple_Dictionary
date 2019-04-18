package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @PostMapping("/dictionary")
    public String dictionary(String english, Model model){
        Map<String,String> dictionary = new HashMap<>();
        dictionary.put("hello","Xin CHao");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        String vietnamese = dictionary.get(english);
        model.addAttribute("english",english);
        model.addAttribute("vietnamese",vietnamese);
        return "index";
    }
    @GetMapping("/dictionary")
    public String getDictionary(){
        return "index";
    }
}
