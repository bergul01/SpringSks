package SKS.SKS.mapper;

import SKS.SKS.dto.CompanyDto;
import SKS.SKS.entities.Company;

public class CompanyMapper {

	public static CompanyDto mapToCompanyDto(Company company) {
		
		return new CompanyDto(
				company.getId(),
				company.getCompanyName(),
				company.getPhoneNumber(),
				company.getEmail(),
				company.getTaxOffice(),
				company.getTaxNumber(),
				company.getAddress()
				);	
	}
	
	public static Company mapToCompany(CompanyDto companyDto) {
		
		return new Company(
				companyDto.getId(),
				companyDto.getCompanyName(),
				companyDto.getPhoneNumber(),
				companyDto.getEmail(),
				companyDto.getTaxOffice(),
				companyDto.getTaxNumber(),
				companyDto.getAddress()
				);
		
	}
	
}
