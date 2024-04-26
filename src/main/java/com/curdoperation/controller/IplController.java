package com.curdoperation.controller;

import com.curdoperation.entity.IplTeam;
import com.curdoperation.service.IplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path ="/api/operation")
public class IplController {

    @Autowired
    IplService service;

    @PostMapping(path = "/insert")
    public IplTeam inserdata( @RequestBody IplTeam iplTeam)
    {
        return service.insertdata(iplTeam);

    }

    @GetMapping(path = "/all")
    public List<IplTeam> getAll()
    {
        List<IplTeam> teams =service.getAllTeams();
        return teams;
    }



    @PutMapping(path ="/update/{id}" )

    public String update( @PathVariable int id, @RequestBody IplTeam iplTeam)
    {
        return service.updateTeam(id,iplTeam);

    }

    @DeleteMapping(path = "/delete/{id}")
    public String deleteTeam(@PathVariable int id)
    {
       return service.deleteTeam(id);
    }
}
