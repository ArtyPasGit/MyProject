package Projects.MyProject.Controller.Projects.MyProject;

import Projects.MyProject.Model.Incident;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/incident")
public class IncidentController {

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("incident", new Incident());
        return "incidentForm";
    }

    @PostMapping
    public String submitForm(Incident incident, Model model) {
        model.addAttribute("incident", incident);
        return "incidentSummary";
    }
}