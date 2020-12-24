package dev.malb.petclinic_data.services.map;

import dev.malb.petclinic_data.model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity,ID extends Long> {
    protected Map<Long,T> map = new HashMap<Long,T>();
    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){
        if(object != null) {
            if (object.getId() == null){
                object.setId(getNextID());
            }
            map.put(object.getId(),object);
        }
        return object;
    }
    void deleteById(ID id){
        map.remove(id);
    }
    void delete(T object){
        map.entrySet().removeIf( e -> e.getValue().equals(object));
    }
    private Long getNextID(){
        return map.isEmpty() ? 1L : Collections.max(map.keySet()) + 1;
    }
}
