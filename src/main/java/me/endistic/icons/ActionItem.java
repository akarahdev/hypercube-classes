package me.endistic.icons;

public class ActionItem {
    Object iconType = null;
    String name = "";
    String description = "";
    
    public ActionItem setIconType(Object iconType) {
        return this;
    }
    public ActionItem setName(String name) {
        this.name = name;
        return this;
    }
    public ActionItem setDescription(String description) {
        this.description = description;
        return this;
    }
    public Object getIconType() {
        return this.iconType;
    }
    public String getDescription() {
        return this.description;
    }
}