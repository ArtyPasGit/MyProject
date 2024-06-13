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
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/rest/incident")
public class IncidentRestController {

    @Autowired
    private ChannelService channelService;


   @GetMapping("/channels/name")
    public List<String> getChannelsNames() {
        return channelService.getAllChannels().stream()
                .map(Channel::getChannelName).collect(Collectors.toList());
    }

    @GetMapping("/channels")
    public List<Channel> getChannels() {
        return channelService.getAllChannels();
    }

}
