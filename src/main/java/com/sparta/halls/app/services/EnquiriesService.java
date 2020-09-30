package com.sparta.halls.app.services;

import com.sparta.halls.app.entities.Enquiries;
import com.sparta.halls.app.repositories.EnquiriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnquiriesService {
    private final EnquiriesRepository enquiriesRepository;

    @Autowired
    public EnquiriesService(EnquiriesRepository enquiriesRepository) {
        this.enquiriesRepository = enquiriesRepository;
    }
    public void addTestEnquiry(){
        Enquiries enquiries = new Enquiries();
        //enquiries.setEnquiryId(1);
        enquiries.setEnquirerName("testname");
        enquiries.setEnquirerEmail("testemail");
        enquiries.setEnquiryContent("testcontent");
        enquiries.setEnquirerNumber("testnumber");
        enquiries.setHallId(1);
        addEnquiry(enquiries);

    }
    public boolean addEnquiry(Enquiries enquiry){
        enquiriesRepository.save(enquiry);
        return true;
    }
}
