package SKS.SKS.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import SKS.SKS.dto.CompanyDto;
import SKS.SKS.entities.Company;
import SKS.SKS.exception.ResourceNotFoundException;
import SKS.SKS.mapper.CompanyMapper;
import SKS.SKS.repository.CompanyRepository;
import SKS.SKS.service.CompanyService;

public class CompanyServiceImpl implements CompanyService{
	
	private CompanyRepository companyRepository; //dependency injection

	@Override
	public List<CompanyDto> getAllCompany() {
		
		List<Company> companies = companyRepository.findAll();
		
		return companies.stream().map((company) -> CompanyMapper.mapToCompanyDto(company)).collect(Collectors.toList());
	}

	@Override
	public CompanyDto getCompanyById(Long companyId) {
		
		Company company = companyRepository.findById(companyId)
				.orElseThrow(() -> new ResourceNotFoundException("Verilen kimliğe sahip firma mevcut değil" + companyId));
		
		return CompanyMapper.mapToCompanyDto(company);
	}

	@Override
	public CompanyDto updateCompany(Long CompanyId, CompanyDto updateCompany) {
		
		Company company = companyRepository.findById(CompanyId)
				.orElseThrow(() -> new ResourceNotFoundException("Verilen kimliğe sahip firma mevcut değil" + CompanyId));
		
		company.setCompanyName(updateCompany.getCompanyName());
		company.setPhoneNumber(updateCompany.getPhoneNumber());
		company.setEmail(updateCompany.getEmail());
		company.setTaxOffice(updateCompany.getTaxOffice());
		company.setTaxNumber(updateCompany.getTaxNumber());
		company.setAddress(updateCompany.getAddress());
		
		Company newCompany = companyRepository.save(company);
		
		return CompanyMapper.mapToCompanyDto(newCompany);
	}

	@Override
	public void deleteCompany(Long CompanyId) {
		
		Company company = companyRepository.findById(CompanyId)
				.orElseThrow(() -> new ResourceNotFoundException("Verilen kimliğe sahip firma mavcut değil" + CompanyId));
		
		companyRepository.deleteById(CompanyId);
		
		
	}

	@Override
	public CompanyDto createCompany(CompanyDto companyDto) {
		
		Company company = CompanyMapper.mapToCompany(companyDto);
		
		Company savedCompany = companyRepository.save(company);
		
		return CompanyMapper.mapToCompanyDto(savedCompany);
	}

}
