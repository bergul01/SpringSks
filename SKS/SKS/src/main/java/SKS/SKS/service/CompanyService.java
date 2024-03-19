package SKS.SKS.service;

import java.util.List;

import SKS.SKS.dto.CompanyDto;

public interface CompanyService {
	
	List<CompanyDto> getAllCompany();
	
	CompanyDto getCompanyById(Long companyId);
	
	CompanyDto updateCompany(Long CompanyId, CompanyDto updateCompany);
	
	void deleteCompany(Long CompanyId);
	
	CompanyDto createCompany(CompanyDto companyDto);

}
