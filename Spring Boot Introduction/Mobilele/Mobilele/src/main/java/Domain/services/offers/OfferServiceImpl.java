package services.offers;

import org.springframework.stereotype.Service;
import services.init.DataBaseInitServiceService;
@Service
public class OfferServiceImpl implements OfferService, DataBaseInitServiceService {
    @Override
    public void dbInit() {

    }

    @Override
    public boolean isDbInit() {
        return false;
    }
}
