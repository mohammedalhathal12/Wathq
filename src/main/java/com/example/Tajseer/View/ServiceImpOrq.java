package com.example.Tajseer.View;

import com.example.Tajseer.Model.Org;
import com.example.Tajseer.Repostiry.RepOrg;
import com.example.Tajseer.Service.SerivesOrg;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceImpOrq implements SerivesOrg {
    @Autowired
    private RepOrg rep;


    @Override
    public Org addOrg(Org org) {
        return rep.save(org);
    }

    @Override
    public List<Org> getAllOrg() {
        return rep.findAll();
    }

    @Override
    public Org getOrg(int id) {
        return rep.findById(id).get();
    }

    @Override
    public void deletedOrg(int id) {
     rep.deleteById(id);
    }

    @Override
    public Org updateOrg(Org org, int id) {
         org.setId(id);
        return rep.save(org);
    }
}
