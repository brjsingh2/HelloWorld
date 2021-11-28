package com.brj.poc.restService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public final class RootController {

    @Value("${spring.application.name:spring_app_name_unset:Boot-Swagger}") String applicationName;
    @Value("#{new java.util.Date()}") Date deployTime;
    @Value("${info.build.version: v1.0}")String buildVersion;
    @Value("${info.build.time: 12:12:12}") String buildTime;

    @GetMapping(value = "/")
    public @ResponseBody
    String root() {
        List<String> lines = new ArrayList<>();
        lines.add("<!DOCTYPE html>");
        lines.add("<html lang=\"en\">");
        lines.add("<head>");
        lines.add("<meta charset=\"utf-8\">");
        lines.add("<meta name=\"description\" value=\"".concat(applicationName).concat(" (spring boot application)\">"));
        lines.add("<meta name=\"author\" value=\"Ocm\">");
        lines.add("<title>".concat(applicationName).concat("</title>"));
        lines.add("</head>");
        lines.add("<body>");
        lines.add("<h1>".concat(applicationName).concat("</h1>"));
        lines.add("<h3>Dashboards and Tools</h3>");
        lines.add("<ul>");
        lines.add("<li><strong>Swagger UI:</strong> <a href=\"/swagger-ui.html\">/swagger-ui.html</a></li>");
        lines.add("<li><strong>Health:</strong> <a href=\"/actuator/health\">/health</a></li>");
        lines.add("</ul>");
        lines.add("<h3>Deployment Information</h3>");
        lines.add("<ul>");
        lines.add("<li><strong>Date:</strong> " + deployTime + "</li>");
        lines.add("<li><strong>Version:</strong> " + buildVersion + " (" + buildTime + ")</li>");
        lines.add("</ul>");
        lines.add("</body>");
        lines.add("</html>");
        return String.join("", lines);
    }
}
