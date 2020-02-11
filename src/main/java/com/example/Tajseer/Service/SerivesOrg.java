package com.example.Tajseer.Service;

import com.example.Tajseer.Model.Org;
import com.example.Tajseer.Model.Users;

import java.util.List;

public interface SerivesOrg {
    public Org addOrg(Org org);

    List<Org> getAllOrg();
    public Org getOrg(int id);
    public void  deletedOrg(int id);
    public Org updateOrg(Org org,int id);

}
