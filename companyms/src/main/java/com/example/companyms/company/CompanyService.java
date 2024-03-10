package com.example.companyms.company;

import com.example.companyms.company.dto.ReviewMessage;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CompanyService {
    List<Company> getAllCompanies();
    boolean updateCompany(Long id, Company company);

    public void updateCompanyRating(ReviewMessage reviewMessage);

    void createCompany(Company company);

    boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}
