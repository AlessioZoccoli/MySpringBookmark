package bookmark.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/*
* Rest resource
* */
@RepositoryRestResource
public interface BookmarkRepository extends CrudRepository<Bookmark, Long>
{
}