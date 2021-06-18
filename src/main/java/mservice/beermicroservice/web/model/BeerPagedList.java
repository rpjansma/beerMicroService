package mservice.beermicroservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class BeerPagedList extends PageImpl {

    public BeerPagedList(List content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public BeerPagedList(List content) {
        super(content);
    }
}
