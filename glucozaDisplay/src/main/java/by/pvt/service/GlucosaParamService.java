package by.pvt.service;


import by.pvt.pojo.GlucosaParam;

import by.pvt.repo.GlucosaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GlucosaParamService {

    @Autowired
    GlucosaRepo glucosaParamRepository;


    @Transactional
    public GlucosaParam getCurrentParam() {

        return glucosaParamRepository.getCurrentResult();

    }
}
