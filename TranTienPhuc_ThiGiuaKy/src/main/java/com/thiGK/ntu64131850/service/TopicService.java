package com.thiGK.ntu64131850.service;

import com.thiGK.ntu64131850.model.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
            new Topic("111" , "Việt Nam Muôn Năm" , "Việt Nam" , "64131850" , "Nhà Nước"),
            new Topic("112" , "Kỷ niệm 2/4" , "Việt Nam" , "64131850" , "Nhà Nước"),
            new Topic("113" , "Biển Nha Trang" , "Việt Nam" , "64131850" , "Thiên nhiên")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }
    public boolean addTopic(Topic topic) {
        return topics.add(topic);
    }
}
