package com.example.Tajseer.Service;

import com.example.Tajseer.Model.Cretifcation;
import com.example.Tajseer.Model.Org;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Service
public interface ServiceCirt {
    public Cretifcation AddServiceCirt(Cretifcation cer);

    List<Cretifcation> getAllServiceCirt();
    public Cretifcation getServiceCirt(int id);
    public void  deletedServiceCirt(int id);
    public Cretifcation updateServiceCirt(Cretifcation cer,int id);
    public Cretifcation uploadCertificate(MultipartFile file);
}
