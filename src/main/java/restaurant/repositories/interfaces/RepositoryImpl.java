package restaurant.repositories.interfaces;

import javax.swing.text.html.parser.Entity;
import java.util.Collection;
import java.util.Collections;

public class RepositoryImpl implements Repository{

Collection<Entity> entities;

    @Override
    public Collection getAllEntities() {
        return Collections.unmodifiableCollection(getAllEntities());
    }

    @Override
    public void add(Object entity) {
entities.add((Entity) entity);
    }
}
