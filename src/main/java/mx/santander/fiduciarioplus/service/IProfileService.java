package mx.santander.fiduciarioplus.service;

import mx.santander.fiduciarioplus.dto.getprofile.DataProfileResDto;
import mx.santander.fiduciarioplus.model.profile.Profile;

public interface IProfileService {
	public DataProfileResDto convert(String buc);



	// METHOD TO TEST, THIS WILL BE DELETED
	public void saveData();

}
