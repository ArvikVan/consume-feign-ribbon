package arv.consumefeignribbon;

import arv.consumefeignribbon.models.User;
import arv.consumefeignribbon.service.UsersService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * @author ArvikV
 * @version 1.0
 * @since 02.06.2022
 */
@Route("")
public class UserList extends VerticalLayout {
    public UserList(UsersService service) {

        var grid = new Grid<User>(User.class);
        grid.setItems(service.getALLInfoUsers());
        grid.setColumns("name", "phone", "website", "company.name");
        add(grid);
    }
}
