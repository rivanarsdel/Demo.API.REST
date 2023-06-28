package dev.RIV.Demo.API.REST.modelDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//To reduce boilerplate, these are common Lombok annotations. Intellij features an auto-generator mode, but this is even better since I only need to change the variables themselves and do not have to re-generate everything else.
//Note; as this is NOT a persistent object, we are not calling JPA. This provides us with the ability to sanitize inputs when we take these fields and pop them over to the persistent version of this object.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class GenericDTO {

    int genericId;
    String genericHash;
    String genericName;
    String genericPayload;
}
