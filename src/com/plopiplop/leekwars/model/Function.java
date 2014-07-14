package com.plopiplop.leekwars.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Function {
    public String name;
    public String description;
    public boolean isConstant;

    public Map<String, String> parameters = new LinkedHashMap<>();
    public Map<String, String> returns = new LinkedHashMap<>();

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsConstant() {
        return isConstant;
    }

    public Map<String, String> getParameters() {
        return parameters;
    }

    public Map<String, String> getReturns() {
        return returns;
    }

    @Override
    public String toString() {
        return "Function{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", parameters=" + parameters +
                '}';
    }
}
