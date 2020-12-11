package com.example.demo.topicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


//returning objects from controller
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    //{id} indicates that in the path there is a  variable.
    //id could be any word. At the local host topics/Spring

    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){

        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic){

        topicService.addTopic(topic);
    }
}
