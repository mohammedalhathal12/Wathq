package com.example.Tajseer.View;

import com.example.Tajseer.Model.Cretifcation;
import com.example.Tajseer.Model.Org;
import com.example.Tajseer.Repostiry.RepCreti;
import com.example.Tajseer.Service.ServiceCirt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpCirt implements ServiceCirt {
     @Autowired
    private RepCreti s;

    @Override
    public Cretifcation AddServiceCirt(Cretifcation cer) {
        return s.save(cer);
    }

    @Override
    public List<Cretifcation> getAllServiceCirt() {
        return s.findAll();
    }

    @Override
    public Cretifcation getServiceCirt(int id) {
        return s.findById(id).get();
    }

    @Override
    public void deletedServiceCirt(int id) {
        s.deleteById(id);
    }

    @Override
    public Cretifcation updateServiceCirt(Cretifcation cer, int id) {
        return s.save(cer);    }

}
