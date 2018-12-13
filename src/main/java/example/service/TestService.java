package example.service;

import example.dao.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestDAO testDAO;

    public String getUser(){
        testDAO.getUserName();
        return "success";
    }
}
