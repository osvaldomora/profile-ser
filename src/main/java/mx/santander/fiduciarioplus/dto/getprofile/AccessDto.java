package mx.santander.fiduciarioplus.dto.getprofile;



import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.santander.fiduciarioplus.dto.enums.IdAccess;
@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccessDto implements Serializable
{
	 @JsonProperty("description")
	private String description;
    @JsonProperty("id")
	private IdAccess idAccess;
    private final static long serialVersionUID = 2946154698645133645L;

}
