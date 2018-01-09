import java.util.ArrayList;
import java.util.HashMap;

import models.CdProject;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;
import java.util.Map;

/**
 * Created by Guest on 1/9/18.
 */
public class App {
    public static void main(String[] args) { //type “psvm + tab” to autocreate this :)
        staticFileLocation("/public");

        get("/", (request, response) -> {
            CdProject.clearAllCds();
            Map<String, Object> model = new HashMap<String, Object>();
            String content = request.queryParams("content");
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/display", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String content = request.queryParams("content");
            ArrayList cds = CdProject.getAll();
            model.put("All CDs", cds);
            return new ModelAndView(model, "display.hbs");
        }, new HandlebarsTemplateEngine());

        post("/cds/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String name = request.queryParams("name");
            String artist = request.queryParams("artist");
            CdProject newCdProject = new CdProject(name, artist);
            ArrayList cds = CdProject.getAll();
            model.put("cds", cds);
            return new ModelAndView(model, "display.hbs");
        }, new HandlebarsTemplateEngine());

    }
}