package SKS.SKS.service;

import java.util.List;

import SKS.SKS.dto.VehicleDto;

public interface VehicleService {

	VehicleDto getVehicleById(Long vehicleId);
	
	List<VehicleDto> getAllVehicle();
	
	VehicleDto updateVehicle(Long vehicleId, VehicleDto updateVehicle);
	
	void deleteVehicle(Long vehicleId);
	
	VehicleDto createVehicle(VehicleDto vehicleDto);
}
