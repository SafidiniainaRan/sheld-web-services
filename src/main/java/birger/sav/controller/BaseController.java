package birger.sav.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public class BaseController {

    /*
     * Utils METHODS
     */
    public Object[] getParameters(HttpServletRequest request, String[] parameters) {
        Object[] result = new Object[parameters.length];
        for (int i=0; i<parameters.length; i++) result[i] = request.getParameter(parameters[i]);
        return result ;
    }
    
}
