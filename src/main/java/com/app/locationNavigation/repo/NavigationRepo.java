package com.app.locationNavigation.repo;

import com.app.locationNavigation.Dto.NavigationDto;
import com.app.locationNavigation.model.Navigation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface NavigationRepo extends JpaRepository<Navigation, Integer>{

    @Query(value = "select new com.app.locationNavigation.Dto.NavigationDto(nav.id,nav.deviceId,d.name,d.category,d.type,d.status,nav.locationId,l.name) " +
            "from Navigation nav " +
            "left join Device d on d.id=nav.deviceId " +
            "left join Location l on l.id=nav.locationId " +
            "where d.status is not null group by d.id order by nav.id desc")
    List<NavigationDto> getLatestNavigationOfAllDevice();

}
