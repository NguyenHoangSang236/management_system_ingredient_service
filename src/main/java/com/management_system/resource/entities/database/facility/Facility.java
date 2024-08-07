package com.management_system.resource.entities.database.facility;

import com.management_system.resource.infrastucture.constant.FacilityStatusEnum;
import com.management_system.resource.infrastucture.constant.FacilityTypeEnum;
import com.management_system.utilities.entities.database.MongoDbEntity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Document("facilities")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facility extends MongoDbEntity implements Serializable {
    @Id
    String id;

    @Field(name = "name")
    String name;

    @Enumerated(EnumType.STRING)
    @Field(name = "type")
    FacilityTypeEnum type;

    @Field(name = "quantity")
    int quantity;

    @Field(name = "image")
    String image;

    @Field(name = "note")
    String note;

    @Enumerated(EnumType.STRING)
    @Field(name = "status")
    FacilityStatusEnum status;
}
