package emlakburada.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressRequest {
	private String province;
	private String district;
	private String neighborhood;
	private String address;
}
