package dev.jotxee.security.comunity.services;

import dev.jotxee.security.comunity.repository.Floor;

import java.util.List;

public interface FloorService {
    List<Floor> getFloors();
    void createFloor(Floor floor);
    void deleteFloor(Integer floor_id);

    Floor getFloor(Integer floor_id);

    Floor findFloorByUserId(Integer user_id);
}
