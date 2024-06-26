package Projects.MyProject.Controller.Projects.MyProject;

import Projects.MyProject.ChannelService;
import Projects.MyProject.Model.Channel;
import Projects.MyProject.Model.Incident;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/incident")
public class IncidentController {

    @Autowired
    private ChannelService channelService;

    @GetMapping
    public String showForm(Model model) {
        model.addAttribute("incident", new Incident());
        return "incidentForm";
    }

    @GetMapping("/channels")
    public List<Channel> getChannels() {
        return channelService.getAllChannels();
    }

    @PostMapping
    public String submitForm(Incident incident, Model model) {
        model.addAttribute("incident", incident);
        return "incidentSummary";
    }
}
