import play.api.mvc.EssentialFilter;
import play.filters.cors.CORSFilter;
import play.http.HttpFilters;

import javax.inject.Inject;

public class Filters implements HttpFilters {

    @Inject
    CORSFilter corsFilter;

    public EssentialFilter[] getFilters() {
        return new EssentialFilter[] { corsFilter };
    }
}