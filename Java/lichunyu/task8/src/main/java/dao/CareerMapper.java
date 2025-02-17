package dao;

import org.springframework.stereotype.Repository;
import model.Career;

import java.util.List;

/**
 * 职业方向
 */
@Repository
public interface CareerMapper {
    Career getCareerById(int id);
    List<Career> getAllCareer();
}
