package com.curdoperation.service;

import com.curdoperation.entity.IplTeam;

import java.util.List;


public interface IplService {

    public IplTeam insertdata(IplTeam iplTeam);

    public List<IplTeam> getAllTeams();

    public String updateTeam(int id,IplTeam iplTeam);

    public  String deleteTeam(int id);


}
