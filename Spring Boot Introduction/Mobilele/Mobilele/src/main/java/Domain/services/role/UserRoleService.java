package services.role;

import Domain.dtos.veiw.UserRoleViewDto;
import services.init.DataBaseInitServiceService;

import java.util.List;

public interface UserRoleService extends DataBaseInitServiceService {
    List<UserRoleViewDto> getAll();
}
