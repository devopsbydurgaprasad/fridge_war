package flipkart.bean;

import com.jsmartframework.web.annotation.WebBean;

import flipkart.auth.MyAuthBean;
import flipkart.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.inject.Inject;

@WebBean
public class HomeBean {

    @Autowired
    private SpringService springService;

    @Inject
    private MyAuthBean myAuthBean;

    public String doLogout() {
        myAuthBean.invalidateAuth();
        return "/login";
    }

}