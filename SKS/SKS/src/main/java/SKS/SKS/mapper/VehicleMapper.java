package SKS.SKS.mapper;

import SKS.SKS.dto.VehicleDto;
import SKS.SKS.entities.Vehicle;

public class VehicleMapper {

	public static VehicleDto mapToVehicleDto(Vehicle vehicle) {
		
		return new VehicleDto(
					vehicle.getId(),
					vehicle.getVehicleType(),
					vehicle.getDriverName(),
					vehicle.getDriverPhone(),
					vehicle.getTowPlate(),
					vehicle.getTrailerPlate()
				);
	}
	
	public static Vehicle mapToVehicle(VehicleDto vehicleDto) {
		
		return new Vehicle(
					vehicleDto.getId(),
					vehicleDto.getVehicleType(),
					vehicleDto.getDriverName(),
					vehicleDto.getDriverPhone(),
					vehicleDto.getTowPlate(),
					vehicleDto.getTrailerPlate()
				);
	}
	
}
