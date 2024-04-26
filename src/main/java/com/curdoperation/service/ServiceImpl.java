package com.curdoperation.service;

import com.curdoperation.entity.IplTeam;
import com.curdoperation.repository.IplRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements IplService {

    @Autowired
    IplRepository iplRepository;

    @Override
    public IplTeam insertdata(IplTeam iplTeam) {

        return iplRepository.save(iplTeam);

    }

    @Override
    public List<IplTeam> getAllTeams() {

        List<IplTeam> teams=iplRepository.findAll();
        return teams;
    }

    @Override
    public String updateTeam(int id,IplTeam iplTeam) {

        IplTeam existingTeam =iplRepository.findById(id).get();

        existingTeam.setName(iplTeam.getName());
        existingTeam.setTrophies(iplTeam.getTrophies());
        existingTeam.setCaptainName(iplTeam.getCaptainName());

        iplRepository.save(existingTeam);

        return "update data successfully..........." ;
    }

    @Override
    public String deleteTeam(int id) {

        IplTeam existingTeam =iplRepository.findById(id).get();
        iplRepository.delete(existingTeam);
        return "data deleted successfully........";

    }
}
