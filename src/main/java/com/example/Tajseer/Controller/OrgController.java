package com.example.Tajseer.Controller;

import com.example.Tajseer.Model.Org;
import com.example.Tajseer.Model.Users;
import com.example.Tajseer.View.ServiceImpOrq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/Org")
public class OrgController extends ServiceImpOrq {
    @Autowired
   private ServiceImpOrq orq;

    @Override
    @PostMapping(value = "/Post")
    public Org addOrg(@RequestBody Org org) {
        return orq.addOrg(org);
    }

    @Override
    @GetMapping(value = "/Get")
    public List<Org> getAllOrg() {
        return orq.getAllOrg();
    }

    @Override
    @GetMapping(value = "{/id}")
    public Org getOrg(@PathVariable("id") int id) {
        return orq.getOrg(id);
    }

    @Override
    @DeleteMapping(value = "{/id}")
    public void deletedOrg(int id) {
        orq.deletedOrg(id);
    }

    @Override
    @PutMapping(value = "{/id}")
    public Org updateOrg(@RequestBody Org org,int id) {
        return orq.updateOrg(org, id);
    }
}